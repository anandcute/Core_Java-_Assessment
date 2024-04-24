import java.util.Scanner;

interface MyInterfac{
   public void displayDetails();
}
class Vehicle implements MyInterfac{
    protected String make;
    protected String model;
    protected int year;
    protected int prize;
    Vehicle(String make , String model, int year , int prize ){
        this.make=make;
        this.model =model;
        this.year=year;
        this.prize=prize;
    }
    public void displayDetails(){
        System.out.println("\n1.Make :" + this.make + "\n2.Model : " + this.model + " \n3.Year : "+ this.year + " \n4.prize : " + this.prize);
    }

}

class Car extends Vehicle {
    private boolean isSportCar;
    Car(String make , String model, int year , int prize,boolean isSportCar){
        super(make,model,year,prize);
        this.isSportCar=isSportCar;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("5.sportscar: " + this.isSportCar );
        
    }
}
class Truck extends Vehicle {
    private int loadcapacity;
    Truck(String make , String model, int year , int prize,int loadcapacity){
        super(make,model,year,prize);
        this.loadcapacity=loadcapacity;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("5.load capacity "+  this.loadcapacity + "ton" );
        
    }
}
class MotorCycle extends Vehicle {
	String superBikes; 
    MotorCycle(String make, String model, int year, int prize,String superBikes ) {
		super(make, model, year, prize);
		// TODO Auto-generated constructor stub
		this.superBikes=superBikes;
	}
	
        
    
    public void displayDetails(){
        super.displayDetails();
        System.out.println("5.FavBikes" + this.superBikes );
        
    }
}
public class VehicleDemo {
	public static void main(String[] args) {
		System.out.println("*********WELCOME TO TRANSPORTATION COMPANY********* \n");
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("\n Select any of Vehicles...");
            System.out.println("____________________________");
			System.out.println("\n 1.Car \n 2.Truck \n 3.Motor Cycle \n 4.Exit \n");
			System.out.println("Yours choice :");
			int choice = scanner.nextInt();
		switch(choice) {
			case 1:
				Car car =new Car("Audi","IWE0002328897",2019,500000,true);
				car.displayDetails();
				break;
			case 2:
				Truck truck =new Truck("Tata","FM-11220",2023,4000000,1);
				truck.displayDetails();
				break;
			case 3:
				MotorCycle bike =new MotorCycle("Yamaha","IM0045CXZ1126",2024,220000,"R15 V4");
				bike.displayDetails();
				break;
			case 4 :
				System.out.println("Existing.......!");
				System.exit(choice);
			default:
				System.out.println("Error!...Invalid choice!");
			}
            System.out.println("*****************************");
		}
	}
}
			