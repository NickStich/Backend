package com.actions.emislabbackend.dto;

import com.actions.emislabbackend.model.WorkType;
import lombok.Data;

import java.util.Date;
@Data
public class OperationTeethDTO {

    private String medic;

    private String patient;

    private WorkType worktype;

    private int teethNumber;

    private Date startDate;

    private Date dueDate;



}
