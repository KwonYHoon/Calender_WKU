package com.wku.calender.repository;

import com.wku.calender.entity.teamentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface teamrepository extends JpaRepository<teamentity, Integer> {
}
