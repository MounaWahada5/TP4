package com.example.tp4.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tp4.entity.Staff;
public interface StaffRepo extends JpaRepository<Staff, Integer> {
}