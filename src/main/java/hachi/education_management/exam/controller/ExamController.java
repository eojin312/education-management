package hachi.education_management.exam.controller;

import hachi.education_management.exam.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/exam")
public class ExamController {

    @Autowired
    private ExamService examService;

    @RequestMapping(value = "/list")
    public String list() {
        return null;
    }

}
