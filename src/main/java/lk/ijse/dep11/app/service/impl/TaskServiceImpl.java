package lk.ijse.dep11.app.service.impl;

import lk.ijse.dep11.app.dto.TaskDto;
import lk.ijse.dep11.app.entity.Task;
import lk.ijse.dep11.app.repository.TaskRepository;
import lk.ijse.dep11.app.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public TaskDto saveTask(TaskDto taskDto) {
        Task task = modelMapper.map(taskDto, Task.class);
        task.setStatus(false);
        Task savedTask = taskRepository.save(task);
        taskDto.setId(savedTask.getId());
        taskDto.setStatus(savedTask.getStatus());
        return taskDto;
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
