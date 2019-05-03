public class RTriNoNewMethod extends Shape{
  protected boolean flip;

  public RTriNoNewMethod(int rows){
    super(rows, '*');
    flip = false;
  }

  public RTriNoNewMethod(int rows, char character){
    super(rows, character);
    flip = false;
  }

  public RTriNoNewMethod(int rows, char character, boolean flip){
    super(rows, character);
    flip = flip;
  }

  public void draw(){
    if(flip){
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
      for(int i=0; i<rows; i++){
        for(int j=0; j<i+1; j++){
          System.out.print(this.character);
        }
        System.out.print("\n");
      }
    }
  }

  public void draw(int in_x, int in_y){
    if(flip){
      for(int y0=0; y0<in_y; y0++){
        System.out.print("\n");
      }
      for(int i=0; i<rows; i++){
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
      for(int i=0; i<rows; i++){
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
    if(flip){
      for(int y0=0; y0<in_y; y0++){
        System.out.print("\n");
      }
      for(int i=0; i<rows; i++){
        for(int x0=0; x0<in_x; x0++){
          System.out.print(" ");
        }
        for(int blank=rows-i; blank>1; blank--){
          System.out.print(" ");
        }
        for(int j=0; j<i+1; j++){
          System.out.print(this.character);
        }
        System.out.print("     ");// HARDCODED TO 4 WHITESPACESs
        for(int k=0; k<i+1; k++){
          System.out.print(this.character);
        }
        System.out.print("\n");
      }
    }
    else draw(in_x, in_y);
  }

  public int getArea(){
      return this.rows*this.rows;
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
}
