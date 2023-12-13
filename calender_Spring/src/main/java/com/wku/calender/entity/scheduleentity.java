package com.wku.calender.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "schedule")
@Table(name = "schedule")
public class scheduleentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_code", nullable = false, unique = true)
    private Long scheduleCode;

    @Column(name = "team_code", nullable = false)
    private int teamCode;

    @Column(name = "schedule_name", nullable = false)
    private String scheduleName;

    @Column(name = "schedule_start")
    private String scheduleStart;

    @Column(name = "schedule_end")
    private String scheduleEnd;
}
