import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer extends User{

    private String email;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String city;
    private String state;
    private String country;
    private List<String> listOfInterests;
    private boolean isMatched;
    private List <Customer> listOfCustomers;
    private List <Cuisine> listOfCuisines;
    private List <Restaurant> recommendedRestaurants;
    private CreditCard creditCard;
    private List<Picture> pictures;

    public Customer(){

    }

    public Customer(CreditCard creditCard, List <Cuisine> listOfCuisines, String login, String password, Date dateCreated, String email, String name, String surname, LocalDate birthDate, String city, String state, String country, List<String> listOfInterests, boolean isMatched) {
        super(login, password, dateCreated);
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.city = city;
        this.state = state;
        this.country = country;
        this.listOfInterests = listOfInterests;
        this.isMatched = isMatched;
        this.listOfCustomers = null;
        this.listOfCuisines = listOfCuisines;
        this.recommendedRestaurants = null;
        this.creditCard = creditCard;
        this.pictures = null;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public List<Restaurant> getRecommendedRestaurants() {
        return recommendedRestaurants;
    }

    public void setRecommendedRestaurants(List<Restaurant> recommendedRestaurants) {
        this.recommendedRestaurants = recommendedRestaurants;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        Pattern regex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = regex.matcher(email);

        if(!matcher.find()){
            throw new Exception("incorrect format for email");
        }
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {

        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) throws Exception {
        Period diff = Period.between(birthDate, LocalDate.now());
        if(diff.getYears()<18){
            throw new Exception("The user must be at least 18 years old");
        }
        this.birthDate = birthDate;
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

    public List<String> getListOfInterests() {
        return listOfInterests;
    }

    public void setListOfInterests(List<String> listOfInterests) {
        this.listOfInterests = listOfInterests;
    }

    public boolean isMatched() {
        return isMatched;
    }

    public void setMatched(boolean matched) {
        isMatched = matched;
    }

    public int cancelSubstriction(){
        return 0;
    }

    public int findMatches(){
        return 0;
    }

    public int setUpCuisines(){
        return 0;
    }

    public int chooseMatch(){
        return 0;
    }
}
