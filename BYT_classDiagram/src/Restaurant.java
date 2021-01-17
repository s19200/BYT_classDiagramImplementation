import java.util.Date;
import java.util.List;

public class Restaurant {
    private String name;
    private String city;
    private String state;
    private String country;
    private List<Cuisine> listOfCuisines;
    private List <Customer> listOfCustomers;

    public Restaurant() {
    }

    public Restaurant(List<Cuisine> listOfCuisines, String name, String city, String state, String country) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.listOfCuisines = listOfCuisines;
        listOfCustomers = null;
    }

    public List<Cuisine> getListOfCuisines() {
        return listOfCuisines;
    }

    public void setListOfCuisines(List<Cuisine> listOfCuisines) {
        this.listOfCuisines = listOfCuisines;
    }

    public List<Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    public void setListOfCustomers(List<Customer> listOfCustomers) {
        this.listOfCustomers = listOfCustomers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int showAvailableTime(){
        return 0;
    }

    public int isAvailable(Date date) throws Exception {
        Date now = new Date();
        if(date.before(now)){
            throw new Exception ("Given date is in the past");
        }
        return 0;
    }
}
