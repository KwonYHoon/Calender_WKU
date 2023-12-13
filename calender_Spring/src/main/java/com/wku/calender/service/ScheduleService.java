package com.wku.calender.service;

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
}
