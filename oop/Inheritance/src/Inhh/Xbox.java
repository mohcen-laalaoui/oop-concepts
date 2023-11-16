package Inhh;

public class Xbox extends Machine{
    private String game;
    private String manette;

    public Xbox(String proc , String carte , int ram , int rom , String game , String manette){
        super(proc , carte , ram , rom);
        this.game = game;
        this.manette = manette;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getGame() {
        return this.game;
    }

    public void setManette(String manette) {
        this.manette = manette;
    }

    public String getManette() {
        return this.manette;
    }

    public void display(){
        super.disp();
        System.out.println(" Le jeu est: " +this.getGame() +" La manette est: " +this.getManette());
    }
}
