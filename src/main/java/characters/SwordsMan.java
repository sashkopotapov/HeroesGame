package characters;

public class SwordsMan extends Character{
    public SwordsMan(int min, int max){
        super(rnd.nextInt(max-min+1)+min, rnd.nextInt(max-min + 1)+ min);
    }
    public void kick(Character c){
        int bite = rnd.nextInt(this.getPower()+1);
        System.out.println(this.getClassName() + " kicks " + c.getClassName() + " for " + bite);
        c.setHp((c.getHp())-bite);
    }
}
