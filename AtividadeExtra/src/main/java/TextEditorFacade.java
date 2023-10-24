class TextEditorFacade {
    private TextDocument textDocument;
    private CharacterFactory characterFactory;

    public TextEditorFacade() {
        textDocument = new TextDocument();
        characterFactory = new CharacterFactory();
    }

    public void appendText(String text) {
        for (char c : text.toCharArray()) {
            Character character = characterFactory.getCharacter(c);
            textDocument.appendCharacter(character);
        }
    }

    public void printDocument() {
        textDocument.print();
    }
}