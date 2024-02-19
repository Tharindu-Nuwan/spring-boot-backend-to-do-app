package lk.ijse.dep11.app.service;

import lk.ijse.dep11.app.dto.TaskDto;
import lk.ijse.dep11.app.entity.Task;

import java.util.List;

public interface TaskService {
    public TaskDto saveTask(TaskDto taskDto);
    public List<TaskDto> getAllTasksByEmail(String email);

    public void deleteTask(int id);

    public void updateTask(int id, TaskDto taskDto);
}
