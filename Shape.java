public class Shape{
  protected int rows;
  protected char character;

  public Shape(){
    this.rows = 0;
    this.character = '';
  }

  public Shape(int in_x, char in_c){
  }

  public int getRows(){
    return this.rows;
  }

  public char getCharacter(){
    return this.character;
  }

  public int setRows(){
    this.rows = x;
  }

  public char setCharacter(char in_character){
    this.character = c;
  }

  public String toString() {
    return "Rows: " + rows + ", Character: " + character;
  }
}
