package Habr440436.Main;

public class Vector {
    public static void main(String[] args) {}
    private double x, y, z;

    // конструктор с параметрами в виде списка координат x, y, z
    public class VectorDlina {
        int x = 2;
        int y = 4;
        int z = 8;

        // метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
        double Dlina() {
            double first = Math.pow(x, 2), second = Math.pow(y, 2), triple = Math.pow(z, 2);
            double DlinaMetoda = Math.sqrt(first + second + triple);
            return DlinaMetoda;
        }

        // метод, вычисляющий скалярное произведение:
        int Hh() {

        int H1 = x * x + y * y + z * z;
        return H1;
        }

        // метод, вычисляющий векторное произведение с другим вектором:
        void H2() {

        }

        // метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному произведению векторов, деленному на произведение модулей (длин) векторов:
        void H3() {

        }

        // методы для суммы и разности:
        int Sum(int x, int y) { return x + y; }
        int Raz(int x, int y) { return x - y; }

        // статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
        void Metod(){

        }
    }
}


