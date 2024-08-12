public class Lesson_3_2 {

    // Интерфейс для геометрических фигур
    interface Shape {
        double calculatePerimeter(); // Метод для расчета периметра фигуры
        double calculateArea(); // Метод для расчета площади фигуры
    }

    //класс для круга
    static class Circle implements Shape {
        private double radius;
        private String fillColor;
        private String borderColor;

        //конструктор
        Circle(double radius, String fillColor, String borderColor) {
            this.radius = radius;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    // класс для прямоугольника
    static class Rectangle implements Shape {
        private double width;
        private double height;
        private String fillColor;
        private String borderColor;

        Rectangle(double width, double height, String fillColor, String borderColor) {
            this.width = width;
            this.height = height;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * (width + height);
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }

    //класс для треугольника
    static class Triangle implements Shape {
        private double side1;
        private double side2;
        private double side3;
        private String fillColor;
        private String borderColor;

        Triangle(double side1, double side2, double side3, String fillColor, String borderColor) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }

        @Override
        public double calculatePerimeter() {
            return side1 + side2 + side3;
        }

        @Override
        public double calculateArea() {
            double p = calculatePerimeter() / 2;
            return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        }
    }

    public static void main(String[] args) {

        Circle circle = new Circle(5, "Red", "Blue");
        Rectangle rectangle = new Rectangle(4, 6, "Green", "Yellow");
        Triangle triangle = new Triangle(3, 4, 5, "Purple", "Orange");

        System.out.println("Circle perimeter: " + circle.calculatePerimeter() + ", Area: " + circle.calculateArea() + ", Fill Color: " + circle.fillColor + ", Border Color: " + circle.borderColor);
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter() + ", Area: " + rectangle.calculateArea() + ", Fill Color: " + rectangle.fillColor + ", Border Color: " + rectangle.borderColor);
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter() + ", Area: " + triangle.calculateArea() + ", Fill Color: " + triangle.fillColor + ", Border Color: " + triangle.borderColor);
    }
}

