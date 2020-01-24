package hachi.education_management.home.controller;

import hachi.education_management.student.model.Student;
import hachi.education_management.teacher.model.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    //localhost/ 하면 바로 home 페이지가 나오는 기능
    @GetMapping("/")
    public String index() {
        return "redirect:/home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();

        Teacher loginedTeacher = (Teacher) session.getAttribute("teacher");
        Student loginedStudent = (Student) session.getAttribute("student");
        model.addAttribute("loginedTeacher", loginedTeacher);
        model.addAttribute("loginedStudent", loginedStudent);
        return "/education_management/educationhome/home";
    }

    @RequestMapping(value = "/home-sbadmin", method = RequestMethod.GET)
    public String homeSbAdmin(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();

        Teacher loginedTeacher = (Teacher) session.getAttribute("teacher");
        Student loginedStudent = (Student) session.getAttribute("student");
        model.addAttribute("loginedTeacher", loginedTeacher);
        model.addAttribute("loginedStudent", loginedStudent);
        return "/sbadmin/index/home";
    }
}
