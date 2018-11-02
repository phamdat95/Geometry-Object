public class GeometryObject {
    public static class Shape {
        private String color = "Green";
        private boolean filled = true;

        private Shape() {
        }

        private Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        private String getColor() {
            return color;
        }

        private boolean isFilled() {
            return filled;
        }

        public String toString() {
            return "A Shape with color of " + getColor()+ " and" + (isFilled() ? " filled" : " not filled");
        }
    }
    public static class Circle extends Shape{
        private double radius = 1;

        private Circle(){}
        private Circle(double radius){
            this.radius = radius;
        }
        private Circle(double radius, String color, boolean filled){
            super(color,filled);
            this.radius = radius;
        }

        private double getRadius(){
            return radius;
        }

        public double getArea(){
            return radius * radius * Math.PI;
        }
        public double getPerimeter(){
            return 2 * radius * Math.PI;
        }

        public String toString(){
            return "A Circle with radius = " + getRadius() +", which is a subclass of " + super.toString();
        }
    }
    public static class Rectangle extends Shape{
        private double width = 1;
        private double height = 1;

        private Rectangle(){}
        private Rectangle(double width, double height){
            this.width = width;
            this.height = height;
        }
        private Rectangle(double width, double height, String color, boolean filled){
            super(color,filled);
            this.width = width;
            this.height = height;
        }
        private double getHeight(){ return height;}
        private double getWidth(){ return width;}
        public double getArea(){ return height * width;}
        public double getPerimeter(){ return 2 * (height + width);}
        public String toString(){
            return "A rectangle with height = " + getHeight() +" and width = " + getWidth() + ", which is a subclass of " + super.toString();
        }
    }
    public static class Square extends Rectangle{
        private double side = 1;

        private Square(){}
        private Square(double side){
            super(side,side);
        }
        private Square(double side,String color, boolean filled){
            super(side,side,color,filled);
        }
        private double getSide(){return side;}
        public String toString() {
            return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
        }
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
