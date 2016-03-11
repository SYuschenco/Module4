package ua.gostart.goit.Module4;


public class Runner {

    public static void main(String[] args) {


// МОДУЛЬ 4 ЗАДАНИЕ 1: Создать класс, вычисляющий площадь простых геометрических фигур: треугольника, прямоугольника и круга.

        // void circleSquare(){

        int radius = 5;
        double circleSquare = Math.sqrt(radius) * Math.PI;
        System.out.println("circleSquare="+circleSquare);
        // }

        //void rectangleSquare(){

        int rectangleSide1 = 5;
        int rectangleSide2 = 6;
        double rectangleSquare = rectangleSide1 * rectangleSide2;
        System.out.println("rectangleSquare="+rectangleSquare);
        //}

        //Формула Герона http://ru.onlinemschool.com/math/formula/area/
        //void triangleSquare(){

        int triangleSide1 = 7;
        int triangleSide2 = 8;
        int triangleSide3 = 9;
        double p = (triangleSide1 + triangleSide2 + triangleSide3) / 2;
        double triangleSquare = Math.sqrt(p * (p - triangleSide1) * (p - triangleSide2) * (p - triangleSide3));
        //}
        System.out.println("triangleSquare="+triangleSquare);


// МОДУЛЬ 4 ЗАДАНИЕ 2: Создать класс преобразующий значение температуры по шкале Цельсия в значение по
                        // шкале Фаренгейта и в обратном направлении.

    // http://www.metric-conversions.org/ru/temperature/fahrenheit-to-celsius.htm

        int farengeitTemperature=212;
        double celsiyTemperature = (farengeitTemperature-32)/1.8;
        System.out.println("celsiyTemperature equils "+farengeitTemperature+" farengeitTemperature = "+celsiyTemperature);

        int celsiyTemperature1=100;
        double farengeitTemperature1 = 1.8*celsiyTemperature1+32;
        System.out.println("farengeitTemperature equils "+celsiyTemperature1+" celsiyTemperature = "+farengeitTemperature1);


    }

}
