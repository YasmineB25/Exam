package yasmine.exam.demo;

public class Tache {

    private String titre;
    private String description;
    private boolean complete;
    private int duree;

    public Tache(String titre, String description, int duree) {
        this.titre = titre;
        this.description = description;
        this.complete = false;
        this.duree = duree;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    public int getDuree() {
        return duree;
    }
    @Override
    public String toString() {
        return "Tache{" +
                "titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", complete=" + complete +
                '}';
    }
}

