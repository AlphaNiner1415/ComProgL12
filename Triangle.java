public class Triangle extends Shape{
    private boolean isHorizontalFlip;
    public Triangle(int rows){
        super(rows, ' ');
    }
    public Triangle(int rows, char character){
        super(rows, character);
    }
    public void draw(){
        for(int i = 0; i < this.rows; i++){
            System.out.println(character);
        }
        
    }

}