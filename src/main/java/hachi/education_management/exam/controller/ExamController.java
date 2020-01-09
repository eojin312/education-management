package hachi.education_management.exam.controller;

import hachi.education_management.exam.service.ExamService;
import hachi.education_management.exam.vo.Exam;
import hachi.education_management.exam.vo.ExamStudentApply;
import hachi.education_management.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/exams")
public class ExamController {

    public static final String EXAM = "/education_management/exam";

    @Autowired
    private ExamService examService;

    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "/student/{studentNo}", method = RequestMethod.GET)
    public String studentExamApplyList(@PathVariable("studentNo") long studentNo, Model model) {
        List<ExamStudentApply> studentApplyList = examService.findByExamApplyAndStudent(studentNo);
        model.addAttribute("studentApplies", studentApplyList);
        return EXAM + "/student-exam-apply-list";
    }

    @RequestMapping(value = "/school/{schoolNo}//{grade}")
    public String list(@PathVariable("grade") int garde, Model model) {
        schoolService.findByNo(1);

        List<Exam> examList = examService.findByExam(garde);
        model.addAttribute("examList", examList);
        return "exam-list";
    }
}