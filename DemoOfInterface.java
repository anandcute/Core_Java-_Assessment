interface Drawable{
    public void  methodDraw();
}
class Circle implements Drawable{
    public void methodDraw(){
        double pie = 3.14;
        int r = 5 ;
        int radius= r * r ;
        double area = pie * radius;
        System.out.println("Area of circle is  "+ area );
    }
}
class Square implements Drawable{
    public void methodDraw(){
        int a = 10 ;
        int area= a * a;
        System.out.println("Area of square is  "+ area ); 
    }
}    




public class DemoOfInterface {
    public static void main(String[] args) {
        Circle c =new Circle();
        c.methodDraw();

        Square s =new Square();
        s.methodDraw();
        
    }
}
