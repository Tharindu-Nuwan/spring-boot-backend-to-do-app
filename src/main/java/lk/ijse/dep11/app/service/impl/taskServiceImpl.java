package lk.ijse.dep11.app.service.impl;

import lk.ijse.dep11.app.dto.TaskDto;
import lk.ijse.dep11.app.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class taskServiceImpl implements TaskService {
    @Override
    public TaskDto saveTask(TaskDto taskDto) {
        return null;
    }

    @Override
    public List<TaskDto> getAllTasks(String email) {
        return null;
    }

    @Override
    public void deleteTask(int id) {

    }

    @Override
    public void updateTask(int id, TaskDto taskDto) {

    }
}
