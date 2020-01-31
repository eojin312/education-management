package hachi.education_management.common.controller;

import hachi.education_management.common.request.LoginUser;
import hachi.education_management.student.model.Student;
import hachi.education_management.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class StudentLoginController {
    /**
     * 학생용 로그인을 위한 컨트롤러
     */
    @Autowired
    private StudentService studentService;

    /**
     * 학생용 로그인 처리
     * @param loginUser 유저가 작성한 아이디와 비밀번호 데이터를 담기 위한 파라미터
     * @param request
     * @return
     */
    @PostMapping("/loginstudent")
    public String login(@ModelAttribute LoginUser loginUser, HttpServletRequest request) {
        HttpSession session = request.getSession();

        Student student = studentService.checkStudentAndGet(loginUser.getUserId(), loginUser.getUserPwd());
        session.setAttribute("student", student);
        return "redirect:/home";
    }

}
