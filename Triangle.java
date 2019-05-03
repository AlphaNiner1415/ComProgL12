public class Triangle extends Shape {
    private boolean isHorizontalFlip = false;
    // private int rows = 0;
    // private char character = "*";


    public Triangle(int rows){
        super(rows, ' ');
    }
    public Triangle(int rows, char character){
        super(rows, character);
        
    }
    public void draw() {
        draw(0,0);
    }
    public void draw(int inX, int inY) {
        int rows = super.rows;
        char character = super.character;
        /**
         *        # -> offset = 6
         *       # # -> = 5
         *      # # #
         *     # # # #
         *    # # # # #
             # # # # # #
            # # # # # # #
         */
        if (isHorizontalFlip) {
            for(int i = 0; i < inY; i++) {
                System.out.println("");
            }
            
            for (int row = rows; row > 0; row--) {
                int leftOffset = (rows) - row + inX;
                // Print offset
                for (int offset = 0; offset < leftOffset; offset++) {
                    System.out.print(" ");
                }
    
                for (int r = 0; r <= row -1; r++) {
                    System.out.print(character + " ");
                }
                System.out.println();
            }
        } else {
            for (int row = 0; row < rows; row++) {
                int leftOffset = (rows - 1) - row + inX;
                // Print offset
                for (int offset = 0; offset < leftOffset; offset++) {
                    System.out.print(" ");
                }
    
                for (int r = 0; r <= row; r++) {
                    System.out.print(character + " ");
                }
                System.out.println();
            }
        }
        
    }


    
    public boolean isHorizontalFlip() {
        return isHorizontalFlip;
    }

    public void setHorizontalFlip(boolean isHorizontalFlip) {
        this.isHorizontalFlip = isHorizontalFlip;
    }
}