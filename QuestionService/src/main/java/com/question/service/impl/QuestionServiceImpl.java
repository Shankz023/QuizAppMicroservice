package com.question.service.impl;

import com.question.repositories.QuestionRepository;
import com.question.repositories.entities.Question;
import com.question.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    @Override
    public Question add(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question get(Long id) {
        return questionRepository.findById(id).orElseThrow(()-> new RuntimeException("No Questions Present!!"));
    }

    @Override
    public List<Question> getBydQuizId(Long id) {
        return questionRepository.findByQuizId(id);
    }
}
