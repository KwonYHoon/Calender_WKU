package com.wku.calender.repository;

import com.wku.calender.entity.scheduleentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<scheduleentity, Integer> {
}
