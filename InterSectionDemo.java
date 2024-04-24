import java.util.Arrays;

public class InterSectionDemo {
    public static void main(String[] args) {
        int array[] = new int[]{2,3,4,5,6};
        int array1[] = new int[]{3,4,6,8,1};
        int minimumvalue=Math.min(array.length, array1.length);
        int arr[]=new int[minimumvalue];
        int k=0;

        for(int i=0; i<array.length; i++){
            for (int j=0; j<array1.length;j++){
               if(array[i]==array1[j]){
                arr[k]=array[i];
                k++;
                break;
               }
            }
        }
        int[] result=Arrays.copyOf(arr, k);
        System.out.println("Intersection order :" +Arrays.toString(result));
    }
    
}
