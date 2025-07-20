package com.service.back_end.controller;

import com.service.back_end.dto.JobDto;
import com.service.back_end.entity.Job;
import com.service.back_end.service.impl.JobServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:63342")  // allow frontend origin
@RequestMapping("api/v1/job")
@RestController
@RequiredArgsConstructor

public class JobController {

    private final JobServiceImpl jobService;

    @PostMapping("create")
    public void createJob(@RequestBody JobDto jobDto) {
        jobService.saveJob(jobDto);
    }

    @PutMapping("update/{id}")
    public void updateJob(@PathVariable Integer id, @RequestBody JobDto jobDto) {
        jobDto.setId(id); // Assuming JobDto has an id field
        jobService.updateJob(jobDto);
    }

    @GetMapping("all")
    public List<JobDto> getAllJobs() {
        return jobService.getAllJob();
    }


    @PatchMapping("status/{id}")
    public void changeStatus(@PathVariable String id) {
        jobService.changeStatus(id);

    }

      @GetMapping("search/{keyword}")
    public List<JobDto> searchJob(@PathVariable("keyword") String keyword){
        return jobService.getAllJobsByKeyword(keyword);
    }

}
