package com.maycool.tasks.dto.response;

import com.maycool.tasks.entity.Task;
import com.maycool.tasks.enums.Priority;
import com.maycool.tasks.enums.TaskStatus;
import com.maycool.tasks.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponseDTO {


    private String id;
    private String title;
    private String description;
    private TaskStatus status;
    private String category;
    private Priority priority;
    private LocalDateTime createdAt;
    private LocalDateTime dueDate;


}
