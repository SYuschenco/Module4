package ua.gostart.goit.Module4;

// МОДУЛЬ 4 ЗАДАНИЕ 3:Создать класс вычисляющий расстояние между двумя точками, представленными координатами
// в двумерном пространстве (x1, y1), (x2, y2).

//http://oldskola1.narod.ru/trigF28.htm

public class Module4Task3 {


    public static void main(String[] args)
    {

        double a =-3;
        double b =-5;
        double c =-2;
        double d =7;

        System.out.println("Найти расстояние между двумя точками в двумерном декартовом пространстве. Даны точки: ");
        System.out.println("A(x1,y1)=" + a +","+b  );
        System.out.println("B(x2,y2)=" + c +","+d  );


        double tmp = ss(a,b,c,d);

        System.out.println("Ответ:расстояние между двумя точками = " + tmp);
     //   System.out.println(Math.sqrt(29));

    }

    public static double ss(double x1, double y1,double x2,double y2)
    {
        double b = 0;

        double b1= Math.abs(x2-x1);//System.out.println("b1="+b1  );
        double b2= Math.abs(y2-y1);//System.out.println("b2="+b2  );
        double b12=Math.pow(b1,2) ;//System.out.println("b12="+b12  );
        double b22=Math.pow(b2,2) ;//System.out.println("b22="+b22  );

        b=Math.sqrt(b12+b22);
        return b;
    }
}
