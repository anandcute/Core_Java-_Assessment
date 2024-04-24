import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ListOfStream {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(20, 33, 44,1,2,3,9,7,5,25,97,75,65,87,31,27,20, 33, 44, 55, 6, 77, 88, 66, 21, 98,
                100, 32, 22, 11, 33, 55, 6, 66, 66, 98, 21));

        // STREAM API

        List <Integer> dulicate=al.stream()
                                .sorted()
                                .distinct()
                                .toList();
        List <Integer> evennum=dulicate.stream()
                                 .filter(number -> number%2 == 0 )  
                                 .toList();  
        int sumOfEven = evennum.stream()
                                .mapToInt(Integer :: intValue)
                                .sum(); 
        List <Integer> oddnum =al.stream()
                                 .sorted() 
                                  .distinct()
                                  .filter(x -> x %2 !=0)
                                  .toList();                        
                                                   
        System.out.println("Original list :" + al );        
        System.out.println("\nDuplicate remove list:" + dulicate);
        System.out.println("\nOdd list : " + oddnum);
        System.out.println("\nSum of Even list: " + sumOfEven);
    }
}
