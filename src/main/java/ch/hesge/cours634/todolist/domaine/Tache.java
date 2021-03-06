package ch.hesge.cours634.todolist.domaine;

import java.util.Date;
import java.util.Objects;

public class Tache {
    private User createur;
    private String description;
    private Date date;
    private Status status;
    private Resolution resolution;

    public Tache(User createur, String description, Date date) {
        this.createur = createur;
        this.description = description;
        this.date = date;
        this.status = Status.OPEN;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tache tache = (Tache) o;
        return createur.equals(tache.createur) &&
                description.equals(tache.description) &&
                date.equals(tache.date) &&
                status == tache.status &&
                resolution == tache.resolution;
    }

    @Override
    public int hashCode() {
        return Objects.hash(createur, description, date, status, resolution);
    }

    @Override
    public String toString() {
        return "Tache{" + '\n' +
                "createur:'" + createur + '\n' +
                "description:'" + description + '\n' +
                "date:'" + date + '\n' +
                "status:" + status + '\n' +
                "resolution:" + resolution + '\n' +
                '}';
    }
}
