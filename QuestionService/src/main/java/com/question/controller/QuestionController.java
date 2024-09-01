package com.question.controller;

import com.question.repositories.entities.Question;
import com.question.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    List<Question> findAll(){
        return questionService.get();
    }

    @GetMapping("/{questionId}")
    Question findById(@PathVariable Long questionId){
        return questionService.get(questionId);
    }

    @PostMapping
    Question create(@RequestBody Question question){
        return questionService.add(question);
    }

    @GetMapping("/quiz/{quizId}")
    List<Question> findAllByQuizId(@PathVariable Long quizId){
        return questionService.getBydQuizId(quizId);
    }
}
