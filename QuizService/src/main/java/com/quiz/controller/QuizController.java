package com.quiz.controller;

import com.quiz.repositories.entities.Quiz;
import com.quiz.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    @GetMapping
    public List<Quiz> getAll(){
        return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz getById(@PathVariable Long id){
        return  quizService.get(id);
    }
}
