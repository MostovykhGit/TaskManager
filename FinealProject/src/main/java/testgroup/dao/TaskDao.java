package testgroup.dao;

import testgroup.model.Task;

import java.util.List;

public interface TaskDao {
    List<Task> allTasks();
    void add(Task film);
    void delete(Task film);
    void edit(Task film);
    Task getById(int id);
}
