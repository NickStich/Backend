package com.actions.emislabbackend.model.employees;

import com.actions.emislabbackend.model.Percent;
import com.actions.emislabbackend.model.WorkType;

import java.util.List;
import java.util.Map;

public class Timeea implements IEmployee {


    @Override
    public double distributeAmount(WorkType workType) {
        Map<String, List<Percent>> map = EmployeeAmountDistribution.getEmployeeAmountDistribution();
        for (Map.Entry<String, List<Percent>> entrySet : map.entrySet()) {
            for (int i = 0; i < entrySet.getValue().size(); i++) {
                if (entrySet.getKey().equals("Timeea") && workType==entrySet.getValue().get(i).getWorkType()) {
                    return entrySet.getValue().get(i).getAmount();
                }
            }
        }
        return 0;
    }

}
