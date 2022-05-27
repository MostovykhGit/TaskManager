package testgroup.dao;

import org.springframework.stereotype.Repository;
import testgroup.model.Task;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class TaskDaoImpl implements TaskDao{
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, Task> tasks = new HashMap<>();

    static {
        Task task1 = new Task();
        task1.setId(AUTO_ID.getAndIncrement());
        task1.setPriority(5);
        task1.setDescription("To learn guitar");
        task1.setIsDone(false);
        tasks.put(task1.getId(), task1);


        Task task2 = new Task();
        task2.setId(AUTO_ID.getAndIncrement());
        task2.setPriority(10);
        task2.setDescription("to do a contest");
        task2.setIsDone(false);
        tasks.put(task2.getId(), task2);
    }
    @Override
    public List<Task> allTasks() {
        return new ArrayList<>(tasks.values());
    }

    @Override
    public void add(Task task) {
        task.setId(AUTO_ID.getAndIncrement());
        tasks.put(task.getId(), task);
    }

    @Override
    public void delete(Task task) {
        tasks.remove(task.getId());
    }

    @Override
    public void edit(Task task) {
        tasks.put(task.getId(), task);
    }

    @Override
    public Task getById(int id) {
        return tasks.get(id);
    }
}
