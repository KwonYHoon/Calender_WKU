package com.wku.calender.controller;

import com.wku.calender.dto.ResponseDTO;
import com.wku.calender.dto.SignupDTO;
import com.wku.calender.dto.SignupResponseDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @PostMapping("/signup")
    public ResponseDTO<SignupResponseDTO> signup(@RequestBody SignupDTO requestBody) {
        System.out.println(requestBody.toString());
        return null;
    }
}
