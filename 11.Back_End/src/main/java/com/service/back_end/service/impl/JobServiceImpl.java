package com.service.back_end.service.impl;

import com.service.back_end.Ropository.JobRepository;
import com.service.back_end.dto.JobDto;
import com.service.back_end.entity.Job;
import com.service.back_end.service.JobService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {


    private final JobRepository jobRepository;
    private final ModelMapper modelMApper;

    @Override
    public void saveJob(JobDto jobDto) {

        jobRepository.save(modelMApper.map(jobDto, Job.class));

    }

    @Override
    public void updateJob(JobDto jobDto) {
        jobRepository.save(modelMApper.map(jobDto, Job.class));

    }



    @Override
    public List<JobDto> getAllJob() {
             List<Job> all = jobRepository.findAll();
            return modelMApper.map(all,new TypeToken<List<JobDto>>(){}.getType());

    }

    @Override
    public void changeStatus(String id) {
        jobRepository.updateStatus(id);

    }

     @Override
    public List<JobDto> getAllJobsByKeyword(String keyword) {
        List<Job> list=jobRepository.findJobByJobTitleContainingIgnoreCase(keyword);
        return modelMApper.map(list,new TypeToken<List<JobDto>>(){}.getType());
    }
}
