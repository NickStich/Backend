package com.actions.emislabbackend.specifications;

import com.actions.emislabbackend.model.OperationTeeth;
import com.actions.emislabbackend.model.WorkType;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OperationTeethRepoCustom {
    List<OperationTeeth> findByMedicAndPatientAndWorkTypeAndNumberAndStartAndDueDate(String medic, String patient, String workType, int teethNumber, Date startDate, Date dueDate, String status);
}
