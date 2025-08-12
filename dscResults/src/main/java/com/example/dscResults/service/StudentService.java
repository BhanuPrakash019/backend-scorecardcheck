package com.example.dscResults.service;

import com.example.dscResults.model.StudentDetails;
import com.example.dscResults.repo.StudentRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.text.SimpleDateFormat;



@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;
    public StudentDetails getStudentById(long hallTicketNumber) {
        return repo.findByHallTicketNumber(hallTicketNumber)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public StudentDetails save(StudentDetails stud) {
        return repo.save(stud);
    }

    public void deleteStudentById(long hallTicketNumber) {
        StudentDetails student=repo.findByHallTicketNumber(hallTicketNumber)
                .orElseThrow(()->new RuntimeException("student not fond"));
        repo.delete(student);
    }

    public StudentDetails updateStudent(long hallTicketNumber, StudentDetails newDetails) {
        StudentDetails existingStudent = repo.findByHallTicketNumber(hallTicketNumber)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        // Update fields
        existingStudent.setCandidateName(newDetails.getCandidateName());
        existingStudent.setFatherName(newDetails.getFatherName());
        existingStudent.setDob(newDetails.getDob());
        existingStudent.setGender(newDetails.getGender());
        existingStudent.setCommunity(newDetails.getCommunity());
        existingStudent.setPostAppliedDist(newDetails.getPostAppliedDist());
        existingStudent.setExamScore(newDetails.getExamScore());
        existingStudent.setTet(newDetails.getTet());
        existingStudent.setTotalScore(newDetails.getTotalScore());
        existingStudent.setStatus(newDetails.getStatus());

        return repo.save(existingStudent);
    }


//    @Autowired
//    private StudentRepository repo;


//        List<StudentDetails> details = Arrays.asList(
//                new StudentDetails(
//                        12345L, "John Doe", "Mr. Doe",
//                        "2003-04-19", "Male", "BC-D",
//                        "Hyderabad", 85.0, 10.0, 95.0, "Qualified"
//                )
//        );


//    public List<StudentDetails> getDetails() {
//        return repo.findAll();
//    }

}
