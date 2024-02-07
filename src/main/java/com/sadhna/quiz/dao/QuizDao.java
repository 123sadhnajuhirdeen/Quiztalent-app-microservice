package com.sadhna.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sadhna.quiz.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
