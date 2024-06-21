package TicketReservation;

import java.util.Scanner;

public class TicketReservationApp {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        //1.adım  bilet ve otobüs objelerini oluşturalım
        Bus bus =new Bus("34 DRR 233",33);
        Ticket ticket;
        Scanner scanner=new Scanner(System.in);
        int select; //çıkış için 0
        do {
            System.out.println("* Bilet Rezarvasyon Sistemine Hoşgeşdiniz*");
            System.out.println("Lütfen Adınızı ve Soyadnızı Giriniz :");
            String name=scanner.nextLine();
            System.out.println("Lütfen Yaşınızı Giriniz :");//sadsad
            int age=scanner.nextInt();
            System.out.println("Lütfen Gidilecek Mesafe Bilgisini Km Olarak Giriniz");
            double distance=scanner.nextDouble();
            System.out.println("Lütfen Yolculuk Tipini Giriniz : " );
            System.out.println("1- Tek yön ");
            System.out.println("2-Gidiş Dönüş");
            int typeno=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Koltuk No seciniz :");
            System.out.println("Tekli Koltuk Üçreti %20 Daha Fazladır");

            System.out.println(bus.getSeats()); //"1 2 3 ...
            String seat=scanner.nextLine();
            boolean isReserve =!bus.getSeats().contains(seat);
            if (distance>0 && age>0 && (typeno==1 || typeno==2)&& !isReserve){
               // System.out.println("bilet hazır");
                ticket=new Ticket(distance,typeno,seat,bus);
                ticket.setPrice(age);
                ticket.getBus().getSeats().remove(seat);

                ticket.printTicket(name);


            }else {
                if (isReserve){
                    System.out.println("Seçilen koltuk otobüste bulunmamaktadır veya rezerve edilmiştir!");
                }
                System.out.println("Geçersiz giriş yaptınız!");
            }
            System.out.println("Yeni işlem için bir sayı giriniz, ÇIKIŞ için 0 giriniz :");
            select=scanner.nextInt();//1,2,3,... veya 0
            scanner.nextLine();


        }while (select!=0);
        System.out.println("İyi günler diler, yine bekleriz:)");


    }
}
