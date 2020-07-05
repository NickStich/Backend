package com.actions.emislabbackend.controller;


import com.actions.emislabbackend.model.OperationTeeth;
import com.actions.emislabbackend.service.OpTeethService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentalJobs")
public class OpTeethController {

    @Autowired
    private OpTeethService opTeethService;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OperationTeeth getJobsById(@PathVariable("id") int id) {
        return opTeethService.getJobsById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addJobs(@RequestBody OperationTeeth operationTeeth) {
        opTeethService.addJobs(operationTeeth);
    }

    @RequestMapping(method = RequestMethod.GET) // sau @GetMapping
    public List<OperationTeeth> getAllJobs() {
        return opTeethService.getAllJobs();
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public OperationTeeth updateJobs(@RequestBody OperationTeeth operationTeeth) {
        return opTeethService.updateJobs(operationTeeth);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteJobsById(@PathVariable("id") int id) {
        opTeethService.deleteJobs(id);
    }


}
