package com.wku.calender.controller;

import com.wku.calender.entity.UserEntity;
import com.wku.calender.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    private final UserRepository userRepository;

    @Autowired
    public RegistrationController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/signup")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new UserEntity());
        return "sign up"; // 회원가입 폼이름이 signup.html인 경우
    }

    @PostMapping("/signup")
    public String registerUser(@ModelAttribute("user") UserEntity user) {
        // 회원가입 로직을 처리하고 사용자를 데이터베이스에 저장합니다.
        userRepository.save(user);
        return "redirect:/signin"; // 성공적인 회원가입 후 로그인 페이지로 리다이렉트합니다.
    }
}
