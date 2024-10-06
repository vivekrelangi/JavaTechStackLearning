package Arrays;

import java.util.Arrays;

public class ArrayofObjects {
    public static void main(String[] args) {
        Point[] points = new Point[5];
        points[0] = new Point(0,0);
        points[1] = new Point(1,-2);
        System.out.println(Arrays.toString(points));
        for(Point p:points){
            System.out.println(p);
        }
    }
}

class Point{
    int x,y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString(){
        return "("+x+", "+y+")";
    }
}
