package hachi.education_management.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 로그아웃을 하기위한 컨트롤러
 */
@Controller
public class LogoutController {
    /**
     * 로그아웃 화면처리
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute("teacher");
        return "redirect:/home";
    }
}
