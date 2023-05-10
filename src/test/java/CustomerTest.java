import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    private Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer("Sarah");
    }

    @Test
    @DisplayName("Get Name")
    public void getName() {
        assertEquals("Sarah", customer.getName());
    }
}