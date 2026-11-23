package com.telusko.buildingaproj.service;

import com.telusko.buildingaproj.model.JobPost;
import com.telusko.buildingaproj.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void  addJob(JobPost jobPost){
        repo.addJobs(jobPost);
    }

    public List<JobPost> getAllJob(){
        return repo.getAllJobs();
    }
}
