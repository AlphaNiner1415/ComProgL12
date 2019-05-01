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

}