import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CustomerTest {

    @Test
    public void testBirthDate(){

            Customer customer = new Customer();
            Assertions.assertThrows(Exception.class, () -> {
                customer.setBirthDate(LocalDate.now());
            });
        }

        @Test
    public void testSetEmail(){
            Customer customer = new Customer();
            Assertions.assertThrows(Exception.class, () -> {
                customer.setEmail("s19200@gmail");
            });
        }
    }
