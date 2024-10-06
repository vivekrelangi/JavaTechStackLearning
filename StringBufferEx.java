package Strings;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Hello");//Use string buffer in multithreaded environment
        //Even though this supports synchronization do not use it for single threaded environment
//Explanation in StringBuilderEx
//        s1.replace(2,3,"bb");
        /*s1.replace(2,4,"bb");
        s1.append(" World!");
        s1.reverse();*/
        s1.replace(2,4,"bb").append(" World!").reverse();
        System.out.println(s1);//Unlike String object StringBuffer object value is modified
    }
}
