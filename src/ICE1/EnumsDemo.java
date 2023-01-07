package ICE1;

public class EnumsDemo {
    public static void main(String[] args) {
        Shape s = Shape.CIRCLE;
        switch (s) {
            case RECTANGLE:
                System.out.println("Rectangle");
                break;
            case CIRCLE:
                System.out.println("Circle");
                break;
            case TRIANGLE:
                System.out.println("Triangle");
                break;
        }
    }
}
