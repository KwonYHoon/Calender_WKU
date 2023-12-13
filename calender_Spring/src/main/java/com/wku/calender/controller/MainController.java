package com.wku.calender.controller;

import com.wku.calender.entity.scheduleentity;
import com.wku.calender.service.ScheduleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    private final ScheduleService scheduleService;

    public MainController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("/")
    public String showMainPage(Model model) {
        List<scheduleentity> schedules = scheduleService.getAllSchedules();
        model.addAttribute("schedules", schedules);
        return "main";
    }

    @GetMapping("/signin")
    public String showSigninPage(Model model) {
        return "sign in";
    }
}
