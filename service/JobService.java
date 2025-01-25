package com.example.findwork.service; // Package name changed

import com.example.findwork.exception.JobNotFoundException; // Package name changed
import com.example.findwork.model.Job; // Package name changed
import com.example.findwork.repository.JobRepository; // Package name changed
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Job getJobById(Long id) {
        return jobRepository.findById(id)
                .orElseThrow(() -> new JobNotFoundException("Job with ID " + id + " not found."));
    }

    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    public void deleteJob(Long id) {
        jobRepository.findById(id).orElseThrow(() -> new JobNotFoundException("Cannot delete: Job with ID " + id + " not found."));
        jobRepository.deleteById(id);
    }

    public Job updateJob(Job job, Long id) {
        return jobRepository.findById(id)
                .map(existingJob -> {
                    existingJob.setTitle(job.getTitle());
                    existingJob.setDescription(job.getDescription());
                    existingJob.setCompany(job.getCompany());
                    existingJob.setLocation(job.getLocation());
                    return jobRepository.save(existingJob);
                })
                .orElseThrow(() -> new JobNotFoundException("Cannot update: Job with ID " + id + " not found."));
    }
}
