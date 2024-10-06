package Exceptions;
import java.util.Scanner;
import OOPS.*;
public class ExceptionEx {
    static String[] userNames;
    public static void main(String[] args){
////        userNames = new String[4];
////        userNames[0] = "yo";
////        userNames[1] = "yoyo";
////        userNames[2] = "honey";
////        userNames[3] = "singher";
////        Scanner sc = new Scanner(System.in);
////
////        while (true){
////            try {
////                int id = Integer.parseInt(sc.nextLine());
////                System.out.println("User name is " + getUserName(id));
////                /*throw new Exception("My Exception");
////                throw new RuntimeException("My Exception");*/
////            }
////            catch (ArrayIndexOutOfBoundsException e){
////                System.out.println("Err: Invalid Index");
////            }
////            catch (NumberFormatException e){
////                System.out.println("Err: Invalid Input");
////            }
////            catch (Exception e){
////                System.out.println("Err: Something Went Wrong");
////            }
////            finally {
////                System.out.println("Finally block gets executed");
////                //break;
////            }
////        }
//
//        /*while (true){
//
//            try{
//                int id = Integer.parseInt(sc.nextLine());
//                String uname=getUserName(id);
//                System.out.println("User name is "+uname);
//            }
//            catch(Exception e){
//                System.out.println("Err: Somethin Gone Wrong");
//            }
//
//        }*/
//
        User user1 = new User();
       /*try{
        user1.setAge(-10);}
       catch (Exception e){
         System.out.println("Invalid age");
     }*/
//        user1.setAge(-10);
        try {
            user1.setAge(-10);
        }
        catch (RuntimeException e){
            System.out.println("Invalid age");
        }
//
//
   }
    public static String getUserName(int id) {
        return userNames[id];
        }
}
