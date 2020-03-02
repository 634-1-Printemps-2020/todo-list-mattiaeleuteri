package ch.hesge.cours634.todolist.metier;

import ch.hesge.cours634.todolist.domaine.Tache;
import ch.hesge.cours634.todolist.domaine.User;

import java.util.*;

public class GestionnaireTache {
    private Map<User, List<Tache>> tasks = new HashMap<>();

    public void addTask(User user, Tache task) {
        if(!tasks.containsKey(user)){
            List<Tache> tasksUser = new ArrayList<>();
            tasks.put(user, tasksUser);
        }
        tasks.get(user).add(task);
    }

    public List<Tache> getTasksUser(User user){
        return tasks.get(user);
    }

    public void cancelTask(Tache task) {
    }

    public void editDate(Tache task) {
    }

}
