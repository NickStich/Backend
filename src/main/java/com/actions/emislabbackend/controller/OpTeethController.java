package com.actions.emislabbackend.controller;


import com.actions.emislabbackend.dto.OperationTeethDTO;
import com.actions.emislabbackend.model.OperationTeeth;
import com.actions.emislabbackend.service.OpTeethService;
import com.actions.emislabbackend.specifications.OperationTeethRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/dentalJobs")
public class OpTeethController {

    @Autowired
    private OpTeethService opTeethService;


    private OperationTeethRepoImpl operationTeethRepo;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OperationTeeth getJobsById(@PathVariable("id") int id) {
        return opTeethService.getJobsById(id);
    }

    @RequestMapping(value = "/operations",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addJobs(@RequestBody OperationTeethDTO operationTeethDTO) {
        opTeethService.addJobs(operationTeethDTO);
    }

    @RequestMapping(value = "/operations",method = RequestMethod.GET)
    public List<OperationTeeth> getAllJobs() {
//        opTeethService.doHack();
        return opTeethService.getAllJobs();
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public OperationTeeth updateJobs(@RequestBody OperationTeethDTO operationTeethDTO) {
        return opTeethService.updateJobs(operationTeethDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteJobsById(@PathVariable("id") int id) {
        opTeethService.deleteJobs(id);
    }

    @RequestMapping(value ="/operations" ,params = {"medic","patient","worktype"},method = RequestMethod.GET)
    public @ResponseBody List<OperationTeeth> getItem(@RequestParam("medic") String medic,
                                                @RequestParam("patient")  String patient,
                                                @RequestParam("worktype") String worktype,
                                                @RequestParam("teethNumber") int teethNumber,
                                                 @RequestParam("startDate") @DateTimeFormat(pattern="dd-MM-yyyy") Date startDate,
                                                @RequestParam("status") String status){

      return opTeethService.findByParams(medic,patient,
              worktype,
              teethNumber,
              startDate,
              status);
    }
}
