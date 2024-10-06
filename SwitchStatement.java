package Branching;

public class SwitchStatement {
    public static void main(String[] args) {
        char c = 'I';
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }
    }
}
