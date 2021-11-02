class Canvas {
    abstract class Shape {
        private float area;
        float radius;
        float height;
        float width;
        float sideLength;
        public static float PI = (float) Math.PI;

        public abstract void getArea();
    }

    public void createRectangle(float length, float width) {
        Rectangle rectangle = new Rectangle();
        rectangle.setSides(length, width);
    }

    public void createSquare(float sideLength) {
        Square square = new Square();
        square.setSides(sideLength);
    }

    public void createCircle(float radius) {
        Circle circle = new Circle();
        circle.setRadius(radius);
    }

    class Circle extends Shape {
        public void setRadius(float radius) {
            this.radius = radius;
        }

        @Override
        public void getArea() {
            float area = (float) (Math.PI * Math.pow(radius, 2));
        }
    }

    class Rectangle extends Shape {
        public void setSides(float height, float width) {
            this.height = height;
            this.width = width;
        }

        @Override
        public void getArea(){
            float area = (height * width);
        }
    }

    class Square extends Rectangle {
        public void setSides(float sideLength) {
            this.sideLength = sideLength;
        }

        @Override
        public void getArea(){
            float area = (float) Math.pow(sideLength, 2);
        }
    }
}
