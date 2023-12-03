package com.wku.calender.repository;

import com.wku.calender.entity.memberentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface memberrepository extends JpaRepository<memberentity, Integer> {
}
