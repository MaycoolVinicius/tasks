package com.maycool.tasks.repository;

import com.maycool.tasks.dto.response.TaskResponseDTO;
import com.maycool.tasks.entity.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {



}
