package TicketReservation;

public class Ticket {
    //4 mesafa (km yolculuk tipi ,koltuk numarası no
    private double distance;
    private int typeNo; //1- tek yon 2- cift yon
    private String seatNo;
    private  Bus bus; // bu bilet hangi otobüse ait
    //paramli cons
    private double price;
    public  Ticket(){

    }
    public  Ticket(double distance, int typeNo, String seatNo, Bus bus){
        this.distance=distance;
        this.typeNo=typeNo;
        this.seatNo=seatNo;
        this.bus= bus;

    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(int typeNo) {
        this.typeNo = typeNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }


    public void setPrice(int age){
        double total=0;
        int seat= Integer.valueOf(this.seatNo);
        switch (this.typeNo){
            case 1:
                if (seat%3==0){
                    total=this.distance*1.20;
                }else {
                    total=this.distance*1;
                }
                System.out.println("Toplam tutar: " + total);
                break;
            case 2:
                if (seat%3==0) {
                    total=this.distance*2.40;
                }else {
                    total=this.distance*2;
                }
                System.out.println("toplam tutar:" + total);
                total=total*0.8;
                System.out.println("cift yön indirimli tutar:" + total);
                break;
        }
        if (age<12){
            total=total*0.5;
            System.out.println("12 yaş altı indirimli tutar:"+ total);
        } else if (age>65){
            total=total*0.7;
            System.out.println("65 yaş üstü indirimli tutar:"+ total);
        }
        this.price=total;
    }
    //6- bilet dökümü yazdırma
    public  void printTicket(String name){
        System.out.println("*" .repeat(42));
        System.out.println("------Bilet Detayı ");
        System.out.println("Sayın: "+ name );
        System.out.println("otobüs plakası:" + this.bus.getNumberPlate());
        System.out.println("mesafe(KM)  :"+ this.distance);
        System.out.println("Yolculuk tipi : "+(this.typeNo==1 ? "Tek Yön" : "Çift Yön"));
        System.out.println("Koltuk numarası :" + this.seatNo);
        System.out.println("Toplam Tutar :" + this.price);
        System.out.println("Keyifli yolculuklar tekrar gel :");
        System.out.println("*" .repeat(42));
    }

}
