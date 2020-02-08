package hachi.education_management.student.controller;

import hachi.education_management.common.response.ListResponse;
import hachi.education_management.student.model.Student;
import hachi.education_management.student.service.StudentService;
import hachi.education_management.student.vo.StudentDetail;
import hachi.education_management.student.ws.request.StudentCreateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 학생 컨트롤러
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    public static final String VIEW = "/education_management/student";

    @Autowired
    private StudentService studentService;


    /**
     * 학생 등록 처리
     * @param studentCreateDto 학년반과 학생을 등록하기 위한 파라미터
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute StudentCreateDto studentCreateDto) {

        Student student = new Student(
                studentCreateDto.getName()
                , studentCreateDto.getJuminNo()
                , studentCreateDto.getSex()
                , studentCreateDto.getId()
                , studentCreateDto.getPwd()
        );

        final long studentNo = studentService.createStudent(student, studentCreateDto.getGradeClassNo());
        return "redirect:/student/" + studentNo;
    }

    /**
     * 학생 등록 페이지
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addpage() {
        return VIEW + "/add";
    }

    /**
     * 학생 조회
     * @param model
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        List<StudentDetail> studentDetailList = studentService.getStudentDetailList();
        model.addAttribute("studentDetailList", studentDetailList);
        return VIEW + "/list";
    }


    /**
     * 학생리스트 jqgrid용
     *
     * @param rows 한페이지당 보여줄 행의 개수
     * @param page 조회할 페이지 번호
     * @param sord 정렬 기준 (asc | desc)
     * @return
     */
    @RequestMapping(value = "/list.jq", method = RequestMethod.GET)
    @ResponseBody
    public ListResponse<StudentDetail> list4JqGrid(
            @RequestParam(value = "rows", required = false, defaultValue = "10") int rows
            , @RequestParam(value = "page", required = false, defaultValue = "1") int page
            , @RequestParam(value = "sord", required = false, defaultValue = "desc") String sord
    ) {
        return studentService.getStudentDetailList(page, rows, sord);
    }

    /**
     * 학생 리스트의 상세 조회
     * @param model
     * @param studentNo 학생 일련번호로 리스트 갖고오는 파라미터
     * @return
     */
    @RequestMapping(value = "/{studentNo}", method = RequestMethod.GET)
    public String studentDetail(Model model, @PathVariable long studentNo) {
        StudentDetail studentDetail = studentService.findStudentDetailByStudentNo(studentNo);
        model.addAttribute("studentDetail", studentDetail);
        return VIEW + "/detail";
    }

    @GetMapping("/test/jsp")
    public String testJsp() {

        return VIEW + "/test";
    }
}