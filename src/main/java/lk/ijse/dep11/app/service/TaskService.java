package lk.ijse.dep11.app.service;

import lk.ijse.dep11.app.dto.TaskDto;

import java.util.List;

public interface TaskService {
    public TaskDto saveTask(TaskDto taskDto);
    public List<TaskDto> getAllTasks(String email);

    public void deleteTask(int id);

    public void updateTask(int id, TaskDto taskDto);
}
