package com.actions.emislabbackend.model;


import com.actions.emislabbackend.model.employees.Emi;
import com.actions.emislabbackend.model.employees.EmployeeStrategy;
import com.actions.emislabbackend.model.employees.Paula;
import com.actions.emislabbackend.model.employees.Timeea;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Dental_jobs")
public class OperationTeeth {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String medic;
    @Column
    private String patient;
    @Column
    private WorkType worktype;
    @Column
    private int teethNr;
    @Column
    private double timeea;
    @Column
    private double paula;
    @Column
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

