package hachi.education_management.school.controller;

import hachi.education_management.common.response.ProcessResponse;
import hachi.education_management.school.controller.request.SchoolSearchParameter;
import hachi.education_management.school.controller.response.SchoolListResponseDatatable;
import hachi.education_management.school.model.School;
import hachi.education_management.school.service.SchoolService;
import hachi.education_management.school.vo.GradeClassWithSchool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/school")
public class

SchoolController {

    public static final String VIEW_DIR_PATH = "/education_management/school";

    @Autowired
    private SchoolService schoolService;

    /**
     * 학교 등록 화면
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPage() {
        return VIEW_DIR_PATH + "/add";
    }

    /**
     * 학교 등록 처리
     * @param school
     * @param model
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@Valid @ModelAttribute  School school, Model model, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("errorMessage", "입력값이 비정상입니다.");
            return "/common/error";
        }

        long schoolNo = schoolService.add(school);
        return "redirect:/school/" + schoolNo;
    }

    /**
     * 학교 상세 조회
     * @param model
     * @param schoolNo
     * @return
     */
    @RequestMapping(value = "/{schoolNo}", method = RequestMethod.GET)
    public String detail(Model model, @PathVariable long schoolNo) {
        model.addAttribute("school", schoolService.findByNo(schoolNo));
        return VIEW_DIR_PATH + "/detail";
    }

    /**
     * 학교 리스트 Json 응답 방식
     * (binding=false)옵션을 주면, 안넘어오는 항목은 무시(ignore)하고 넘어온 값만 잘 세팅해줌
     * @return
     */
    @RequestMapping(value = "/list.json", method = RequestMethod.GET)
    @ResponseBody
    public List<School> listJson(@ModelAttribute(binding = false) SchoolSearchParameter schoolSearchParameter) {
        return schoolService.findAll(schoolSearchParameter);
    }

    /**
     * 학교 리스트 Json 응답 방식
     * (binding=false)옵션을 주면, 안넘어오는 항목은 무시(ignore)하고 넘어온 값만 잘 세팅해줌
     * @return
     */
    @RequestMapping(value = "/list.json.datatable", method = RequestMethod.GET)
    @ResponseBody
    public SchoolListResponseDatatable listJsonDatatable (
            @ModelAttribute(binding = false)
            SchoolSearchParameter schoolSearchParameter
    ) {
        List<School> schoolList = schoolService.findAll(schoolSearchParameter);
        return new SchoolListResponseDatatable(schoolList);
    }

    /**
     * 학교 리스트 화면
     * @param model
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(@ModelAttribute(binding = false) SchoolSearchParameter schoolSearchParameter, Model model) {
        List<School> schoolList = schoolService.findAll(schoolSearchParameter);
        model.addAttribute("schoolList", schoolList);
        model.addAttribute("schoolSearchParameter",schoolSearchParameter);
        return VIEW_DIR_PATH + "/list";
    }

    @RequestMapping(value = "/modify/{schoolNo}", method = RequestMethod.GET)
    public String modifyPage(@PathVariable long schoolNo, Model model) {

        School school = schoolService.findByNo(schoolNo);
        model.addAttribute("school", school);
        return VIEW_DIR_PATH + "/modify";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modify(@ModelAttribute School school, Model model) {
        boolean isSucess = schoolService.modify(school);
        if (isSucess) {
            return "redirect:/school/" + school.getSchoolNo();
        } else {
            model.addAttribute("errorMessage", "학교 정보 수정에 실패했습니다.");
            return "/common/alertAndBack";
        }
    }


    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    @ResponseBody
    public ProcessResponse remove(@RequestParam("schoolNo")  long schoolNo) {
        try {
            schoolService.remove(schoolNo);
        } catch(Exception e) {
            return new ProcessResponse(false, e.getMessage());
        }
        return new ProcessResponse(true, "");
    }

    @RequestMapping(value = "/{schoolNo}/grade-class/{year}", method = RequestMethod.GET)
    public String findByGradeClass(@PathVariable long schoolNo, Model model) {
        List<GradeClassWithSchool> gradeClassWithSchoolList = schoolService.findByGradeClass(schoolNo);
        model.addAttribute("gradeClassWithSchool", gradeClassWithSchoolList);
        return VIEW_DIR_PATH + "/school-grade-list";
    }
}
