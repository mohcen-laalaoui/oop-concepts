package Inhh;

public class Machine {
    private String proc;
    private String cart;
    private int ram;
    private int rom;

    public Machine(String proc, String cart, int ram, int rom) {
        this.proc = proc;
        this.cart = cart;
        this.ram = ram;
        this.rom = rom;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public String getProc() {
        return this.proc;
    }

    public void setCart(String cart) {
        this.cart = cart;
    }

    public String getCart() {
        return this.cart;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return this.ram;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public int getRom() {
        return this.rom;
    }

    public void disp() {
        System.out.println(" Le processeur est: " + this.getProc() + " La carte graphique est: " + this.getCart()
                + " La ram est: " + this.getRam() + "La rom est: " + this.getRom());
    }
}