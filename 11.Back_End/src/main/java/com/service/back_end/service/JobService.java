package com.service.back_end.service;

import com.service.back_end.dto.JobDto;

import java.util.List;

public interface JobService {

     void saveJob(JobDto jobDto);
     void updateJob(JobDto jobDto);
     List<JobDto> getAllJob();
     void changeStatus(String id);

     List<JobDto> getAllJobsByKeyword(String keyword);
}
