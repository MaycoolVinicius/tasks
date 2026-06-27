package com.maycool.tasks.entity;

import com.maycool.tasks.enums.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tasks")
public class Task {

        @Id
        private String id;
        private String title;
        private String description;
        private TaskStatus status;
        private String category;
        private String priority;
        @CreatedDate
        private LocalDateTime createdAt;
        private LocalDateTime dueDate;
}
