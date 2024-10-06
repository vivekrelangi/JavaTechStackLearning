package MultiDimensionalArrays;

public class Example {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int[][] arr1 = {{1,2,3},{4,5,6}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println(arr1[i][j]);
            }
        }
    }
}
