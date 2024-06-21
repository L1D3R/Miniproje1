package TicketReservation;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    //2-plaka, koltuk sayısı, koltuk numaraları

    private String numberPlate;
    private int numberOfSeat; //
    private List<String> seats=new ArrayList<>();

    //3-paramlı constructor
    // constructor otobüs objesş oluştururken öz.leri verilcek
    public Bus(String numberPlate, int numberOfSeat) {
        this.numberPlate = numberPlate;
        this.numberOfSeat = numberOfSeat;
        for (int i = 1; i <=numberOfSeat ; i++) {
            this.seats.add(i+"");
            //this.seats.add(String.valueOf(i));

        }
    }


    //getter

    public String getNumberPlate() {
        return numberPlate;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public List<String> getSeats() {
        return seats;
    }
}