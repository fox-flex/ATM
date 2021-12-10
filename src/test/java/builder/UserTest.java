package builder;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UserTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void builder() {
        User user = User.builder()
                .name("Alala")
                .age(222)
                .gender("m")
                .weight(256)
                .height(240)
                .occupation("CS top")
                .build();

        assertEquals(user.getName(), "Alala");
        assertEquals(user.getAge(),222);
        assertEquals(user.getGender(), "m");
        assertEquals(user.getOccupations(), List.of("CS top"));
        assertEquals(user.getWeight(), 256);
        assertEquals(user.getHeight(), 240);

        User user0 = User.builder().build();
        assertNull(user0.getName());
        assertNull(user0.getGender());

        User userR = User.builder()
                .gender("dodo")
                .build();
        assertEquals("dodo", userR.getGender());
        assertNull(userR.getName());
        assertNull(userR.getRace());
    }
}