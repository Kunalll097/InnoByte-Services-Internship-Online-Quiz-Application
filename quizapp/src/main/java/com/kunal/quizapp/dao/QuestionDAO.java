package com.kunal.quizapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kunal.quizapp.model.Question;

@Repository
public interface QuestionDAO extends JpaRepository <Question,Integer> {
    List<Question> findByCategory(String text);

    @Query(value = "SELECT * FROM question q WHERE category = :category ORDER BY RAND() LIMIT :numQ\n",nativeQuery = true)
    List<Question> getQueByCategory(String category, int numQ);
}