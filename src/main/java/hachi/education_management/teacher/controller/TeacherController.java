package hachi.education_management.teacher.controller;

import hachi.education_management.teacher.model.Teacher;
import hachi.education_management.teacher.model.TeacherSubject;
import hachi.education_management.teacher.service.TeacherService;
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
 * 선생님 컨트롤러
 */
@Controller
@RequestMapping(value = "/teacher")
public class TeacherController {

    public static final String VIEW = "/education_management/teacher";

    @Autowired
    private TeacherService teacherService;

    /**
     * 선생님 등록 기능처리
     * @param teacher
     * @param model
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@Valid @ModelAttribute Teacher teacher, Model model, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("errorMessage", "정확히 입력해주세요");
            return "/common/error";
        }
        int teacherNo = teacherService.add(teacher);
        return "redirect:/" + teacherNo;
    }

    /**
     * 선생님 등록 페이지
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPage() {
        return VIEW + "/add";
    }

    /**
     * 선생님 상세 페이지
     */
    @RequestMapping(value = "/{teacherNo}", method = RequestMethod.GET)
    public String findByTeacherNo(Model model, @PathVariable int teacherNo){
        model.addAttribute("teacher", teacherService.findByTeacherNo(teacherNo));
        return VIEW + "/detail";
    }

    /**
     * 선생님과 과목 같이 나오는 메소드
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/list-with-subject", method = RequestMethod.GET)
    public String listWithSubject(Model model) {
        List<TeacherSubject> list = teacherService.getTeacherListWithSubject();
        model.addAttribute("teacherList", list);
        return VIEW + "/list-with-subject";
    }

    /**
     * 선생님과 과목 같이 나오는 메소드
     * @param model
     * @return
     */
    @RequestMapping(value = "/list-with-subject-aggregation", method = RequestMethod.GET)
    public String listWithSubjectAggregation(Model model) {
        List<Teacher> list = teacherService.findTeacherListWithSubjectAggregation();
        model.addAttribute("teacherList", list);
        return VIEW + "/list-with-subject-aggregation";
    }
}