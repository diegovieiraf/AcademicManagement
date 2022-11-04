package entities;

import java.math.BigDecimal;


public abstract class Employee {

    private String name;
    private String address;
    private String telNumber;
    private String cpf;
    private String ctps;
    private BigDecimal salary;

    public Employee() {
    }

    public Employee(String name, String address, String telNumber, String cpf, String ctps, BigDecimal salary) {
        this.name = name;
        this.address = address;
        this.telNumber = telNumber;
        this.cpf = cpf;
        this.ctps = ctps;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
