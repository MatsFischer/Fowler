import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Enumeration;

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

    @Test
    @DisplayName("Get Statement")
    public void getStatement() {
        String statement = "Rental Record for Sarah" + "\n";
        statement += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        statement += "Amount owed is " + "0.0" + "\n";
        statement += "You earned " + "0" + " frequent renter points";

        assertEquals(statement, customer.statement());
    }

    @Test
    @DisplayName("Get HTML Statement")
    public void getHTMLStatement() {
        String htmlStatement = "<H1>Rentals for <EM>Sarah</EM></ H1><P>\n";
        htmlStatement += "<P>You owe <EM>0.0</EM><P>\n";
        htmlStatement += "On this rental you earned <EM>0</EM> frequent renter points<P>";

        assertEquals(htmlStatement, customer.htmlStatement());
    }
}