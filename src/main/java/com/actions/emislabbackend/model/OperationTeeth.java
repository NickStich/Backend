package com.actions.emislabbackend.model;

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


    public OperationTeeth(int id, String medic, String patient, WorkType worktype, int teethNr) {
        this.id = id;
        this.medic = medic;
        this.patient = patient;
        this.worktype = worktype;
        this.teethNr = teethNr;
        calculateProcent(this.worktype, this.teethNr);
    }

    private double timeea;
    private double paula;
    private double emi;


    String pattern = "##.##";
    DecimalFormat decimalFormat = new DecimalFormat(pattern);
    String format = decimalFormat.format(123456789.123);


    public void calculateProcent(WorkType wt, int teethNr) {

        switch (wt) {
            case METALO_CERAMICA:
                setTimeea(0.41 * wt.getPrice() * teethNr);
                setPaula(0.105 * wt.getPrice() * teethNr);
                setEmi(0.485 * wt.getPrice() * teethNr);
                break;
            case METALO_CERAMICA_ONE:
                setTimeea(0.335 * wt.getPrice() * teethNr);
                setPaula(0.105 * wt.getPrice() * teethNr);
                setEmi(0.56 * wt.getPrice() * teethNr);
                break;
            case MCP_FIZIONOMIC:
                setTimeea(0.335 * wt.getPrice() * teethNr);
                setPaula(0.105 * wt.getPrice() * teethNr);
                setEmi(0.56 * wt.getPrice() * teethNr);
                break;
            case CERAMICA_ZIRKONIU:
                setTimeea(0.2 * wt.getPrice() * teethNr);
                setPaula(0 * wt.getPrice() * teethNr);
                setEmi(0.8 * wt.getPrice() * teethNr);
                break;
            case EMAX:
                setTimeea(0.2 * wt.getPrice() * teethNr);
                setPaula(0 * wt.getPrice() * teethNr);
                setEmi(0.8 * wt.getPrice() * teethNr);
                break;
            case CERAMICA_SINTER:
                setTimeea(0.35 * wt.getPrice() * teethNr);
                setPaula(0 * wt.getPrice() * teethNr);
                setEmi(0.65 * wt.getPrice() * teethNr);
                break;
            case DCR:
                setTimeea(0 * wt.getPrice() * teethNr);
                setPaula(0.3 * wt.getPrice() * teethNr);
                setEmi(0.7 * wt.getPrice() * teethNr);
                break;
            case REPARATIE_PROTEZA:
                setTimeea(0 * wt.getPrice() * teethNr);
                setPaula(0.7 * wt.getPrice() * teethNr);
                setEmi(0.3 * wt.getPrice() * teethNr);
                break;
            case PROTEZA_TOTALA:
                setTimeea(0 * wt.getPrice() * teethNr);
                setPaula(0.285 * wt.getPrice() * teethNr);
                setEmi(0.715 * wt.getPrice() * teethNr);
                break;
            case REBAZARE:
                setTimeea(0 * wt.getPrice() * teethNr);
                setPaula(0.5 * wt.getPrice() * teethNr);
                setEmi(0.5 * wt.getPrice() * teethNr);
                break;
            case MODEL_STUDIU:
                setTimeea(0 * wt.getPrice() * teethNr);
                setPaula(0.2 * wt.getPrice() * teethNr);
                setEmi(0.8 * wt.getPrice() * teethNr);
                break;
            default:
                setTimeea(0 * wt.getPrice() * teethNr);
                setPaula(0 * wt.getPrice() * teethNr);
                setEmi(1 * wt.getPrice() * teethNr);
                break;

        }
    }
}

