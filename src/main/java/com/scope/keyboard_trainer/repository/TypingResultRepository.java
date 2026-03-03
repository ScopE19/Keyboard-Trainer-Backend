package com.scope.keyboard_trainer.repository;

import com.scope.keyboard_trainer.model.entity.TypingResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TypingResultRepository extends JpaRepository<TypingResult, Long> {
    List<TypingResult> findByUserUsername(String username);
}