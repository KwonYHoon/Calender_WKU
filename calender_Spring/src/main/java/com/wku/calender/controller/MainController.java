package com.wku.calender.controller;

import com.wku.calender.entity.scheduleentity;
import com.wku.calender.service.ScheduleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @PostMapping("/add")
    public String addSchedule(@ModelAttribute ScheduleForm scheduleForm, Model model) {
        scheduleService.addSchedule(scheduleForm);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteSchedule(@RequestParam("id") int scheduleId, Model model) {
        // scheduleId를 사용하여 데이터베이스에서 일정을 삭제
        scheduleService.deleteSchedule(scheduleId);
        return "redirect:/";
    }
}
