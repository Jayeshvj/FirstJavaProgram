public class ArrayCase {
    
public static void main(String[] args){
    int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
    int b[][] = {{1,3,4},{2,4,3},{1,2,4}};
    int[][] c = new int[1][3];
    int sum = 0;
    System.out.println("The addition of Matrix:");
    for(int i =0;i<3;i++){
        for(int j =0;j<3;j++){
        System.out.print(a[i][j]+b[i][j]+" ");
        }
     System.out.println();
    }
    System.out.println("The Multiplication of Matrix: ");
    for(int i=0;i<3;i++){
        sum = 0;
        for(int j=0; j<3;j++){        
            sum = sum + (a[i][j]*b[j][i]);
       }
     System.out.print(sum+" ");
     
    }
    System.out.println();
}
}


