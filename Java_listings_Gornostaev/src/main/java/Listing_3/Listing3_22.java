package Listing_3;

abstract class Shape {
    abstract double area(); // Метод area()
}

class Point extends Shape {
    public String toString() {
        return "Точка";
    }

    double area() {
        return 0; // площадь точки равна 0
    }
}

class Triangle extends Shape {
    int cathetua1; // первый катет
    int cathetus2; // второй катет

    Triangle(int cathetua1, int cathetus2) {
        this.cathetua1 = cathetua1;
        this.cathetus2 = cathetus2;
    }

    public String toString() {
        return "Треугольник";
    }

    double area() {
        return (cathetua1 * cathetus2) / 2.0;
    }
}

class Circle extends Shape {
    int radius; // радиус

    Circle(int radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Круг";
    }

    double area() {
        return (radius * radius) * 3.14;
    }
}

class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Point();
        shapes[1] = new Triangle(5, 3);
        shapes[2] = new Circle(9);

        System.out.println("Площади фигур:");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString() + " " + shapes[i].area());
        }
    }
}

