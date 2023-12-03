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
public class userentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userCode;
    private String userID;
    private String userPassword;
    private String telecom;
    private String userEmail;
    private String userPhonenumber1;
    private String userPhonenumber2;
}
