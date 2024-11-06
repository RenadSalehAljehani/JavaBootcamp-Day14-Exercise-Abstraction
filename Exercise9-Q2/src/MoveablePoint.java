public class MoveablePoint implements Moveable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    // Constructors
    MoveablePoint(){

    }
    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getters & setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Override the abstract methods
    @Override
    public void moveUp() {
        int oldY = y;
        y+=ySpeed;
        System.out.println("The coordinates has been changed by moving up,"
        +"\ny position was "  + oldY + " and now is " + y + ".");
    }

    @Override
    public void moveDown() {
        int oldY = y;
        y-=ySpeed;
        System.out.println("The coordinates has been changed by moving down,"
                +"\ny position was "  + oldY + " and now is " + y + ".");
    }

    @Override
    public void moveLeft() {
        int oldX = x;
        x-=xSpeed;
        System.out.println("The coordinates has been changed by moving left,"
                +"\nx position was "  + oldX + " and now is " + x + ".");
    }

    @Override
    public void moveRight() {
        int oldX = x;
        x+=xSpeed;
        System.out.println("The coordinates has been changed by moving right,"
                +"\nx position was "  + oldX + " and now is " + x + ".");
    }

    // toString method
    @Override
    public String toString() {
        return "\nX: " + x +
                "\nY: " + y +
                "\nX Speed: " + xSpeed +
                "\nY Speed: " + ySpeed;
    }
}