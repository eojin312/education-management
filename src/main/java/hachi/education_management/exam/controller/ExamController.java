package hachi.education_management.exam.controller;

import hachi.education_management.exam.model.Exam;
import hachi.education_management.exam.service.ExamService;
import hachi.education_management.exam.vo.ExamList;
import hachi.education_management.exam.vo.ExamDetail;
import hachi.education_management.exam.vo.ExamStudentApply;
import hachi.education_management.school.model.School;
import hachi.education_management.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 시험정보 관련 컨트롤러
 */
@Controller
@RequestMapping(value = "/exams")
public class ExamController {

    public static final String EXAM = "/education_management/exam";

    @Autowired
    private ExamService examService;

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
    public String eachStudentExamDetail(@PathVariable("examNo") int examNo, @PathVariable("studentNo") long studentNo, Model model) {
        List<ExamDetail> examDetailList = examService.getExamDeatilListByExamNoAndStudentNo(examNo, studentNo);
        model.addAttribute("examDetail", examDetailList);
        return EXAM + "/student-exam-detail";
    }

    /**
     * 시험 등록 처리
     * @param exam
     * @return
     */

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@Valid @ModelAttribute Exam exam) {
        int examNo = examService.insert(exam);
        // TODO 시험일련번호로 시험 상세 화면보기 화면을 만들어야한다
        return "redirect:/exams/" + examNo;
    }

    /**
     * 시험 상세 화면
     *
     * @param examNo
     * @param model
     * @return
     */
    @RequestMapping(value = "/exam/{examNo}")
    public String examDetail(@PathVariable("examNo") int examNo, Model model) {
        return EXAM + "/detail";
    }

    /**
     * 시험 정보 등록 화면
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPage() {
        return EXAM + "/add";
    }
}