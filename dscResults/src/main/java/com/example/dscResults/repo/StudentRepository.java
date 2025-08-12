package com.example.dscResults.repo;

import com.example.dscResults.model.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails,Long> {

    Optional<StudentDetails> findByHallTicketNumber(long hallTicketNumber);

}
