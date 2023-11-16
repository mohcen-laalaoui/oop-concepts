import Inhh.Machine;
import Inhh.PC;
import Inhh.Xbox;

public class Main {
    public static void main(String[] args) {
        Machine m1 = new Machine("intel i7" , "gtx 1080" , 16 , 512);
        Machine m2 = new Machine("raizen 5" , "rtx 2080ti" , 16 , 1024);

        m1.disp();
        m2.disp();

        Xbox c1 = new Xbox("intel i5" , "gtx 1660" , 16 , 256 , "fifa23" , "manet");
        Xbox c2 = new Xbox("intel i9" , "gtx 1080" , 32 , 1024 , "GTA V" , "manett");

        c1.display();
        c2.display();

        PC p1 = new PC("raizen 7" , "gtx 1060" , 16 , 128 , "souris" , "led");
        PC p2 = new PC("raizen 5" , "gtx 1080" , 32 , 512 , "so" , "classic");

        p1.display();
        p2.display();

    }
}