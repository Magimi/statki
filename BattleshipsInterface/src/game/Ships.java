package game;

public class Ships {
    public int length;
    public  boolean hor;
    public boolean ver;
    public Ships(int length,boolean hor,boolean ver){
        this.ver = ver;
        this.hor = hor;
        this.length = length;
    }

    /*Ilośc potrzebna do rozmieszczenia*/
    public static int quantityShip1 = 4;
    public static int quantityShip2 = 3;
    public static int quantityShip3 = 2;
    public static int quantityShip4 = 1;
    /*Ilość potrzebna do wyznaczenia wygranej*/
    public static int lenghtShip1 = 4;
    public static int lenghtShip2 = 3;
    public static int lenghtShip3 = 2;
    public static int lenghtShip4 = 1;
}