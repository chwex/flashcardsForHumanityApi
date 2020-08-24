package com.boilerplate.boilerplate.repository;

import com.boilerplate.boilerplate.domain.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Integer> {
    List<Topic> findAll();
    Topic getOne(@Param("id") Integer id);
    List<Topic> findByName(@Param("name") String name);
}
