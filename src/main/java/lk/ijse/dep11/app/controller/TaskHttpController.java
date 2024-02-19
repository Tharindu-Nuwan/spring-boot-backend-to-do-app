package lk.ijse.dep11.app.controller;

import lk.ijse.dep11.app.dto.TaskDto;
import lk.ijse.dep11.app.entity.Task;
import lk.ijse.dep11.app.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tasks")
@CrossOrigin
public class TaskHttpController {

    @Autowired
    private TaskService taskService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = "application/json", consumes = "application/json")
    public TaskDto saveTask(@RequestBody TaskDto taskDto) {
        return taskService.saveTask(taskDto);
    }

    @PatchMapping("/{id}")
    public void updateTask() {
        System.out.println("update Task");
    }

    @GetMapping
    public void getAllTasks() {
        System.out.println("Get All Task");
    }

    @DeleteMapping("/{id}")
    public void deleteTask() {
        System.out.println("Delete Task");
    }
}
