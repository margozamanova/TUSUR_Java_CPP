abstract class Triangle {

        Triangle(double side1, double side2, double corner) {

            this.side1 = side1;
            this.side2 = side2;
            this.corner = corner * rad;
        }

        public abstract double area();
        public abstract double perimeter();
        public abstract String toString();
        public abstract boolean equals(Triangle obj);

        public double getSide1() {
            return side1;
        }

        public double getSide2() { return side2; }

        public double getCorner() {
            return corner;
        }

        private final double side1;
        private final double side2;
        private final double corner;
        private final static double rad = 0.017453292519943;
    }

    class RightTriangle extends Triangle {

        RightTriangle(double side1, double side2, double corner) {
            super(side1, side2, corner);
        }

        @Override
        public double area() {
            return .5 * getSide1() * getSide2();
        }

        @Override
        public double perimeter() {
            return getSide1() + getSide2() + Math.sqrt((Math.pow(getSide1(), 2) + Math.pow(getSide2(), 2)));
        }

        @Override
        public String toString() {
            return "class " + RightTriangle.class.getName();
        }

        @Override
        public boolean equals(Triangle var) {
            return (getSide1() == var.getSide1()) && (getSide2() == var.getSide2())
                    && (getCorner() == var.getCorner());
        }
    }

    class IsoscelesTriangle extends Triangle {

        IsoscelesTriangle(double side1, double side2, double corner) {

            super(side1, side2, corner);
        }

        @Override
        public double area() {
            return (.5 * getSide1() * getSide2() * Math.sin(getCorner()));
        }

        @Override
        public double perimeter() {
            return (2 * getSide1()) + getSide2();
        }

        @Override
        public String toString() {
            return "class " + IsoscelesTriangle.class.getName();
        }

        @Override
        public boolean equals(Triangle var) {
            return (getSide1() == var.getSide1()) && (getSide2() == var.getSide2())
                    && (getCorner() == var.getCorner());
        }
    }

    class EquilateralTriangle extends Triangle {

        EquilateralTriangle(double side1, double side2, double corner) {

            super(side1, side2, corner);
        }

        @Override
        public double area() {
            return (Math.sqrt(3.0) / 4) * Math.pow(getSide1(), 2);
        }

        @Override
        public double perimeter() {
            return (3 * getSide1());
        }

        @Override
        public boolean equals(Triangle var) {
            return (getSide1() == var.getSide1()) && (getSide2() == var.getSide2())
                    && (getCorner() == var.getCorner());
        }

        @Override
        public String toString() {
            return "class " + EquilateralTriangle.class.getName();
        }
    }

    class Test {

        public static void main(String[] args) {

            Triangle triangle;

            RightTriangle rightTriangle = new RightTriangle(3, 4, 90);
            IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(4, 6, 45);
            EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5, 5, 60);

            triangle = rightTriangle;
            System.out.println(triangle);
            System.out.printf("%s%.2f\n", "area: ", triangle.area());
            System.out.printf("%s%.2f\n", "perimeter: ", triangle.perimeter());
            System.out.printf("%s%b\n", "equals Right Triangle: ", triangle.equals(rightTriangle));
            System.out.printf("%s%b\n", "equals Isosceles Triangle: ", triangle.equals(isoscelesTriangle));
            System.out.printf("%s%b\n", "equals Equilateral Triangle: ", triangle.equals(equilateralTriangle));
            System.out.println();

            triangle = isoscelesTriangle;
            System.out.println(triangle);
            System.out.printf("%s%.2f\n", "area: ", triangle.area());
            System.out.printf("%s%.2f\n", "perimeter: ", triangle.perimeter());
            System.out.printf("%s%b\n", "equals Right Triangle: ", triangle.equals(rightTriangle));
            System.out.printf("%s%b\n", "equals Isosceles Triangle: ", triangle.equals(isoscelesTriangle));
            System.out.printf("%s%b\n", "equals Equilateral Triangle: ", triangle.equals(equilateralTriangle));
            System.out.println();

            triangle = equilateralTriangle;
            System.out.println(triangle);
            System.out.printf("%s%.2f\n", "area: ", triangle.area());
            System.out.printf("%s%.2f\n", "perimeter: ", triangle.perimeter());
            System.out.printf("%s%b\n", "equals Right Triangle: ", triangle.equals(rightTriangle));
            System.out.printf("%s%b\n", "equals Isosceles Triangle: ", triangle.equals(isoscelesTriangle));
            System.out.printf("%s%b\n", "equals Equilateral Triangle: ", triangle.equals(equilateralTriangle));
            System.out.println();
        }
    }
