public class QuaEqua {
    double a, b, c;
    double D;

    QuaEqua(double a1, double b1, double c1) {
        a = a1;
        b = b1;
        c = c1;
    }

    void Discriminant() {
        System.out.println("Программа решает квадратное уравнение вида:");
        System.out.println(a + "x^2"+ " + " + b + "x" + " + " + c + " = 0");
        System.out.println("Вычислим дискриминант по формуле D = b^2 - 4ac");
        D = b * b - 4 * a * c;
        System.out.println("Дискриминант = " + D);
        if (a == 0) {
            System.out.println("Это не квадратное уравнение! Вычисленный дискриминант не нужен!");
            double x;
            x = -c / b;
            System.out.println("Неизвестная х равна " + String.format("%.2f", x) + ", а уравнение имеет вид "+ b + "x" + " + " + c + " = 0");
        }
        else if (D > 0) {
            double x1, x2;
            System.out.println("Вычислим корни уравнения х1 и х2 по формуле х1,2 = (-b +- sqr(D)) / 2a");
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = (-b - sqr(D)) / 2a = " + String.format("%.2f", x1) + ", x2 = (-b + sqr(D)) / 2a = " + String.format("%.2f", x2) + " при a = " + a + ", b = " + b + ", c = " + c + ".");
            System.out.println();
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = -b / (2a) = " + String.format("%.2f", x) + " при a = " + a + ", b = " + b + ", c = " + c + ".");
            System.out.println();
        } else
            System.out.println("Уравнение не имеет действительных корней при a = " + a + ", b = " + b + ", c = " + c + ".");
        }
        }
    class QuaEquaTest1 {
        public static void main(String[] args) {
            QuaEqua QE1 = new QuaEqua(4, 10, 3);
            QE1.Discriminant();
            QuaEqua QE2 = new QuaEqua(4, 4, 1);
            QE2.Discriminant();
            QuaEqua QE3 = new QuaEqua(5, 5, 3);
            QE3.Discriminant();
            QuaEqua QE4 = new QuaEqua(0, 2, -9);
            QE4.Discriminant();
        }
    }
