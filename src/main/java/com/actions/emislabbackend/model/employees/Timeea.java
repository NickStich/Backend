package com.actions.emislabbackend.model.employees;

import com.actions.emislabbackend.model.Percent;
import com.actions.emislabbackend.model.WorkType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Timeea implements IEmployee {


    @Override
    public double distributeAmount(WorkType workType) {
        List<Percent> distribution = Timeea.getEmployeeAmountDistribution();
        for (Percent percent : distribution) {
            if (workType == percent.getWorkType()) {
                return percent.getAmount();
            }
        }
        return 0;
    }

    private static List<Percent> getEmployeeAmountDistribution() {
        List<Percent> timeeaList = new ArrayList<>();
        timeeaList.add(new Percent(WorkType.METALO_CERAMICA, WorkType.METALO_CERAMICA.getPrice() * 0.41));
        timeeaList.add(new Percent(WorkType.METALO_CERAMICA_ONE, WorkType.METALO_CERAMICA_ONE.getPrice() * 0.335));
        timeeaList.add(new Percent(WorkType.MCP_FIZIONOMIC, WorkType.MCP_FIZIONOMIC.getPrice() * 0.335));
        timeeaList.add(new Percent(WorkType.CERAMICA_ZIRKONIU, WorkType.CERAMICA_ZIRKONIU.getPrice() * 0.2));
        timeeaList.add(new Percent(WorkType.EMAX, WorkType.EMAX.getPrice() * 0.2));
        timeeaList.add(new Percent(WorkType.CERAMICA_SINTER, WorkType.CERAMICA_SINTER.getPrice() * 0.35));

        return timeeaList;
    }


}
