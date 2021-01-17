import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreditCardTest {

    @Test
    public void testSetExpiryDate() throws ParseException {

        String sDate1="31/12/2020";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);

        CreditCard creditCard = new CreditCard();
        Assertions.assertThrows(Exception.class, () -> {
            creditCard.setExpiryDate(date1);
        });
    }
}
