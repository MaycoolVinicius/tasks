package com.maycool.tasks.controller;


import com.maycool.tasks.dto.request.TaskRequestDTO;
import com.maycool.tasks.dto.response.TaskResponseDTO;
import com.maycool.tasks.entity.Task;
import com.maycool.tasks.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/task")
public class TaskController {
    private final TaskService taskService;
    @GetMapping
    ResponseEntity <List<TaskResponseDTO>> findAll(){
        List<TaskResponseDTO> findAll = taskService.findAll();
        return ResponseEntity.ok(findAll);
    }
}
