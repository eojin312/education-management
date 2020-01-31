package hachi.education_management.common.controller;

import hachi.education_management.common.request.LoginUser;
import hachi.education_management.teacher.exception.NoSuchTeacherException;
import hachi.education_management.teacher.model.Teacher;
import hachi.education_management.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 로그인을 하기위한 컨트롤러
 */

@Controller
public class LoginController {

    @Autowired
    private TeacherService teacherService;

    /**
     * 로그인 화면처리
     * 유저가 작성한 아이디와 비밀번호 데이터를 담기 위한 파라미터
     *
     * @param loginUser
     * @param model
     * @param request
     * @return
     */
    @PostMapping("/login")
    public String login(@ModelAttribute LoginUser loginUser, Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        try {
            Teacher teacher = teacherService.checkTeacherAndGet(loginUser.getUserId(), loginUser.getUserPwd());
            // 세션을 만들어주고
            session.setAttribute("teacher", teacher);

        } catch (NoSuchTeacherException e) {
            //로그인 실패
            model.addAttribute("errorMessage", "존재하지 않는 아이디거나 비밀번호가 잘못되었습니다. 다시 로그인해주세요");
            return "/education_management/common/alertAndBack";
        }

        // 로그인 후 화면으로 이동
        return "redirect:/home";
    }
}