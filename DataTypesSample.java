package Basics;

public class DataTypesSample {
    public static void main(String[] args) {
        //Integer types
        byte a=+127;
        short b=-32767;
        int c=+2147483436;
        long d=-924203685345L;
        System.out.println("byte value is "+a);
        System.out.println("short value is "+b);
        System.out.println("int value is "+c);
        System.out.println("long value is "+d);
        //float types
        float e=+1.345F;
        double f=-1.23456;
        System.out.println("float value is "+e);
        System.out.println("double value is "+f);
        //character types
        char g='V';
        char unicodeno=1000;
        System.out.println("char value is "+g);
        System.out.println("char corresponding to unicode value is "+unicodeno);
        //boolean types
        boolean i=false;
        boolean j=true;
        System.out.println("boolean value is "+i);
        System.out.println("boolean value is "+j);
        float k=(float) f;
        System.out.println("explicit type casted value is "+k);
        //constants
        final int l=7;
        System.out.println("constant value is "+l);
    }
}
