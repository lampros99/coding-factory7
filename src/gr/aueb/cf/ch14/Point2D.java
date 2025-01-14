package gr.aueb.cf.ch14;

public class Point2D extends Point{
    private double y;

    public Point2D(){
        // super();   // Ως 1η εντολή καλεί τον default constractor της point.
       //  y = 0;
    }

    public Point2D(double x, double y){
        super(x);
//        this.setX(x);
        this.y =y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Liskov substitution priciple
    @Override
    public String pointToString() {
        return super.pointToString() + "(" + y + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y+=10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

}
