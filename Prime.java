package Looping;

public class Prime {
    public static void main(String[] args) {
        int n=625;
        boolean flag = true;
        for(int i=2; i+i < n; i++){
            System.out.println(i);
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        System.out.println(flag);

        for(int i = 1; i <= 10; i++){
            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
