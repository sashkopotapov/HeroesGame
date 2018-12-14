package kickbehavior;
import characters.Character;
public class OrdinaryBehavior implements Behavior {
    public void kick(Character character, Character enemy) {
        enemy.setHp(enemy.getHp() - character.getPower());

    }
}
