package com.boilerplate.boilerplate.repository;

import com.boilerplate.boilerplate.domain.entities.Question;
import com.boilerplate.boilerplate.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findAll();
    Question getOne(@Param("id") Integer id);
    List<Question> findByName(@Param("question") String question);
}
