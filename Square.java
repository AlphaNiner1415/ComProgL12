public class Square extends Shape{
  public Square(){
    super(rows, ' ');
  }

  public Square(int in_rows, char in_character){
    super(rows, ' ');
  }

  public draw(){
    return this.rows;
  }

  public draw(int in_x, int in_y){
    return this.rows;
  }

  public int getArea(){

  }

  public int getPerimeter(){

  }

  public String toString() {
    return "Rows: " + rows + ", Character: " + character;
  }
}
