package com.question.service;

import com.question.repositories.entities.Question;

import java.util.List;

public interface QuestionService {

    Question add(Question question);

    List<Question> get();

    Question get(Long id);

    List<Question> getBydQuizId(Long id);
}
