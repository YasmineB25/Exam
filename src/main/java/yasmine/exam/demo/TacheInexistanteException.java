package yasmine.exam.demo;


public class TacheInexistanteException extends Exception {
    public TacheInexistanteException(String message) {
       // super(message);

       System.out.println("La tâche avec le titre '" + message + "' n'existe pas.");
    }
}

