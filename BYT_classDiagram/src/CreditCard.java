import java.util.Date;

public class CreditCard {
    private Date subscriptionDate;
    private Date nextPaymentDate;
    private long cardNo;
    private Date expiryDate;
    private Customer owner;

    public CreditCard(Customer owner, Date subscriptionDate, Date nextPaymentDate, long cardNo, Date expiryDate) {
        this.subscriptionDate = subscriptionDate;
        this.nextPaymentDate = nextPaymentDate;
        this.cardNo = cardNo;
        this.expiryDate = expiryDate;
        this.owner = owner;
    }

    public CreditCard() {
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public Date getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(Date subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public Date getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(Date nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }

    public long getCardNo() {
        return cardNo;
    }

    public void setCardNo(long cardNo) {
        this.cardNo = cardNo;
    }

    public Date getExpiryDate() {

        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) throws Exception {
        Date now = new Date();
        if(expiryDate.before(now)){
            throw new Exception ("Given date is in the past");
        }
        this.expiryDate = expiryDate;
    }

    public int chargeCard(){
        return 0;
    }
}
