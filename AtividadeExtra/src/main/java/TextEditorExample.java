public class TextEditorExample {
    public static void main(String[] args) {
        TextEditorFacade textEditor = new TextEditorFacade();
        textEditor.appendText("Hello, ");
        textEditor.appendText("Design Patterns!");
        textEditor.printDocument();
    }
}