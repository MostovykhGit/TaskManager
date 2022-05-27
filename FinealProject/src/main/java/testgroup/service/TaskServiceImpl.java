package testgroup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import testgroup.model.Task;
import java.util.List;

import testgroup.dao.TaskDao;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskDao taskDao;

    @Transactional
    public List<Task> allTasks() {
        return taskDao.allTasks();
    }

    @Transactional
    public void add(Task task) {
        taskDao.add(task);
    }

    @Transactional
    public void delete(Task task) {
        taskDao.delete(task);
    }

    @Transactional
    public void edit(Task task) {
        taskDao.edit(task);
    }

    @Transactional
    public Task getById(int id) {
        return taskDao.getById(id);
    }
}
