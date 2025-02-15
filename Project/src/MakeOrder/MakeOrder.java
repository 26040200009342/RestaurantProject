package MakeOrder;

import MakeOrder.Menu.*;
import Reservation.Time;

import java.util.Scanner;
import java.util.Vector;

public class MakeOrder {

    public static void main() {
        Vector<Menu> menus = new Vector<>();
        Noodle noodle = new Noodle();
        Rice rice = new Rice();
        Sashimi sashimi = new Sashimi();
        SushiAndMaki sushisuhi = new SushiAndMaki();
        Time time = new Time();


        boolean checkMemu = true;
        boolean check = true;
        boolean typee = true;
        int item;
        int quantity = 1;
        double totalPrice = 0;
        int day;
        int mount;
        int year;
        int sentHour;
        int sentMinute;

        String[] noodles = {"- HIYASHI SOBA 210 Bath", "- ZARU SOBA 110 Bath", "- TEMPURA SOBA 160 Bath", "- PORK UDON ฿ 150 Bath", "- TEMPURA UDON  160 Bath","  "};
        String[] rices = {"- Pork Pirikara don 220 Bath", "- Tonkatsu Kare rice 180 Bath", "- Gyu Yakiniku Don 240 Bath", "- Tori Karaage Kare Rice 140 Bath"};
        String[] sashimii = {"- SASHIMI LOVER  1250 Bath", "- MINI SASHIMI 290 Bath", "- SASHIMI UME 360 Bath", "- HAMACHI SASHIMI 370 Bath", "- AMAEBI SASHIMI 350 Bath"};
        String[] sushi = {"- EXTRA TWIST ROLL(salmon rolled with scallop & eel)  395 Bath", "- SPIDER MAKI (soft shell crab rolls) 270 Bath\n", "- DOUBLE WAVE ROLL (salmon eel rolls) 360 Bath\n", "- FUTO MAKI (crab stick and japanese omelette rolls) "};


        Scanner scanner = new Scanner(System.in);
        do {
        do {
            System.out.println("Please select type of menu");
            System.out.println("1.Noodle\n2.Rice\n3.Sashimi\n4.Sushi and Maki\n5.Promotion\n6.exit ");
            System.out.print("type: ");
            int type = scanner.nextInt();
            if (type == 1) {
                check = true;
                do {
                    noodle.getMenu();
                    System.out.println("Please select the item you want.");
                    item = scanner.nextInt();
                    if (item == 1 || item == 2 || item == 3 || item == 4 || item == 5) {
                        System.out.println("Quantity: ");
                        quantity = scanner.nextInt();
                    }
                    if (item == 1) {
                        menus.add(new Noodle(noodles[item - 1], quantity));
                        noodle.price(item, quantity);
                        totalPrice = totalPrice + noodle.totalPrice;
                    } else if (item == 2) {
                        menus.add(new Noodle(noodles[item - 1], quantity));
                        noodle.price(item, quantity);
                        totalPrice = totalPrice + noodle.totalPrice;
                    } else if (item == 3) {
                        menus.add(new Noodle(noodles[item - 1], quantity));
                        noodle.price(item, quantity);
                        totalPrice = totalPrice + noodle.totalPrice;
                    } else if (item == 4) {
                        menus.add(new Noodle(noodles[item - 1], quantity));
                        noodle.price(item, quantity);
                        totalPrice = totalPrice + noodle.totalPrice;
                    } else if (item == 5) {
                        menus.add(new Noodle(noodles[item - 1], quantity));
                        noodle.price(item, quantity);
                        totalPrice = totalPrice + noodle.totalPrice;
                    } else if (item == 6) {
                        check = false;
                    }

                } while (check);

            } else if (type == 2) {
                check = true;
                do {
                    rice.getMenu();
                    System.out.println("Please select the item you want.");
                    item = scanner.nextInt();
                    if (item == 1 || item == 2 || item == 3 || item == 4) {
                        System.out.println("Quantity: ");
                        quantity = scanner.nextInt();
                    }
                    if (item == 1) {
                        menus.add(new Rice(rices[item - 1], quantity));
                        rice.price(item, quantity);
                        totalPrice = totalPrice + rice.totalPrice;
                    } else if (item == 2) {
                        menus.add(new Rice(rices[item - 1], quantity));
                        rice.price(item, quantity);
                        totalPrice = totalPrice + rice.totalPrice;
                    } else if (item == 3) {
                        menus.add(new Rice(rices[item - 1], quantity));
                        rice.price(item, quantity);
                        totalPrice = totalPrice + rice.totalPrice;
                    } else if (item == 4) {
                        menus.add(new Rice(rices[item - 1], quantity));
                        rice.price(item, quantity);
                        totalPrice = totalPrice + rice.totalPrice;
                    } else if (item == 5) {
                        check = false;
                    }

                } while (check);

            } else if (type == 3) {
                check = true;
                do {
                    sashimi.getMenu();
                    System.out.println("Please select the item you want.");
                    item = scanner.nextInt();
                    if (item == 1 || item == 2 || item == 3 || item == 4 || item == 5) {
                        System.out.println("Quantity: ");
                        quantity = scanner.nextInt();
                    }
                    if (item == 1) {
                        menus.add(new Sashimi(sashimii[item - 1], quantity));
                        sashimi.price(item, quantity);
                        totalPrice = totalPrice + sashimi.totalPrice;
                    } else if (item == 2) {
                        menus.add(new Sashimi(sashimii[item - 1], quantity));
                        sashimi.price(item, quantity);
                        totalPrice = totalPrice + sashimi.totalPrice;
                    } else if (item == 3) {
                        menus.add(new Sashimi(sashimii[item - 1], quantity));
                        sashimi.price(item, quantity);
                        totalPrice = totalPrice + sashimi.totalPrice;
                    } else if (item == 4) {
                        menus.add(new Sashimi(sashimii[item - 1], quantity));
                        sashimi.price(item, quantity);
                        totalPrice = totalPrice + sashimi.totalPrice;
                    } else if (item == 5) {
                        menus.add(new Sashimi(sashimii[item - 1], quantity));
                        sashimi.price(item, quantity);
                        totalPrice = totalPrice + sashimi.totalPrice;
                    } else if (item == 6) {
                        check = false;
                    }

                } while (check);

            } else if (type == 4) {
                check = true;
                do {
                    sushisuhi.getMenu();
                    System.out.println("Please select the item you want.");
                    item = scanner.nextInt();
                    if (item == 1 || item == 2 || item == 3 || item == 4) {
                        System.out.println("Quantity: ");
                        quantity = scanner.nextInt();
                    }
                    if (item == 1) {
                        menus.add(new SushiAndMaki(sushi[item - 1], quantity));
                        sushisuhi.price(item, quantity);
                        totalPrice = totalPrice + sushisuhi.totalPrice;
                    } else if (item == 2) {
                        menus.add(new SushiAndMaki(sushi[item - 1], quantity));
                        sushisuhi.price(item, quantity);
                        totalPrice = totalPrice + sushisuhi.totalPrice;
                    } else if (item == 3) {
                        menus.add(new SushiAndMaki(sushi[item - 1], quantity));
                        sushisuhi.price(item, quantity);
                        totalPrice = totalPrice + sushisuhi.totalPrice;
                    } else if (item == 4) {
                        menus.add(new SushiAndMaki(sushi[item - 1], quantity));
                        sushisuhi.price(item, quantity);
                        totalPrice = totalPrice + sushisuhi.totalPrice;
                    } else if (item == 5) {
                        check = false;
                    }

                } while (check);
            }

            if (type == 6) {
                typee = false;
            }

        } while (typee);


        System.out.println("Please check your menu.");
        System.out.print("menu :");
        for (Menu menu : menus) {
            System.out.print(menu);
        }
        System.out.println();
        System.out.print("Total :" + totalPrice+" Bath");
        System.out.println();

        System.out.print("Ok press 1 ,Clear list press 2 :");
        int checklist = scanner.nextInt();
            if (checklist==1){
                checkMemu=false;
            }
            else if (checklist ==2){
                menus.clear();
                totalPrice=0;
                checkMemu=true;
            }

    }while(checkMemu);
        scanner.nextLine();
        //กรอกที่อยู่ที่จะส่ง
        System.out.println("Please fill in the address you want to ship to.");
        String address =scanner.nextLine();
        System.out.println("Want to set it as a default sending address? if Yes press 1,No press 2 ");
        int defaultAddress = scanner.nextInt();
        if(defaultAddress==1){
            //ดึงไปเก็บข้อมูลในอัลเรย์
        }





        //ใส่เวลาส่ง
        System.out.println("Want to send it today? if Yes press 1,No press 2 ");
        int sentToday = scanner.nextInt();
        if (sentToday==2){
            do {
                System.out.println("Please enter the date you wish to send.");
                day = scanner.nextInt();
                System.out.println("Please enter the month you want to send.");
                mount = scanner.nextInt();
                System.out.println("Please enter the year you want to send.");
                year = scanner.nextInt();
                //ดึง method checkTime มาใช้เช็ควัน
                time.checkDate(day, mount, year);
            } while (time.check);
        }
        System.out.println("Want it sent immediately?? if Yes press 1,No press 2 ");
        int sentTime = scanner.nextInt();
            if (sentTime == 2) {
                do {
                System.out.println("Please enter the time you wish to send. (hour)");
                sentHour = scanner.nextInt();
                System.out.println("Please enter the time you wish to send.(minute)");
                sentMinute = scanner.nextInt();
                time.checkTimeMenu(sentHour, sentMinute);
            }while (time.check);
        }

        //เลือกการชำระ
        System.out.println("Please select payment method");
        System.out.println("1.Cash");
        System.out.println("2.Bank Account");
        int payment= scanner.nextInt();
        if(payment==1){
            System.out.println("Thank you for using the service.  The shop will deliver food as quickly as possible.");
        }
        else {
            System.out.println("Please transfer money to this account number.");
            System.out.println("Bank: Thai Thai \naccount number :1235478xxx");
            System.out.println();
            System.out.println();
            System.out.println("The shop has received the money.\n The shop will deliver food as quickly as possible.");
        }

    }

}
