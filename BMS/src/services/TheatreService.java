package services;

import model.InMemoryDB;
import model.Theatre;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TheatreService {

    private InMemoryDB db;

    public TheatreService(InMemoryDB db){
        this.db = db;
    }
    public void createTheatre(final String theatreName) {
        Theatre theatre = new Theatre(UUID.randomUUID().toString(), theatreName);
        db.getTheatres().put(theatre.getTheatreId(), theatre);
    }
    public Map<String, Theatre> getAll() {
        return db.getTheatres();
    }

}
