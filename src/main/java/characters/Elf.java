package characters;

public class Elf extends Character{
    public Elf(){
        super(10, 10);
    }
    public void kick(Character character) {

        if(this.getPower() > character.getPower()){
            System.out.println("Elf kills " + character.getClassName());
            character.setHp(0);
        }
        else{
            System.out.println("Elf is to weak, power of " + character.getClassName() + " is decreased");
            character.setPower(character.getPower()-1);
        }
    }
}
