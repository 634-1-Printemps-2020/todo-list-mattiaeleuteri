package domaine;

import java.util.Objects;

public class Tache {
    private String createur;
    private String description;
    private String date;
    enum Status {open, closed, canceled}
    private Status status;
    enum Resolution {done, ignored}
    private Resolution resolution;

    public Tache(String createur, String description, String date, Status status, Resolution resolution) {
        this.createur = createur;
        this.description = description;
        this.date = date;
        this.status = status;
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
