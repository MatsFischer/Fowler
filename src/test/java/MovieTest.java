import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    private Movie movie;

    @BeforeEach
    public void setUp() {
        movie = new Movie("Movie Title", 0);
    }

    @Test
    @DisplayName("Get PriceCode")
    public void getPriceCode() {
        assertEquals(0, movie.getPriceCode());
    }

    @Test
    @DisplayName("Get Title")
    public void getTitle() {
        assertEquals("Movie Title", movie.getTitle());
    }
}