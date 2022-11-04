package entities;

public class Discipline {

    private Integer id;
    private String name;
    private Integer durationHour;

    public Discipline() {
    }

    public Discipline(Integer id, String name, Integer durationHour) {
        this.id = id;
        this.name = name;
        this.durationHour = durationHour;
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

    public Integer getDurationHour() {
        return durationHour;
    }

    public void setDurationHour(Integer durationHour) {
        this.durationHour = durationHour;
    }
}
