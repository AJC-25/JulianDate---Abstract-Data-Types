import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JulianDateTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

    @Test
    public void testJulianDateNow()
    {
        JulianDate julianDa1 = JulianDate.now();
        int now = julianDa1.get();
        assertEquals(now, julianDa1.get());
    }

    @Test
    public void testDaysBetween()
    {
        JulianDate julianDa1 = new JulianDate();
        assertEquals(0, julianDa1.get());
        int between = julianDa1.JulianDaysBetween();
        assertEquals(between, julianDa1.JulianDaysBetween());
    }

    @Test
    public void testYesterday()
    {
        JulianDate julianDa1 = new JulianDate();
        assertEquals(0, julianDa1.get());
        int yesterday = julianDa1.JulianDateYesterday();
        assertEquals(yesterday, julianDa1.JulianDateYesterday());
    }

    @Test
    public void testTomorrow()
    {
        JulianDate julianDa1 = new JulianDate();
        assertEquals(0, julianDa1.get());
        int tomorrow = julianDa1.JulianDateTomorrow();
        assertEquals(tomorrow, julianDa1.JulianDateTomorrow());
    }
}
