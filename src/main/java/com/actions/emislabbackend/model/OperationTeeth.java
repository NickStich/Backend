package com.actions.emislabbackend.model;


import com.actions.emislabbackend.model.employees.Emi;
import com.actions.emislabbackend.model.employees.EmployeeStrategy;
import com.actions.emislabbackend.model.employees.Paula;
import com.actions.emislabbackend.model.employees.Timeea;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
//@AllArgsConstructor
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
    @Column(name = "teeth_nr")
    private int teethNumber;
    @Column
    private Date startDate;
    @Column
    private Date dueDate;
    @Column
    private double timeea;
    @Column
    private double paula;
    @Column
    private double emi;
    @Column
    private double elementPrice;
    @Column
    private int totalPrice;
    @Column
    private String workTypeName;
}

