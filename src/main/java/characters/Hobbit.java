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
        toCry();
    }

}
