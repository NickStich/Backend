package com.actions.emislabbackend.model.employees;

import com.actions.emislabbackend.model.Percent;
import com.actions.emislabbackend.model.WorkType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Paula implements IEmployee {

    @Override
    public double distributeAmount(WorkType workType) {
        List<Percent> distribution = Paula.getEmployeeAmountDistribution();
        for (Percent percent : distribution) {
            if (workType == percent.getWorkType()) {
                return percent.getAmount();
            }
        }
        return 0;
    }

    private static List<Percent> getEmployeeAmountDistribution() {
        List<Percent> paulaList = new ArrayList<>();
        paulaList.add(new Percent(WorkType.METALO_CERAMICA, WorkType.METALO_CERAMICA.getPrice() * 0.105));
        paulaList.add(new Percent(WorkType.METALO_CERAMICA_ONE, WorkType.METALO_CERAMICA_ONE.getPrice() * 0.105));
        paulaList.add(new Percent(WorkType.MCP_FIZIONOMIC, WorkType.MCP_FIZIONOMIC.getPrice() * 0.105));
        paulaList.add(new Percent(WorkType.DCR, WorkType.DCR.getPrice() * 0.3));
        paulaList.add(new Percent(WorkType.REPARATIE_PROTEZA, WorkType.REPARATIE_PROTEZA.getPrice() * 0.7));
        paulaList.add(new Percent(WorkType.PROTEZA_TOTALA, WorkType.PROTEZA_TOTALA.getPrice() * 0.285));
        paulaList.add(new Percent(WorkType.MODEL_STUDIU, WorkType.MODEL_STUDIU.getPrice() * 0.2));
        paulaList.add(new Percent(WorkType.REBAZARE, WorkType.REBAZARE.getPrice() * 0.5));

        return paulaList;
    }


}
