package GameInterface.Character.NPC;

import GameInterface.Character.Character;

import java.util.List;

public interface Stranger extends Character {

    /** Возвращает список фраз, используемых Stranger в диалоге **/
    public List<String> getPhrases();

    /** Возвращает список историй, используемых Stranger в диалоге и отсылающих к лору **/
    public List<String> getStories();

}
