package hachi.education_management.exam.controller;

import hachi.education_management.exam.service.ExamService;
import hachi.education_management.exam.vo.Exam;
import hachi.education_management.exam.vo.ExamStudentApply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/exam")
public class ExamController {

    public static final String EXAM = "/education_management/exam";
    @Autowired
    private ExamService examService;

    @RequestMapping(value = "/exam-apply-list/{studentNo}", method = RequestMethod.GET)
    public String studentExamApplyList(@PathVariable long studentNo, Model model) {
        List<ExamStudentApply> studentApplyList = examService.findByExamApplyAndStudent(studentNo);
        model.addAttribute("studentApplies", studentApplyList);
        return EXAM + "/student-exam-apply-list";
    }

    @RequestMapping(value = "/list")
    public String list(@PathVariable int garde, Model model) {
        List<Exam> examList = examService.findByExam(garde);
        model.addAttribute("examList", examList);
        return "exam-list";
    }
}