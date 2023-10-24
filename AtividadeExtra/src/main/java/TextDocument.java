import java.util.ArrayList;
import java.util.List;

class TextDocument {
    private List<Character> characters = new ArrayList<>();

    public void appendCharacter(Character character) {
        characters.add(character);
    }

    public void print() {
        for (Character character : characters) {
            character.print();
        }
        System.out.println();
    }
}