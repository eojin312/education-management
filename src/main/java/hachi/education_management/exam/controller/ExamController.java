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

/**
 * 시험 컨트롤러
 */
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

    /**
     * 특정 학생 시험응시 리스트 화면
     * 학생 일련번호 파라미터
     *
     * @param studentNo
     * @param model
     * @return
     */
    @RequestMapping(value = "/student/{studentNo}", method = RequestMethod.GET)
    public String studentExamApplyList(@PathVariable("studentNo") long studentNo, Model model) {
        StudentWithGradeClassForStudentDetailAndList studentWithGradeClassForStudentDetailAndList = studentService.detail(studentNo);
        model.addAttribute("student", studentWithGradeClassForStudentDetailAndList);

        List<ExamStudentApply> studentApplyList = examService.findExamApplyListByStudentApplyNo(studentNo);
        model.addAttribute("studentApplyList", studentApplyList);
        return EXAM + "/student-exam-apply-list";
    }

    /**
     * 학년마다 등록된 시험
     *
     * @param gardeNo
     * @param schoolNo
     * @param model
     * @return TODO : grade 를 gradeNo 로 변경
     */
    @RequestMapping(value = "/school/{schoolNo}/{gradeNo}")
    public String list(@PathVariable("gradeNo") int gardeNo, @PathVariable("schoolNo") long schoolNo, Model model) {
        School school = schoolService.findByNo(schoolNo);
        model.addAttribute("school", school);

        List<ExamList> examList = examService.findExamListByGradeNo(gardeNo);
        model.addAttribute("examList", examList);
        return EXAM + "/exam-list";
    }

    /**
     * 특정 학생 시험 성적
     *
     * @param examNo
     * @param studentNo
     * @param model
     * @return
     */
    @RequestMapping(value = "/exam/{examNo}/student/{studentNo}")
    public String examDetail(@PathVariable("examNo") int examNo, @PathVariable("studentNo") long studentNo, Model model) {
        List<ExamDetail> examDetailList = examService.findExamDeatilByExamNo(examNo);
        model.addAttribute("examDetail", examDetailList);
        return EXAM + "/student-exam-detail";
    }

    /**
     * 시험 정보 추가
     * @param exam
     * @param model
     * @return
     */

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@Valid @ModelAttribute Exam exam, Model model) {
        int examNo = examService.insert(exam);
        return "redirect:/exam/" + examNo;
    }

    /**
     * 시험 정보 추가 화면
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPage() {
        return EXAM + "/add";
    }

}