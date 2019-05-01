public class MyTest{
    public static void main(String[] args) {
        Square sq1 = new Square(5,'X');
        sq1.draw(0, 0);
        RightTriangle rt1 = new RightTriangle(5,'\\');
        rt1.setVerticalFlip(false);
        rt1.draw(5,2);
    }
}
