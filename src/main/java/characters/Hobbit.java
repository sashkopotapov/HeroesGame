package characters;

public class Hobbit extends Character{
    public Hobbit(){
        super(0, 3);
    }
    private void toCry(){
        System.out.println("Hobbit cries");
    }

    public void kick(Character character) {

        System.out.println("Hobbit does not fight with " + character.getClassName());
        if(character.getClassName().equals("Hobbit")){
            System.out.println("Hobbits make deal and first pretends to be dead");
            character.setHp(0);
        }
        else{ toCry();}
    }

}
