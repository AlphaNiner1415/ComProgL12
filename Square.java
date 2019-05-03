public class Square extends Shape{
  public Square(int rows){
    super(rows, '*');
  }

  public Square(int rows, char character){
    super(rows, character);
  }

  public void draw(){
    // for(int i=0; i<this.rows; i++){
    //   for(int j=0; j<this.rows; j++){
    //     System.out.print(this.character);
    //   }
    //   System.out.print("\n");
    // }
    draw(0, 0);
  }

  public void draw(int in_x, int in_y){
    for(int y0=0; y0<in_y; y0++){
      System.out.print("\n");
    }
    for(int i=0; i<this.rows; i++){
      for(int x0=0; x0<in_x; x0++){
        System.out.print(" ");
      }
      for(int j=0; j<this.rows; j++){
        System.out.print(this.character);
      }
      System.out.print("\n");
    }
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
}
