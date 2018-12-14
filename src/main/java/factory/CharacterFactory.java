package factory;

import characters.*;
import characters.Character;
import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Random;

public class CharacterFactory {
    public HashMap<Integer, Class<? extends Character>> hm;
    public CharacterFactory(){
        hm = new HashMap<Integer, Class<? extends Character>>();
        hm.put(0, Hobbit.class);
        hm.put(1, Elf.class);
        hm.put(2, King.class);
        hm.put(3, Knight.class);

    }
    @SneakyThrows
    public Character createCharacter(){
        Random r = new Random();
        return hm.get(r.nextInt(4)).newInstance();
    }
}
