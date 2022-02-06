package com.vladarsenjtev;

import java.util.List;
import java.util.Scanner;


public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Point> list = PointList.pointList();
        System.out.println("Введите координаты центра окружности и его радиус");
        Circle circle = new Circle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        for (Point point : list) {
            if (circle.checkInCircle(point, circle)) {
                System.out.println("Точка " + point + " лежит в окружности");
            } else System.out.println("Точка " + point + " не лежит в окружности");
        }
    }
}