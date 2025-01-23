package gr.aueb.cf.ch17.Knight;

public class KnightMain {
    private final static Runnable joa = new Knight("Joa");
    private final static Runnable whiteKnight = new Knight("White-knight");
    private final static Runnable saintGeorge = new Knight("Saint George");

    public static void main(String[] args){
        (new Thread(joa)).start();
        (new Thread(whiteKnight)).start();
        (new Thread(saintGeorge)).start();
    }
}
