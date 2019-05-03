public class MyTest{
    public static void main(String[] args) {
        Triangle head = new Triangle(7, '*');
        head.setHorizontalFlip(true);
		Square tail = new Square(5, '*');
		head.draw(5, 5);
		tail.draw(5, 0);
    }
}
