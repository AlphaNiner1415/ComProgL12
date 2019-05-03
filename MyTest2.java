public class MyTest2{
    public static void main(String[] args) {
    		Triangle head = new Triangle(7, '*');
        Square tail = new Square(15, '%');
        RTriNoNewMethod feet = new RTriNoNewMethod(6, '*');
    		head.draw(5,0);
        tail.draw(4, 0);
        System.out.print("\n");
        feet.draw(3, 0, true);
	}
}
