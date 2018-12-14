package gameManager;

import characters.Character;
import factory.CharacterFactory;

public class main {
    public static void main(String[] args) {
        CharacterFactory characterGen = new CharacterFactory();
        Character first = characterGen.createCharacter();
        System.out.println("First character is " + first);
        Character second = characterGen.createCharacter();
        System.out.println("Second character is " + second);
        fight(first, second);

    }
    static void fight(Character a, Character b){
        System.out.println("Let the battle begin!");
        while(true){
            a.kick(b);
            System.out.println(b.toString());
            if(b.getHp() <=  0){
                System.out.println(b.getClassName() + " died");
                break;}

            b.kick(a);
            System.out.println(a.toString());
            if(a.getHp() <= 0){
                System.out.println(a.getClassName() + " died");
                break;}
            }
    }
}
