package com.actions.emislabbackend.model;

import com.actions.emislabbackend.model.employees.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperationTeeth {

    private int id;
    private String medic;
    private String patient;
    private WorkType worktype;
    private int teethNr;
    private double timeea;
    private double paula;
    private double emi;

    public OperationTeeth(int id, String medic, String patient, WorkType worktype, int teethNr) {
        this.id = id;
        this.medic = medic;
        this.patient = patient;
        this.worktype = worktype;
        this.teethNr = teethNr;

        setTimeea(this.teethNr * EmployeeStrategy.distributeToEmployees(new Timeea(), this.worktype));
        setPaula(this.teethNr * EmployeeStrategy.distributeToEmployees(new Paula(), this.worktype));
        setEmi(this.teethNr * EmployeeStrategy.distributeToEmployees(new Emi(), this.worktype));
    }
}

