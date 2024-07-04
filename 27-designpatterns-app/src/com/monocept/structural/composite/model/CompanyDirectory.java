package com.monocept.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements IEmployee {
    private List<IEmployee> employees;

    public CompanyDirectory() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(IEmployee employee) {
        employees.add(employee);
    }

    public void removeEmployee(IEmployee employee) {
        employees.remove(employee);
    }

    @Override
    public void showEmployeeDetails() {
        for (IEmployee employee : employees) {
            employee.showEmployeeDetails();
        }
    }
}
