import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RestaurantTest {

    @Test
    public void testIsAvailable() throws ParseException {

        String sDate1="31/12/1998";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);


        Restaurant restaurant = new Restaurant();
        Assertions.assertThrows(Exception.class, () -> {
            restaurant.isAvailable(date1);
        });
    }
}
