package com.example.club;

public class EmployeeBean {

    private String empId;


    public EmployeeBean(){
    }

    public EmployeeBean(String empId) {
        this.empId= empId;

    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId= empId;
    }


}
