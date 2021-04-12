package Task3.J03;

import java.util.ArrayList;
import java.util.List;

public class City {
    String name;
    String state;
    List<TouristPlace> touristPlaceList;

      City(String name, String state) {
        this.name = name;
        this.state = state;
        touristPlaceList = new ArrayList<>();
    }
}
