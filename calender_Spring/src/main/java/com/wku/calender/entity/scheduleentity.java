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
@Entity(name="schedule")
@Table(name="schedule")
public class scheduleentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int scheduleCode;
    private int teamCode;
    private String scheduleName;
    private String scheduleStart;
    private String scheduleEnd;
}
