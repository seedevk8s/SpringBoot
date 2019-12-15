package com.example.study.model.entity;

import com.example.study.model.enumclass.UserStatus;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor   // 기본생성자
@Entity // == table
@ToString(exclude = {"orderGroupList"})
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String account;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserStatus status;      //REGISTERED / UNREGISTERED / WAITING

    private String email;

    private String phoneNumber;

    private  LocalDateTime registeredAt;

    private  LocalDateTime unregisteredAt;

    @CreatedDate
    private LocalDateTime createdAt;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @LastModifiedBy
    private String updatedBy;



}
