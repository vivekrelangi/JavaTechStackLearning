package DSA;

class ArrayTest{
    public static void insert(char[] ar,int pos,char val){
        for(int i=ar.length-1;i>=pos;i--){
            ar[i]=ar[i-1];
        }
        ar[pos-1]=val;
    }
}
class ArrayInsertion{
    public static void main(String[] args) {
        char arr[]=new char[6];
        arr[0]='A';
        arr[1]='B';
        arr[2]='C';
        arr[3]='D';
        arr[4]='E';
        ArrayTest.insert(arr,3,'J');
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}