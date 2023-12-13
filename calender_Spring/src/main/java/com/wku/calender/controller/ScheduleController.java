package com.wku.calender.controller;

import com.wku.calender.entity.scheduleentity;
import org.springframework.ui.Model;
import com.wku.calender.service.ScheduleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("/schedules")
    public String getAllSchedules(Model model) {
        List<scheduleentity> schedules = scheduleService.getAllSchedules();
        model.addAttribute("schedules", schedules);
        return "main"; // Thymeleaf 템플릿의 이름
    }
}