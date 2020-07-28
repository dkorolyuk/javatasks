package home.task12;

public class Point {
    public float x;
    public float y;

    public Point() {
    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 3);
        Point p2 = new Point(2, 4);
        System.out.println(distance(p1, p2));

    }
    //calculate distance
    public static float distance(Point p1, Point p2){
        return (float) Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y) );
    }

    //generate new point
    public static Point generatePoint(){
        float x = (float) Math.floor(Math.random() * Math.floor(100));
        float y = (float) Math.floor(Math.random() * Math.floor(100));
        return new Point(x,y);
    }


}
