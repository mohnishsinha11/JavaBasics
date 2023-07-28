package org.example.collections.sort;

// This class is used as an example for understanding Comparator
public class Emp{
    private String name;
    private int empId;
    private String phone;

    public Emp(String name, int empId, String phone) {
        this.name = name;
        this.empId = empId;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", phone='" + phone + '\'' +
                '}';
    }
}
