package com.actions.emislabbackend.service;

import com.actions.emislabbackend.model.OperationTeeth;
import com.actions.emislabbackend.repository.OpTeethRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpTeethService {

    @Autowired
    private OpTeethRepository opTeethRepository;

    public OperationTeeth getJobsById(int id) {
        return opTeethRepository.findById(id).orElse(new OperationTeeth());
    }

    public void addJobs(OperationTeeth operationTeeth) {
        opTeethRepository.save(operationTeeth);
    }

    public List<OperationTeeth> getAllJobs() {
        return (List<OperationTeeth>) opTeethRepository.findAll();
    }

    public OperationTeeth updateJobs(OperationTeeth operationTeeth) {
        return opTeethRepository.save(operationTeeth);
    }
    public void deleteJobs(int id) {
        opTeethRepository.deleteById(id);
    }


}

