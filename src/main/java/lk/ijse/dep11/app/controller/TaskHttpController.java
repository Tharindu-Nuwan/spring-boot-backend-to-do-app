package lk.ijse.dep11.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tasks")
@CrossOrigin
public class TaskHttpController {
    @PostMapping
    public void saveTask() {
        System.out.println("Save Task");
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
