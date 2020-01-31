package hachi.education_management.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * sitemesh exclude 를 적용시키기 위한 테스트 컨트롤러
 */
@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/login")
    public String loginPage() {
        return "/education_management/member/login";
    }
}
