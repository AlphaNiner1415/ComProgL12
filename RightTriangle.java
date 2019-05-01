public class RightTriangle extends Shape{
    private boolean isVerticalFlip;
    public RightTriangle(int rows){
        super(rows, ' ');
    }
    public RightTriangle(int rows, char character){
        super(rows, character);
    }
    public void draw(){
        int count = 1;
        System.out.println("============");
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
        System.out.println("============");
        
    }
    public void draw(int x, int y){
        int count = 1;
        
        for (int i = 0; i < y; i++){
            System.out.println("");
        }
        while(true){
            if (count > rows){
                break;
            }
            for (int j = 0; j < x; j++){
                System.out.print(" ");
            }
            for (int i = 0; i < count; i++){
                System.out.print(character);
            }
            System.out.println("");
            count++;
        }
        System.out.println("========");
        
    }
    public int getArea(){
        double result = rows*rows*0.5;
        int rounded = (int)Math.round(result);
        return(rounded);
    }
    public int getPerimeter(){
        int hypotenuse = (int) Math.sqrt(Math.pow(rows,2)*2);
        return(rows*2 + hypotenuse);
    }
    public boolean isVerticalFlip(){
        return isVerticalFlip;
    }
    public void setVerticalFlip(boolean isVerticalFlip){
        
    }

}