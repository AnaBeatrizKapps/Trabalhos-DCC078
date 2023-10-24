import java.util.HashMap;
import java.util.Map;

class CharacterFactory {
    private Map<String, Character> characters = new HashMap<>();

    public Character getCharacter(char c) {
        String characterKey = String.valueOf(c);

        if (!characters.containsKey(characterKey)) {
            characters.put(characterKey, new Character(c));
        }
        return characters.get(characterKey);
    }
}