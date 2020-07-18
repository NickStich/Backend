package com.actions.emislabbackend.service;

import com.actions.emislabbackend.dto.OperationTeethDTO;
import com.actions.emislabbackend.model.OperationTeeth;
import com.actions.emislabbackend.model.WorkType;
import com.actions.emislabbackend.model.employees.Emi;
import com.actions.emislabbackend.model.employees.EmployeeStrategy;
import com.actions.emislabbackend.model.employees.Paula;
import com.actions.emislabbackend.model.employees.Timeea;
import com.actions.emislabbackend.repository.OpTeethRepository;
import com.actions.emislabbackend.specifications.OperationTeethRepoCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class OpTeethService {

    @Autowired
    private OpTeethRepository opTeethRepository;

    @Autowired
    private OperationTeethRepoCustom operationTeethRepoCustom;

    public OperationTeeth getJobsById(int id) {
        return opTeethRepository.findById(id).orElse(new OperationTeeth());
    }


    public OperationTeeth updateJobs(OperationTeethDTO operationTeethDTO) {
        OperationTeeth operationTeeth = calculate(operationTeethDTO);
        return opTeethRepository.save(operationTeeth);
    }

    public List<OperationTeeth> getAllJobs() {
        return (List<OperationTeeth>) opTeethRepository.findAll();
    }

    public OperationTeeth calculate(OperationTeethDTO operationTeethDTO) {
        OperationTeeth operationTeeth = new OperationTeeth();

        operationTeeth.setMedic(operationTeethDTO.getMedic());
        operationTeeth.setPatient(operationTeethDTO.getPatient());
        operationTeeth.setWorktype(operationTeethDTO.getWorktype());
        operationTeeth.setTeethNumber(operationTeethDTO.getTeethNumber());
        operationTeeth.setStartDate(operationTeethDTO.getStartDate());
        operationTeeth.setDueDate(operationTeethDTO.getDueDate());
        operationTeeth.setEmi(operationTeethDTO.getTeethNumber() * EmployeeStrategy.distributeToEmployees(new Emi(), operationTeethDTO.getWorktype()));
        operationTeeth.setTimeea(operationTeethDTO.getTeethNumber() * EmployeeStrategy.distributeToEmployees(new Timeea(), operationTeethDTO.getWorktype()));
        operationTeeth.setPaula(operationTeethDTO.getTeethNumber() * EmployeeStrategy.distributeToEmployees(new Paula(), operationTeethDTO.getWorktype()));
        operationTeeth.setElementPrice(operationTeethDTO.getWorktype().getPrice());
        operationTeeth.setTotalPrice(operationTeethDTO.getTeethNumber() * operationTeethDTO.getWorktype().getPrice());
        operationTeeth.setStatus(operationTeethDTO.getStatus());

        return operationTeeth;
    }

    public OperationTeeth addJobs(OperationTeethDTO operationTeethDTO) {
        OperationTeeth operationTeeth = calculate(operationTeethDTO);
        return opTeethRepository.save(operationTeeth);
    }

    public void deleteJobs(int id) {
        opTeethRepository.deleteById(id);
    }

    private Date toDate(long timeInMillis) {
        Date date = new Date();
        date.setTime(timeInMillis);
        if (timeInMillis==0) {
            return null;
        }
        return date;
    }

    public List<OperationTeeth> findByParams(String medic, String patient, String worktype, int teethNumber,long startDate,long dueDate, String status) {
        return operationTeethRepoCustom.findByMedicAndPatientAndWorkTypeAndNumberAndStartAndDueDate(
                medic, patient, worktype, teethNumber, toDate(startDate), toDate(dueDate), status);
    }
}

