package four;

public class PlainRect extends Rect{
    protected double starX;
    protected double starY;

    public PlainRect(double height, double width, double starX, double starY) {
        super(height, width);
        this.starX = starX;
        this.starY = starY;
    }

    public PlainRect() {
        super(0,0);
        this.starX = 0;
        this.starY = 0;
    }
    public boolean isInside(double x, double y){
        if(this.starX+super.width>=x && this.starX>=x && this.starY>=y && this.starY-super.height<y)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "PlainRect{" +
                "starX=" + starX +
                ", starY=" + starY +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
