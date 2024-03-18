package ch18.square;

abstract class Shape{
    abstract public void draw();
    }

public class Rectangle extends Shape{

    @Override
    public void draw(){
        System.out.println("draw to rectangle");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("draw to triangle");
    }
}
    class InformationUse {
        public void drawNow(Shape shape) {
            shape.draw();
        }
    }

    class MyClass {
        public void method() {

            //var rectangle = new Rectangle();
            // var triangle = new Triangle();

            var use = new InformationUse();
            use.drawNow(ShapeFactory.createShape(ShapeAngle.TRIANGLE));
            use.drawNow(ShapeFactory.createShape(ShapeAngle.RECTANGLE));
        }

        public static void main(String[] args) {
            new MyClass().method();
        }
    }

    enum ShapeAngle {

    TRIANGLE,
        RECTANGLE,
    }

    class ShapeFactory {
        public static Shape createShape(ShapeAngle angle) {

            return switch (angle) {
                case TRIANGLE -> new Triangle();
                case RECTANGLE -> new Rectangle();
            };
        }
    }
