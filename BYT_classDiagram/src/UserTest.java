import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void loginTest() {

        User user = new User();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            user.setLogin("hello");
        });

    }

    @Test
    void passwordTest() {

        User user = new User();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            user.setPassword("hello");
        });

    }

}
