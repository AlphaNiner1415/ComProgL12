public class MyTest{
    public static void main(String[] args) {
		Triangle head = new Triangle(7, '*');
        Square tail = new Square(15, '%');
        RightTriangle feet = new RightTriangle(7, '*');
		head.draw(5,0);
        tail.draw(4, 0);
        feet.setEnableSpecialDraw(true);
        feet.setSpecialOffset(3);
        feet.draw(14, 0);
        
	}

}
