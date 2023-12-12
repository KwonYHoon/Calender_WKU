package com.wku.calender.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="User") //해당 클래스를 Entity 클래스로 사용 지정
@Table(name="users") // DB에 있는 해당하는 테이블과 현재 클래스를 매핑 시킨다.
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_code", nullable = false)
    private int userCode;

    @Column(name = "user_id", nullable = false)
    private String userID;
    @Column(name = "user_password", nullable = false)
    private String userPassword;
    @Column(name = "user_telecom")
    private String telecom;
    @Column(name = "user_Email", nullable = false)
    private String userEmail;
    @Column(name = "user_phonenumber", nullable = false)
    private String userPhonenumber;
}
