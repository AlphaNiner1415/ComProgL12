public class RightTriangle extends Shape{
  protected boolean flip;

  public RightTriangle(int rows){
    super(rows, '*');
    this.flip = false;
  }

  public RightTriangle(int rows, char character){
    super(rows, character);
    this.flip = false;
  }

  public RightTriangle(int rows, char character, boolean flip){
    super(rows, character);
    this.flip = flip;
  }

  public void draw(){
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
}
