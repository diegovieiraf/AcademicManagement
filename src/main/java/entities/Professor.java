package entities;

import java.math.BigDecimal;

public class Professor extends Employee {

    private String title;
    private String fieldResearch;

    public Professor() {
        super();
    }

    public Professor(String name, String address, String telNumber, String cpf, String ctps, BigDecimal salary, String title, String fieldResearch) {
        super(name, address, telNumber, cpf, ctps, salary);
        this.title = title;
        this.fieldResearch = fieldResearch;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFieldResearch() {
        return fieldResearch;
    }

    public void setFieldResearch(String fieldResearch) {
        this.fieldResearch = fieldResearch;
    }
}
