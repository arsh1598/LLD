import model.InMemoryDB;
import services.TheatreService;

public class Main {
    public static void main(String[] args) {
        InMemoryDB db = InMemoryDB.getInstance();
        TheatreService theatreService = new TheatreService(db);

        theatreService.createTheatre("ATheatre");
        System.out.println(theatreService.getAll());
    }
}