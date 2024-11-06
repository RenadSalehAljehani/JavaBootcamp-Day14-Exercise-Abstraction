public class Main {
    public static void main(String[] args) {
        //--------------- MoveablePoint Class Test---------------
        // Create MoveablePoint objects
        MoveablePoint point1 = new MoveablePoint(4,5,2,3);

        // Original positions
        System.out.println("--------------- Original Point1 ---------------" + point1.toString());

        // 1. Moving up
        System.out.println("-------------- Moving Up Point1 ---------------");
        point1.moveUp();

        // 2. Moving down
        System.out.println("-------------- Moving Down Point1 --------------");
        point1.moveDown();

        // 3. Moving left
        System.out.println("-------------- Moving Left Point1 -------------");
        point1.moveLeft();

        // 4. Moving right
        System.out.println("-------------- Moving Right Point1 -------------");
        point1.moveRight();

        //-----------------------------------------------------------------------------------------

        // Create MoveablePoint objects
        MoveablePoint point2 = new MoveablePoint();
        point2.setX(6);
        point2.setY(8);
        point2.setxSpeed(9);
        point2.setySpeed(8);

        // Original positions
        System.out.println("\n--------------- Original Point2 ---------------"
                +"\nX: " + point2.getX() +
                "\nY: " + point2.getY() +
                "\nX Speed: " + point2.getxSpeed() +
                "\nY Speed: " + point2.getySpeed());

        // 1. Moving up
        System.out.println("-------------- Moving Up Point2 ---------------");
        point2.moveUp();

        // 2. Moving down
        System.out.println("-------------- Moving Down Point2 --------------");
        point2.moveDown();

        // 3. Moving left
        System.out.println("-------------- Moving Left Point2 -------------");
        point2.moveLeft();

        // 4. Moving right
        System.out.println("-------------- Moving Right Point2 -------------");
        point2.moveRight();
    }
}