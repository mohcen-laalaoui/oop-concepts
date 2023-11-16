package Inhh;

public class PC extends Machine{
    private String mouse;
    private String keyboard;

    public PC(String proc , String carte , int ram , int rom , String mouse , String keyboard){
        super(proc , carte , ram , rom);
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getMouse() {
        return this.mouse;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getKeyboard() {
        return this.keyboard;
    }

    public void display(){
        super.disp();
        System.out.println(" La souris est: " +getMouse() + " Le clavier est: " +getKeyboard());
    }
}
