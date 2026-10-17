import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void add(String title) {
        tasks.add(new Task(nextId++, title));
    }

    public void list() {
        if (tasks.isEmpty()) {
            System.out.println("Ажил байхгүй байна.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public boolean done(int id) {
        Task task = find(id);
        if (task == null) {
            return false;
        }
        task.markDone();
        return true;
    }

    public boolean delete(int id) {
        Task task = find(id);
        if (task == null) {
            return false;
        }
        tasks.remove(task);
        return true;
    }

    private Task find(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }
}
