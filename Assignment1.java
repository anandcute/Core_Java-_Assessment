import java.util.Scanner;
public class Assignment1 {
    public int a ;
    public int b;
    public int c;
    public static void protect(){
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the first number:");
       int ab = scanner.nextInt();
       System.out.println("Enter the second no:");
       int bb=scanner.nextInt();
       System.out.println("product of the two numbers:"+ (ab*bb));
    }
    public int areaOfSquare(int a){
       
        return a*a;
        
    }   
    public int areaOfRectangle(int a,int b ){
        
        return a*b;
    }
    public static void main(String[] args) {
        Assignment1 in = new Assignment1();
        
        protect();
        System.out.println("Area of square" + in.areaOfSquare(10));
        System.out.println("Area of rectangle" + in.areaOfRectangle(10, 9));

    }
}



    
    



    

