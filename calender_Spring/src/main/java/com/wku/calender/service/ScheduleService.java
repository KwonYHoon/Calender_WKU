package com.wku.calender.service;

import com.wku.calender.controller.ScheduleForm;
import com.wku.calender.entity.scheduleentity;
import com.wku.calender.repository.ScheduleRepository; // ScheduleRepository는 실제로 사용할 Repository 클래스로 대체해야 합니다.
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    private final ScheduleRepository scheduleRepository; // ScheduleRepository를 주입받아야 합니다.

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public List<scheduleentity> getAllSchedules() {
        return scheduleRepository.findAll(); // 또는 다른 적절한 메서드를 사용하여 데이터를 가져옵니다.
    }
    // 다른 Service 로직 구현

    public void addSchedule(ScheduleForm scheduleForm) {
        // ScheduleForm을 사용하여 일정을 추가하는 로직
        scheduleentity newSchedule = new scheduleentity();
        newSchedule.setTeamCode(scheduleForm.getTeamCode());
        newSchedule.setScheduleName(scheduleForm.getScheduleName());
        newSchedule.setScheduleStart(scheduleForm.getScheduleStart());
        newSchedule.setScheduleEnd(scheduleForm.getScheduleEnd());

        // scheduleRepository를 사용하여 새로운 일정을 저장
        scheduleRepository.save(newSchedule);
    }

    public void deleteSchedule(int scheduleId) {
        // scheduleId를 사용하여 일정을 삭제하는 로직
        scheduleRepository.deleteById(scheduleId);
    }
}
