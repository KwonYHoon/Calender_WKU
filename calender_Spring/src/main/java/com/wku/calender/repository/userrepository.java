package com.wku.calender.repository;

import com.wku.calender.entity.userentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userrepository extends JpaRepository<userentity, Integer>{

}
