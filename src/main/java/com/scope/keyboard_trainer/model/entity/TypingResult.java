package com.scope.keyboard_trainer.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TypingResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int wpm;
    private double accuracy;
    private int duration;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}