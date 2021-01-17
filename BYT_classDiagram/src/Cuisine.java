import java.util.List;

public class Cuisine {

    private String name;
    private String type;
    private List<Restaurant> restaurantList;
    private List<Customer> preferredBy;

    public Cuisine(String name, String type) {
        this.name = name;
        this.type = type;
        this.restaurantList = null;
        this.preferredBy = null;
    }

    public List<Customer> getPreferredBy() {
        return preferredBy;
    }

    public void setPreferredBy(List<Customer> preferedBy) {
        this.preferredBy = preferedBy;
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
