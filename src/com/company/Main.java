package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Apartment> apartments = new ArrayList<>();
        int menu;
        do{
            System.out.println("Choose action to move forward\n" +
                    "0. Шығу\n" +
                    "1. Пәтерді еңгізу\n" +
                    "2. Пәтерді іздеу\n");
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    Apartment ap = new Apartment();
                    System.out.println("Сіз еңгізетің пәтердің ауданы:\n");
                    ap.setTotalArea(sc.nextDouble());
                    System.out.println("Сіз еңгізетің пәтердің тұрғын ауданы:\n");
                    ap.setLivingArea(sc.nextDouble());
                    System.out.println("Сіз еңгізетің пәтердің ас бөлменің ауданы:\n");
                    ap.setKitchenArea(sc.nextDouble());
                    System.out.println("Жуынатын бөлме біріккен болса, 1 жазыңыз, әйтпесе 0 жазыңыз:\n");
                    ap.setExistBathroom (sc.nextBoolean());
                    int bath = sc.nextInt();
                    if (bath == 1) {
                        ap.setExistBathroom(true);
                    } else if (bath == 0){
                        ap.setExistBathroom(false);
                    } else {
                        break;
                    }
                    System.out.println("Лоджи болса, 1 жазыңыз, әйтпесе 0 жазыңыз:\n");
                    ap.setExistLoggia(sc.nextBoolean());
                    int lodzi = sc.nextInt();
                    if (lodzi == 1) {
                        ap.setExistLoggia(true);
                    } else if (lodzi == 0){
                        ap.setExistLoggia(false);
                    } else {
                        break;
                    }
                    System.out.println("Сіз еңгізетің пәтердің бағесы\n");
                    ap.setCost(sc.nextInt());
                    apartments.add(ap);
                    break;
                case 2:
                    System.out.println("Пәтер іздегіңіз келетін параметірді таңдаңыз:\n" +
                            "1. Минималды баға\n" +
                            "2. Максималды бағасы\n" +
                            "3. Максималды жалпы ауданы бойынша\n" +
                            "4. Ең аз жалпы аудан бойыншақ\n"
                    );
                    int ch = sc.nextInt();
                    if (ch == 1){
                        System.out.println("Сіз іздейтің пәтердің бастапқы бағесы\n");
                        int price = sc.nextInt();
                        for (Apartment apartment : apartments) {
                            if (apartment.getCost() > price) {
                                System.out.println(apartment.toString());

                            }else System.out.println("Бұл пәтер параметірге сай емес");
                        }
                        break;
                    }
                    if (ch == 2){
                        System.out.println("Сіз іздейтің пәтердің максималды бағасы\n");
                        int price = sc.nextInt();
                        for (Apartment apartment : apartments) {
                            if (apartment.getCost() < price) {
                                System.out.println(apartment.toString());

                            }else System.out.println("Бұл пәтер параметірге сай емес");
                        }
                        break;
                    }
                    if (ch == 3){
                        System.out.println("Пәтердің максималды жалпы ауданың еңгізіңіз\n");
                        int area = sc.nextInt();
                        for (Apartment apartment : apartments) {
                            if (apartment.getTotalArea() < area) {
                                System.out.println(apartment.toString());

                            }else System.out.println("Бұл пәтер параметірге сай емес");
                        }
                        break;
                    }
                    if (ch == 4){
                        System.out.println("Сізге іздейтің пәтердің бастапқы ауданңый  \n");
                        int area = sc.nextInt();
                        for (Apartment apartment : apartments) {
                            if (apartment.getTotalArea() > area) {
                                System.out.println(apartment.toString());

                            }else System.out.println("Бұл пәтер параметірге сай емес");
                        }
                        break;
                    }
                    if (ch == 5) {
                        System.out.println("Сізге іздейтің пәтерде лоджидің болуы \n");
                        int area = sc.nextInt();
                        for (Apartment apartment : apartments) {
                            if (apartment.get() == area) {
                                System.out.println(apartment.toString());

                            } else System.out.println("Бұл пәтер параметірге сай емес");
                        }
                        break;
                    }
                default: break;
            }
        } while (menu != 0);
    }
}

