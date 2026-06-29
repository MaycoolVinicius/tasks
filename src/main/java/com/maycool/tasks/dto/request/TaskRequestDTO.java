package com.maycool.tasks.dto.request;

import com.maycool.tasks.enums.Priority;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskRequestDTO {

    private String title;
    private String description;
    private String category;
    private Priority priority;
    private LocalDateTime dueDate;

}
