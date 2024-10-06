package Basics;

public class OperatorsSample {
    public static void main(String[] args) {
        //assignment operators =,+=,-=,&=,|=,.....
        int x=7,y=8,z=9;
        double a=7,b=8,c=9;
        //unary operators
        System.out.println(x--);/*,-x,y++,++y,z--,--z);*/
        //binary operators
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        System.out.println(a/b);
        double c1=x+y-z*a/b;
        System.out.println(c1);
        //bitwise operators
        System.out.println(~x);
        System.out.println(x|y);
        System.out.println(x&y);
        System.out.println(x^y);
        //relational operators
        System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println(x<=y);
        System.out.println(x<y);
        System.out.println(x==y);
        System.out.println(x!=y);
        //shift operators
        System.out.println(x>>y);
        System.out.println(x<<y);
        System.out.println(x>>>y);
        //logical operators
        System.out.println((x<y)&&(x>y));
        System.out.println((x<y)||(x>y));
        System.out.println((x<y)&(x>y));
        System.out.println((x<y)|(x>y));
        //terinary operators
        int ter=(x<y)?1:2;
        System.out.println(ter);
        //type casting
        a=++x;
        x=(int)++a;
        System.out.println(a+"yo");
        System.out.println(x+"yoyo");
        //type conversion
        a=x;
        System.out.println(a+"huh");
    }
}
