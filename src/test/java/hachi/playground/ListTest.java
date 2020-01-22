package hachi.playground;

import hachi.education_management.student.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public void listTest() {
        List<Object> list = new ArrayList<>();

        list.add(1);
        list.add("2");

        Student s = (Student) list.get(0);

    }


}
