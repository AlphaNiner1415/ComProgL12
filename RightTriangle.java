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

<<<<<<< Updated upstream
}
=======
  public boolean isVerticalFlip(){
      return this.flip;
  }
  public void setVerticalFlip(boolean isVerticalFlip){
      this.flip = isVerticalFlip;
  }
  public void renderLegs(int nRows, int centerOffset, String character) {
    // Row 2 -> leftOffset = 0
    // Row 1 -> leftOffset = 1
    // Row 0 -> leftOffset = 2
    for (int row = 0; row < nRows; row++) {
        int leftOffset = (nRows - 1) - row;
        printCharacter(leftOffset, " ");
        printCharacter(row, character);
        printCharacter(centerOffset, " ");
        printCharacter(row, character);
        System.out.println();
    }
}
public void printCharacter(int nLoops, String character) {
    for (int i = 0; i < nLoops; i++) {
        System.out.print(character);
    }
}
}
>>>>>>> Stashed changes
