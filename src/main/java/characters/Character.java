package characters;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;

import java.util.Random;

@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class Character {

    private int power;
    private int hp;
    public static Random rnd = new Random();

    public abstract void kick(Character character);
    public boolean isAlive(){
        return hp > 0;
    }

    public String getClassName(){
        String name  = this.getClass().toString();
        return name.substring(17, name.length());
    }

    @Override
    public String toString() {
        return this.getClassName() + " - hp: " + this.getHp() + " power: " + this.getPower() ;
    }
}
