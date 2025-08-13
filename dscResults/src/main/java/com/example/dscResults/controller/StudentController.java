package com.example.dscResults.controller;

import com.example.dscResults.repo.StudentRepository;
import com.example.dscResults.service.StudentService;
import com.example.dscResults.model.StudentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://score-card-check-frontend.vercel.app")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String  bhanu(){
        return "helo";
    }


    @GetMapping("/details")
    public List<StudentDetails> getDetails(){
        return repo.findAll();
    }


    @GetMapping("/details/{hallTicketNumber}")
    public StudentDetails getStudentById(@PathVariable long hallTicketNumber){
        return service.getStudentById(hallTicketNumber);
    }

    @PostMapping("/details")
    public StudentDetails addDetails(@RequestBody StudentDetails stud){
        return service.save(stud);
    }

    @DeleteMapping("/{hallTicketNumber}")
    public String deleteDetails(@PathVariable long hallTicketNumber){
        service.deleteStudentById(hallTicketNumber);
        return "student with hall ticketnumber"+hallTicketNumber+"deleted";
    }

    @PutMapping("/{hallTicketNumber}")
    public StudentDetails updateDetails(@PathVariable long hallTicketNumber,@RequestBody StudentDetails stud){
        return service.updateStudent(hallTicketNumber,stud);
    }
}
