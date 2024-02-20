package lk.ijse.dep11.app.service.impl;

import lk.ijse.dep11.app.dto.TaskDto;
import lk.ijse.dep11.app.entity.Task;
import lk.ijse.dep11.app.repository.TaskRepository;
import lk.ijse.dep11.app.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
    public List<TaskDto> getAllTasksByEmail(String email) {
        List<Task> taskList = taskRepository.getTasksByEmailEquals(email);
        List<TaskDto> taskDtoList = taskList
                .stream()
                .map(task -> modelMapper.map(task, TaskDto.class))
                .collect(Collectors.toList());
        return taskDtoList;
    }

    @Override
    public void deleteTask(int id) {
        if (taskRepository.findById(id).isPresent()) {
            taskRepository.deleteById(id);
        } else {
            throw new RuntimeException("Nothing to Delete!");
        }
    }

    @Override
    public void updateTask(int id, TaskDto taskDto) {
        if (taskRepository.findById(id).isPresent()) {
            Task task = new Task(id,
                    taskDto.getDescription(),
                    taskDto.getStatus(),
                    taskRepository.getReferenceById(id).getEmail());
            taskRepository.save(task);
        }  else {
            throw new RuntimeException("Nothing to Update!");
        }
    }
}
