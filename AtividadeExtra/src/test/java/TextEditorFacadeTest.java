import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class TextEditorFacadeTest {
    private TextEditorFacade textEditor;
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    @Before
    public void setUp() {
        textEditor = new TextEditorFacade();
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testTextEditorWithFacade() {
        textEditor.appendText("Hello, ");
        textEditor.appendText("Design Patterns!");
        textEditor.printDocument();
        String result = outputStream.toString().trim(); // Remove espaços em branco extras
        assertEquals("Hello, Design Patterns!", result);
    }

    @Test
    public void testEmptyTextEditor() {
        textEditor.printDocument();
        String result = outputStream.toString().trim();
        assertEquals("", result);
    }

    @Test
    public void testSingleCharacterTextEditor() {
        textEditor.appendText("A");
        textEditor.printDocument();
        String result = outputStream.toString().trim();
        assertEquals("A", result);
    }

    @Test
    public void testSpecialCharactersTextEditor() {
        textEditor.appendText("A&B < >");
        textEditor.printDocument();
        String result = outputStream.toString().trim();
        assertEquals("A&B < >", result);
    }
}
