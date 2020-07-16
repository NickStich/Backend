package com.actions.emislabbackend.specifications;

import com.actions.emislabbackend.model.OperationTeeth;
import com.actions.emislabbackend.model.WorkType;
import com.actions.emislabbackend.service.OpTeethService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class OperationTeethRepoImpl implements OperationTeethRepoCustom {

    EntityManager em;

    public OperationTeethRepoImpl(EntityManager em) {
        this.em = em;
    }

    public WorkType validyWorktype(String workType) {
        return WorkType.valueOf(workType);
    }

    public Date toDate(String startDate){
        return new Date(Long.parseLong(startDate));
    }

    @Override
    public List<OperationTeeth> findByMedicAndPatientAndWorkTypeAndNumberAndStartAndDueDate(String medic, String patient, String workType, int teethNumber, Date startDate, Date dueDate, String status) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<OperationTeeth> cq = cb.createQuery(OperationTeeth.class);
        Root<OperationTeeth> operation = cq.from(OperationTeeth.class);
        List<Predicate> predicates = new ArrayList<>();

        if (medic != null) {
            predicates.add(cb.like(operation.get("medic"), "%" + medic + "%"));
        }
        if (patient != null) {
            predicates.add(cb.like(operation.get("patient"), "%" + patient + "%"));
        }
        if (workType != null) {
            List<WorkType> workTypeList = WorkType.getWorkTypeList();
            for (WorkType type : workTypeList) {
                if (type.getName().equals(workType)) {
                    predicates.add(cb.equal(operation.get("worktype"), type));
                }
            }
        }
        if (teethNumber != 0) {
            predicates.add(cb.equal(operation.get("teethNumber"), teethNumber));
        }

        if (startDate != null) {
            predicates.add(cb.equal(operation.get("startDate") ,  startDate ));
        }

        if (status != null) {
            predicates.add(cb.like(operation.get("status"), "%" + status + "%"));
        }


        cq.where(predicates.toArray(new Predicate[0]));

        return em.createQuery(cq).getResultList();
    }
}
