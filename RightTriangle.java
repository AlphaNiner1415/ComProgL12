public class RightTriangle extends Shape{
  protected boolean flip;
  protected boolean drawLegsPls;
  protected int specialOffset = 0;

  public RightTriangle(int rows){
    super(rows, '*');
    this.flip = false;
  }

  public RightTriangle(int rows, char character){
    super(rows, character);
    this.flip = false;
  }

  public RightTriangle(int rows, char character, boolean flip, boolean drawLegsPls){
    super(rows, character);
    this.flip = flip;
    this.drawLegsPls = drawLegsPls;
  }

  public void setEnableSpecialDraw(boolean specialBoolean) {
    this.drawLegsPls = specialBoolean;
  }

  public void setSpecialOffset(int specialOffset) {
    this.specialOffset = specialOffset;
  }



  public void draw(){
    if (this.drawLegsPls) {
      this.drawLegs();
      return;
    }
    if(this.flip){
      for(int i=0; i<this.rows; i++){
        for(int blank=this.rows-i; blank>1; blank--){
          System.out.print(" ");
        }
        for(int j=0; j<i+1; j++){
          System.out.print(this.character);
        }
        System.out.print("\n");
      }
    }
    else{
      for(int i=0; i<this.rows; i++){
        for(int j=0; j<i+1; j++){
          System.out.print(this.character);
        }
        System.out.print("\n");
      }
    }
  }

  public void draw(int in_x, int in_y){
    if (this.drawLegsPls) {
      this.drawLegs();
      return;
    }
    if(this.flip){
      for(int y0=0; y0<in_y; y0++){
        System.out.print("\n");
      }
      for(int i=0; i<this.rows; i++){
        for(int x0=0; x0<in_x; x0++){
          System.out.print(" ");
        }
        for(int blank=this.rows-i; blank>1; blank--){
          System.out.print(" ");
        }
        for(int j=0; j<i+1; j++){
          System.out.print(this.character);
        }
        System.out.print("\n");
      }
    }
    else{
      for(int y0=0; y0<in_y; y0++){
        System.out.print("\n");
      }
      for(int i=0; i<this.rows; i++){
        for(int x0=0; x0<in_x; x0++){
          System.out.print(" ");
        }
        for(int j=0; j<i+1; j++){
          System.out.print(this.character);
        }
        System.out.print("\n");
      }
    }
  }

  public void draw(int in_x, int in_y, boolean flip){
    if (this.drawLegsPls) {
      this.drawLegs();
      return;
    }
    if(flip){
      for(int y0=0; y0<in_y; y0++){
        System.out.print("\n");
      }
      for(int i=0; i<this.rows; i++){
        for(int x0=0; x0<in_x; x0++){
          System.out.print(" ");
        }
        for(int j=0; j<i+1; j++){
          System.out.print(this.character);
        }
        System.out.print("\n");
      }
    }
    else draw();
  }

  public int getArea(){
      return this.rows*this.rows/2;
  }

  public int getPerimeter(){
      return 4*this.rows;
  }

  public String toString() {
    return "Rows: " + rows + ", Character: " + character;
  }

  public boolean isVerticalFlip(){
      return this.flip;
  }
  public void setVerticalFlip(boolean isVerticalFlip){
      this.flip = isVerticalFlip;
  }

  public void drawLegs() {
    int nRows = this.rows;
    int centerOffset = 5;
    char character = this.character;
    for (int row = 0; row < nRows; row++) {
        int leftOffset = (nRows - 1) - row;
        this.printCharacter(this.specialOffset, ' ');
        this.printCharacter(leftOffset, ' ');
        this.printCharacter(row, character);
        this.printCharacter(centerOffset, ' ');
        this.printCharacter(row, character);
        System.out.println();
    }
  }
  public void printCharacter(int nLoops, char character) {
      for (int i = 0; i < nLoops; i++) {
          System.out.print(character);
      }
  }
}
