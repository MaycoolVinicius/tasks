package com.maycool.tasks.service;

import com.maycool.tasks.dto.response.TaskResponseDTO;
import com.maycool.tasks.entity.Task;
import com.maycool.tasks.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TaskService {
    private final TaskRepository taskRepository;



    private TaskResponseDTO toResponse(Task task){
        return new TaskResponseDTO(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getStatus(),
                task.getCategory(),
                task.getPriority(),
                task.getCreatedAt(),
                task.getDueDate());
    }
        public List<TaskResponseDTO> findAll() {
        List<Task> list = taskRepository.findAll();
        return list.stream()
                .map(this::toResponse)
                .toList();
    }
}


