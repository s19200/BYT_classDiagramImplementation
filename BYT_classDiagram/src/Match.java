import java.util.Date;
import java.util.List;

public class Match {
    private List <String> listOfMutualCuisines;
    private List <String> listOfMutualInterests;
    private List <String> listOfMessages;
    private Customer customer1;
    private Customer customer2;

    public Match(List<String> listOfMutualCuisines, List<String> listOfMutualInterests, List<String> listOfMessages, Customer customer1, Customer customer2) {
        this.listOfMutualCuisines = listOfMutualCuisines;
        this.listOfMutualInterests = listOfMutualInterests;
        this.listOfMessages = listOfMessages;
        this.customer1 = customer1;
        this.customer2 = customer2;
    }

    public Customer getCustomer1() {
        return customer1;
    }

    public void setCustomer1(Customer customer1) {
        this.customer1 = customer1;
    }

    public Customer getCustomer2() {
        return customer2;
    }

    public void setCustomer2(Customer customer2) {
        this.customer2 = customer2;
    }

    public List<String> getListOfMutualCuisines() {
        return listOfMutualCuisines;
    }

    public void setListOfMutualCuisines(List<String> listOfMutualCuisines) {

        this.listOfMutualCuisines = listOfMutualCuisines;
    }

    public List<String> getListOfMutualInterests() {
        return listOfMutualInterests;
    }

    public void setListOfMutualInterests(List<String> listOfMutualInterests) {
        this.listOfMutualInterests = listOfMutualInterests;
    }

    public List<String> getListOfMessages() {
        return listOfMessages;
    }

    public void setListOfMessages(List<String> listOfMessages) {
        this.listOfMessages = listOfMessages;
    }

    public int bookRestaurant(Date reservationDate){
        return 0;
    }

    public int seeAvailability(Date date){
        return 0;
    }
}
