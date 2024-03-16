import java.util.Scanner;

public class Factory {
    public static Forma createForma(String type) {
        Scanner sc = new Scanner(System.in);
        if (type.equals("CIRCLE")) {
            System.out.print("Insert the radius of your circle: ");
            double radius = sc.nextDouble();
            System.out.print("Insert the color of your circle: ");
            String corFigure = sc.next();
            return new figureCircle(radius, corFigure);
        } else if (type.equals("RECTANGLE")) {
            System.out.print("Insert the length of your rectangle: ");
            double length = sc.nextDouble();
            System.out.print("Insert the height of your rectangle: ");
            double height = sc.nextDouble();
            System.out.print("Insert the color of your rectangle: ");
            String corFigure = sc.next();
            return new figureRectangle(length, height, corFigure);
        } else if (type.equals("TRIANGLE")) {
            System.out.print("Insert side A of your triangle: ");
            double ladoA = sc.nextDouble();
            System.out.print("Insert side B of your triangle: ");
            double ladoB = sc.nextDouble();
            System.out.print("Insert side C of your triangle: ");
            double ladoC = sc.nextDouble();
            System.out.print("Insert the color of your triangle: ");
            String corFigure = sc.next();
            return new figureTriangle(ladoA, ladoB, ladoC, corFigure);
        } else {
            return null;
        }
    }
}
