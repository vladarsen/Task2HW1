package com.vladarsenjtev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PointList {
    public static final Scanner scanner = new Scanner(System.in);
    public static final int MAX_POINT = 50;

    public static Point generatePoint() {
        System.out.println("Введите координаты точки");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        return new Point(x, y);
    }

    public static List<Point> pointList() {
        List<Point> result = new ArrayList<>();
        for (int i = 0; i < MAX_POINT; i++) {
            Point point = generatePoint();
            result.add(point);
            System.out.println("Желаете добавить еще (1-да 2-нет)");
            int contin = scanner.nextInt();
            if (contin == 2) {
                break;
            }
        }
        return result;
    }
}
