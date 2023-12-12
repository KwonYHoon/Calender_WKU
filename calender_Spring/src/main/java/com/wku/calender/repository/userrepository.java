package com.wku.calender.repository;

import com.wku.calender.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // 필요한 경우 추가적인 쿼리 메서드를 선언할 수 있습니다.
}
