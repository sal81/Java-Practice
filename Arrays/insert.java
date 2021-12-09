import java.util.Arrays;
public class insert {
    public static void main(String args[]){
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int len = arr1.length;
        int index=3;
        int[] arr2 = new int [len+1];
        int j=0;
        System.out.println("Original array: " +Arrays.toString(arr1));

        for (int i=0;i<len+1;i++){
            if(i == index){
                arr2[i] = 45;
            }
            else{
                arr2[i] = arr1[j];
                j++;
                
            }
            // arr2[index] = 45;
            }
            System.out.println("New array: " +Arrays.toString(arr2));
        }
    }

