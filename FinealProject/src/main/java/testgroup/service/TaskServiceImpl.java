package testgroup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testgroup.model.Task;
import java.util.List;

import testgroup.dao.TaskDao;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskDao taskDao;

    @Override
    public List<Task> allTasks() {
        return taskDao.allTasks();
    }

    @Override
    public void add(Task task) {
        taskDao.add(task);
    }

    @Override
    public void delete(Task task) {
        taskDao.delete(task);
    }

    @Override
    public void edit(Task task) {
        taskDao.edit(task);
    }

    @Override
    public Task getById(int id) {
        return taskDao.getById(id);
    }
}
