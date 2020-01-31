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
     * @param studentNo 학생 일련번호 파라미터로 특정학생의 시험응시 리스트를 가져온다
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
     * @param schoolNo 학교 파라미터로 모든 시험리스트 중 특정학교로 범위를 좁힌다
     * @param gardeNo  학년 파라미터로 특정학교 전체 시험 리스트 중 특정학년으로 범위를 좁힌다
     * @param model
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
     * @param studentNo 특정 학생 일련번호로 학생이 응시한 시험 리스트를 가져올 수 있게 한다
     * @param examNo
     * @param model
     * @return
     */
    @RequestMapping(value = "/exam/{examNo}/student/{studentNo}")
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