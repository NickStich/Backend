package com.actions.emislabbackend.model;

import java.text.DecimalFormat;

public class Percent {
    private WorkType workType;
    private double amount;

    public Percent(WorkType workType, double percent) {
        this.workType = workType;
        this.amount = percent;
    }

    String pattern = "##.##";
    DecimalFormat decimalFormat = new DecimalFormat(pattern);
    String format = decimalFormat.format(123456789.123);

    public WorkType getWorkType() {
        return workType;
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }

    public double getAmount() {
        return Math.round(Double.parseDouble(decimalFormat.format(amount)));
    }

    public void setAmount(double amount) {
        this.amount = Double.parseDouble(decimalFormat.format(amount));
    }
}
