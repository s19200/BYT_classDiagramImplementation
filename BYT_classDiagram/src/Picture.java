import java.util.Date;

public class Picture {
    private String name;
    private String url;
    private Date dateUploaded;
    private Customer customer;

    public Picture(String name, String url, Date dateUploaded, Customer customer) {
        this.name = name;
        this.url = url;
        this.dateUploaded = dateUploaded;
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(Date dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
