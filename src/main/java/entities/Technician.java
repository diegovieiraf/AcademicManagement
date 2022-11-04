package entities;

import java.math.BigDecimal;

public class Technician extends Employee {

    private String position;
    private String department;

    public Technician() {
        super();
    }

    public Technician(String name, String address, String telNumber, String cpf, String ctps, BigDecimal salary, String position, String department) {
        super(name, address, telNumber, cpf, ctps, salary);
        this.position = position;
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
