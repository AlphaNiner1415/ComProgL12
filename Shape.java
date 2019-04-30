public class Shape{
    protected int rows;
    protected char character;

    public Shape(){
        this.rows = 0;
        this.character = ' ';
    }
    public Shape(int x, char c){

    }
    public int getRows(){
        return this.rows;
    }
    public char getCharacter(){
        return this.character;
    } 
    public void setRows(int x){
        this.rows = x;
    }
    public void setCharacter(char c){
        this.character = c;
    }
    public String toString(){
        return "Rows=" + rows + " Character=" + character;
    }
}