package com.actions.emislabbackend.model.employees;

import com.actions.emislabbackend.model.WorkType;

public class EmployeeStrategy {

    public static double distributeToEmployees(IEmployee employee, WorkType workType) {
        return employee.distributeAmount(workType);
    }
}
