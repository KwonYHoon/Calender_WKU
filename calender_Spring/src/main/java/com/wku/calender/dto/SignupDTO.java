package com.wku.calender.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupDTO {
    private String userID;
    private String userPassword;
    private String userPasswordCheck;
    private String telecom;
    private String userPhoneNumber1;
    private String userPhoneNumber2;
    private String userEmail;
}
