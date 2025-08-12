package com.example.dscResults.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDetails {

    @Id
    private long hallTicketNumber;
    private String candidateName;
    private String fatherName;

    private String dob;
    private String gender;
    private String community;
    //
    private String postAppliedDist;
    private double examScore;
    private double tet;
    private double totalScore;
    private String status;


//    public StudentDetails() {} // No-arg constructor
//
//    public StudentDetails(long hallTicketNumber, String candidateName, String fatherName, Date dob,
//                          String gender, String community, String postAppliedDist,
//                          double examScore, double tet, double totalScore, String status) {
//        this.hallTicketNumber = hallTicketNumber;
//        this.candidateName = candidateName;
//        this.fatherName = fatherName;
//
//        this.dob = dob;
//        this.gender = gender;
//        this.community = community;
//        this.postAppliedDist = postAppliedDist;
//        this.examScore = examScore;
//        this.tet = tet;
//        this.totalScore = totalScore;
//        this.status = status;
//    }
//    // Getters and setters
//    public long getHallTicketNumber() { return hallTicketNumber; }
//    public void setHallTicketNumber(long hallTicketNumber) { this.hallTicketNumber = hallTicketNumber; }
//
//    public String getCandidateName() { return candidateName; }
//    public void setCandidateName(String candidateName) { this.candidateName = candidateName; }
//
//    public String getFatherName() { return fatherName; }
//    public void setFatherName(String fatherName) { this.fatherName = fatherName; }
//
//    public Date getDob() { return dob; }
//    public void setDob(Date dob) { this.dob = dob; }
//
//    public String getGender() { return gender; }
//    public void setGender(String gender) { this.gender = gender; }
//
//    public String getCommunity() { return community; }
//    public void setCommunity(String community) { this.community = community; }
//
//    public String getPostAppliedDist() { return postAppliedDist; }
//    public void setPostAppliedDist(String postAppliedDist) { this.postAppliedDist = postAppliedDist; }
//
//    public double getExamScore() { return examScore; }
//    public void setExamScore(double examScore) { this.examScore = examScore; }
//
//    public double getTet() { return tet; }
//    public void setTet(double tet) { this.tet = tet; }
//
//    public double getTotalScore() { return totalScore; }
//    public void setTotalScore(double totalScore) { this.totalScore = totalScore; }
//
//    public String getStatus() { return status; }
//    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "hallTicketNumber=" + hallTicketNumber +
                ", candidateName='" + candidateName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", community='" + community + '\'' +
                ", postAppliedDist='" + postAppliedDist + '\'' +
                ", examScore=" + examScore +
                ", tet=" + tet +
                ", totalScore=" + totalScore +
                ", status='" + status + '\'' +
                '}';
    }

}
