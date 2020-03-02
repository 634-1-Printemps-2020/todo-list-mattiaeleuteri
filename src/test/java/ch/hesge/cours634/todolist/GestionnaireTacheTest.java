package ch.hesge.cours634.todolist;

import ch.hesge.cours634.todolist.domaine.Tache;
import ch.hesge.cours634.todolist.domaine.User;
import ch.hesge.cours634.todolist.metier.GestionnaireTache;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class GestionnaireTacheTest {

    @Test
    public void addTask() {
        User user = new User("test", "test");
        Tache task = new Tache(user, "test", new Date());
        GestionnaireTache manager = new GestionnaireTache();

        manager.addTask(user, task);


        Tache task2 = new Tache(user, "test", new Date());


        assertTrue(manager.getTasksUser(user).contains(task2));
    }

    @Test
    public void cancelTask() {
    }

    @Test
    public void editDate() {
    }
}