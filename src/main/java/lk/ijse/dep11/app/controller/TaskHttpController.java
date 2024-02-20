package lk.ijse.dep11.app.controller;

import lk.ijse.dep11.app.dto.TaskDto;
import lk.ijse.dep11.app.entity.Task;
import lk.ijse.dep11.app.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void updateTask(@PathVariable int id, @RequestBody TaskDto taskDto) {
        taskService.updateTask(id, taskDto);
    }

    @GetMapping(produces = "application/json", params = {"email"})
    public List<TaskDto> getAllTasks(String email) {
        return taskService.getAllTasksByEmail(email);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id) {
        taskService.deleteTask(id);
    }
}
