package com.example.findwork.controller; // Package name changed

import com.example.findwork.model.Job; // Package name changed
import com.example.findwork.service.JobService; // Package name changed
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping
    public ResponseEntity<List<Job>> getAllJobs() {
        return ResponseEntity.ok(jobService.getAllJobs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(jobService.getJobById(id));
        } catch (JobNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
