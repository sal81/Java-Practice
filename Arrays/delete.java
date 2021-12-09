import java.io.*;
//delete x in array
public class delete {
    static int deleteElem(int[] arr, int n, int x)
    {
        int i;
         for(i=0;i<n;i++){
            if(arr[i] == x)
                break;
         }
            if(i<n){
                n=n-1;
                for(int j=i;j<n;j++)
                    arr[j] = arr[j+1];
                }
            return n; 
    }
    public static void main(String[] args){
        int[] arr = {6, 8, 12, 15, 45, 67, 78};
        int n = arr.length;
        System.out.println("Original Array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
        int x = 12;
        n = deleteElem(arr, n, x);
        System.out.println("Modified Array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
