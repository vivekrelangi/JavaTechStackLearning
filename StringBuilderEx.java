package Strings;

public class StringBuilderEx {
    public static void main(String[] args) {


        StringBuilder s1 = new StringBuilder("Hello");/*if your are using single threaded environment use string builder
        because in StringBuffer to maintain synchronization there is a computation override*/

//        s1.replace(2,3,"bb");
        /*s1.replace(2,4,"bb");
        s1.append(" World!");
        s1.reverse();*/
        s1.replace(2, 4, "bb").append(" World!").reverse();
        System.out.println(s1);//Unlike String object StringBuffer object value is modified
    }
}
