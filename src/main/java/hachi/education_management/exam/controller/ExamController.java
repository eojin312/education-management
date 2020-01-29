package hachi.education_management.exam.controller;

import hachi.education_management.exam.model.Exam;
import hachi.education_management.exam.service.ExamService;
import hachi.education_management.exam.vo.ExamList;
import hachi.education_management.exam.vo.ExamDetail;
import hachi.education_management.exam.vo.ExamStudentApply;
import hachi.education_management.school.model.School;
import hachi.education_management.school.service.SchoolService;
import hachi.education_management.student.service.StudentService;
import hachi.education_management.student.vo.StudentWithGradeClassForStudentDetailAndList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/exams")
public class ExamController {

    public static final String EXAM = "/education_management/exam";

    @Autowired
    private ExamService examService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "/student/{studentNo}", method = RequestMethod.GET)
    public String studentExamApplyList(@PathVariable("studentNo") long studentNo, Model model) {
        StudentWithGradeClassForStudentDetailAndList studentWithGradeClassForStudentDetailAndList = studentService.detail(studentNo);
        model.addAttribute("student", studentWithGradeClassForStudentDetailAndList);

        List<ExamStudentApply> studentApplyList = examService.findByExamApplyAndStudent(studentNo);
        model.addAttribute("studentApplyList", studentApplyList);
        return EXAM + "/student-exam-apply-list";
    }

    @RequestMapping(value = "/school/{schoolNo}/{grade}")
    public String list(@PathVariable("grade") int garde, @PathVariable("schoolNo") long schoolNo, Model model) {
        School school = schoolService.findByNo(schoolNo);
        model.addAttribute("school", school);

        List<ExamList> examList = examService.findByExam(garde);
        model.addAttribute("examList", examList);
        return EXAM + "/exam-list";
    }

    @RequestMapping(value = "/exam/{examNo}/student/{studentNo}")
    public String examDetail(@PathVariable("examNo") int examNo, @PathVariable("studentNo") long studentNo, Model model) {
        List<ExamDetail> examDetailList = examService.findByExamDeatilForStudent(examNo);
        model.addAttribute("examDetail", examDetailList);
        return EXAM + "/student-exam-detail";
    }

    /**
     * @Valid 원천적으로 등록 오류를 피하기 위해 객체 자체에 검증모델 주입하는 방식을 채택하고 있다.
     * 대상 객체의 확인 조건을 만족할 경우 통과 가능
     */

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@Valid @ModelAttribute Exam exam, Model model) {
        int examNo = examService.insert(exam);
        return "redirect:/exam/" + examNo;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPage() {
        return EXAM + "/add";
    }

}