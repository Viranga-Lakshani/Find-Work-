package com.example.findwork.repository; // Package name changed

import com.example.findwork.model.Job; // Package name changed
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    // Custom queries can be added here if needed
}
