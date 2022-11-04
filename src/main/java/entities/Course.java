package entities;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private Integer id;
    private String name;
    private Integer durationSemester;

    private List<Discipline> disciplines;

    public Course() {
    }

    public Course(Integer id, String name, Integer durationSemester) {
        this.id = id;
        this.name = name;
        this.durationSemester = durationSemester;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDurationSemester() {
        return durationSemester;
    }

    public void setDurationSemester(Integer durationSemester) {
        this.durationSemester = durationSemester;
    }
}
