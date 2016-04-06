package ua.gostart.goit.Module4;


public class Runner {

    public static void main(String[] args) {

        circleSquare(4);
        rectangleSquare(5, 6);
        triangleSquare(5, 6, 7);
        farengeitToCelsiy(212);
        celsiyToFarengeit(100);
    }
// МОДУЛЬ 4 ЗАДАНИЕ 1: Создать класс, вычисляющий площадь простых геометрических фигур: треугольника, прямоугольника и круга.

        static double circleSquare(int r) {

            int radius = r;
            double circleSquare = Math.pow(radius,2) * Math.PI;
            System.out.println("circleSquare=" + circleSquare);
            return circleSquare;
        }

        static double rectangleSquare(int a, int b) {

            int rectangleSide1 = a;
            int rectangleSide2 = b;
            double rectangleSquare = rectangleSide1 * rectangleSide2;
            System.out.println("rectangleSquare=" + rectangleSquare);
            return rectangleSquare;
        }

        //Формула Герона http://ru.onlinemschool.com/math/formula/area/
        static double triangleSquare(int a, int b, int c) {

            int triangleSide1 = a;
            int triangleSide2 = b;
            int triangleSide3 = c;
            double p = (triangleSide1 + triangleSide2 + triangleSide3) / 2;
            double triangleSquare = Math.sqrt(p * (p - triangleSide1) * (p - triangleSide2) * (p - triangleSide3));
            System.out.println("triangleSquare=" + triangleSquare);
            return triangleSquare;
        }

// МОДУЛЬ 4 ЗАДАНИЕ 2: Создать класс преобразующий значение температуры по шкале Цельсия в значение по
        // шкале Фаренгейта и в обратном направлении.

        // http://www.metric-conversions.org/ru/temperature/fahrenheit-to-celsius.htm
        static double farengeitToCelsiy(int a) {
            int farengeitTemperature = a;
            double celsiyTemperature = (farengeitTemperature - 32) / 1.8;
            System.out.println("celsiyTemperature equils " + farengeitTemperature + " farengeitTemperature = " + celsiyTemperature);
            return celsiyTemperature;
        }

        static double celsiyToFarengeit(int a) {
            int celsiyTemperature1 = a;
            double farengeitTemperature1 = 1.8 * celsiyTemperature1 + 32;
            System.out.println("farengeitTemperature equils " + celsiyTemperature1 + " celsiyTemperature = " + farengeitTemperature1);
            return farengeitTemperature1;
        }



}