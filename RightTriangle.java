public class RightTriangle extends Shape{
    private boolean isHorizontalFlip;
    public RightTriangle(int rows){
        super(rows, ' ');
    }
    public RightTriangle(int rows, char character){
        super(rows, character);
    }
    public void draw(){
        int count = 1;
        while(true){
            if (count > rows){
                break;
            }
            for (int i = 0; i < count; i++){
                System.out.print(character);
            }
            System.out.println("");
            count++;
        }
        
    }

}