package hachi.education_management.student.controller;

import hachi.education_management.student.model.Student;
import hachi.education_management.student.service.StudentService;
import hachi.education_management.student.vo.StudentWithGradeClassForStudentDetailAndList;
import hachi.education_management.student.ws.request.StudentCreateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    public static final String VIEW = "/education_management/student";

    @Autowired
    private StudentService studentService;


    /**
     * 학생 등록 처리
     * @param studentCreateDto
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
        List<StudentWithGradeClassForStudentDetailAndList> studentList = studentService.findByStudentNoWithGradeClass();
        model.addAttribute("studentList", studentList);
        return VIEW + "/list";
    }

    /**
     * 학생 리스트의 상세 조회
     * @param model
     * @param studentNo
     * @return
     */
    @RequestMapping(value = "/{studentNo}", method = RequestMethod.GET)
    public String studentDetail(Model model, @PathVariable long studentNo) {
        StudentWithGradeClassForStudentDetailAndList studentWithGradeClassForStudentDetailAndList = studentService.detail(studentNo);
        model.addAttribute("studentWithGradeClassForStudentDetailAndList", studentWithGradeClassForStudentDetailAndList);
        return VIEW + "/detail";
    }
}