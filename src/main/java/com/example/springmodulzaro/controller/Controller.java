package com.example.springmodulzaro.controller;

import com.example.springmodulzaro.model.Task;
import com.example.springmodulzaro.model.TaskRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {

    private final TaskRepository taskRepository;

    public Controller(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping(path = {"/task/{id}"})
    public String getTasks(
            @PathVariable("id") Long id,
            Model model
    ){
        Task task = taskRepository.findId(id);
        model.addAttribute("task", task);
        return "task";
    }

    @RequestMapping(path = "/api/{id}", method = RequestMethod.GET)
    public @ResponseBody Task taskJson(
            @PathVariable("id") Long id
    ){
        return taskRepository.findId(id);
    }

    @DeleteMapping(path = "/api/delete/{id}")
    public @ResponseBody void taskDelete(
            @PathVariable Long id) {
        taskRepository.deleteById(id);
    }

}
