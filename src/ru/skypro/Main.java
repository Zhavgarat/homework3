package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //1
        int z = 0;
        while (z < 10) {
            z++;
            System.out.print(z + " ");
        }
        System.out.println();
        {
            for (int i = 10; i > 0; i = i - 1) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        //2
        int s = 5;
        for (; s < 31; s = s + 7) {
            System.out.println("Сегодня пятница, " + s + "-е число. Необходимо подготовить отчет.");
        }

        //3
        int currentYear = 2021;
        int startYear = currentYear - 200;
        int finishYear = currentYear + 100;

        for (int i = startYear; i <= finishYear; i++) {
            if(i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}
