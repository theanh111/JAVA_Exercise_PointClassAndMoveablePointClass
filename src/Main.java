public class Main {
    public static void main(String[] args) {
        // Test Point chưa truyền tham số:
        Point point = new Point();
        System.out.println(point);

        // Test Point truyền tham số:
        point = new Point(4.4f, 6.3f);
        System.out.println(point);

        // Test MoveablePoint chưa truyền tham số:
        MoveablePoint movepoint = new MoveablePoint();
        System.out.println(movepoint);

        // Test MoveablePoint truyền tham số:
        movepoint = new MoveablePoint(3.5f, 1.4f, 3.5f, 2.5f);
        System.out.println(movepoint);

        // Test MoveablePoint phương thức move():
        System.out.println("Move: " + movepoint.move());
    }
}
