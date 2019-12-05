package hachi.education_management.school.controller.response;

import hachi.education_management.school.model.School;

import java.util.List;

public class SchoolListResponseDatatable {
    private List<School> data;

    public SchoolListResponseDatatable(List<School> data) {
        this.data = data;
    }

    public List<School> getData() {
        return data;
    }
}
