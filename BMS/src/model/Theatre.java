package model;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private String theatreId;
    private String name;
    private List<Screen> screens;

    public String getTheatreId() {
        return theatreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Theatre(String theatreId, String name) {
        this.theatreId = theatreId;
        this.name = name;
        this.screens = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "theatreId='" + theatreId + '\'' +
                ", name='" + name + '\'' +
                ", screens=" + screens +
                '}';
    }
}
