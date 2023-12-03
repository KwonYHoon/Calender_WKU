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
@Entity(name="Team")
@Table(name="team")
public class teamentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teamCode;
    private String teamName;
}
