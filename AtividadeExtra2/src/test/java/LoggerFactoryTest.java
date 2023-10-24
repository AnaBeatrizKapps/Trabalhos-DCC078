import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoggerFactoryTest {
    private LoggerFactory loggerFactory;

    @Before
    public void setUp() {
        loggerFactory = LoggerFactory.getInstance();
    }

    @Test
    public void testCreateConsoleLogger() {
        Logger consoleLogger = loggerFactory.createLogger("Console");
        assertNotNull(consoleLogger);
        assertTrue(consoleLogger instanceof ConsoleLogger);
    }

    @Test
    public void testCreateFileLogger() {
        Logger fileLogger = loggerFactory.createLogger("File");
        assertNotNull(fileLogger);
        assertTrue(fileLogger instanceof FileLogger);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalidLogger() {
        Logger invalidLogger = loggerFactory.createLogger("InvalidType");
    }
}
