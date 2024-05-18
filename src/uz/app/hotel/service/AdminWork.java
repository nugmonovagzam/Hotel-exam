package uz.app.hotel.service;

import uz.app.hotel.database.DB;
import uz.app.hotel.entity.Hotel;
import uz.app.hotel.entity.Location;

import static uz.app.hotel.utils.Utils.*;
public class AdminWork implements AdminService {
    DB db=DB.getInstance();
    @Override
    public void service() {
        while (true){
            switch (menu()){
                case 0->{
                    System.out.println("see you admin");
                    return;
                }
                case 1 ->{
                    addHotel();
                }
                case 2 ->{
                    editHotel();
                    }
                case 3 ->{};
                case 4 ->{};
                case 5 ->{};
                case 6 ->{};
                case 7 ->{};
                case 8 ->{};
                case 9 ->{};
                case 10 ->{};
                case 11->{};
                default -> {

                }
            }

        }
    }

    @Override
    public void addHotel() {
        String hotelName=getLine("Enter hotel name");
        for (String location : db.locations) {
            System.out.println(location);
        }
        String location = getLine("Enter location (with capital letters)");
        Integer numberOfFloors = getInt("Enter the number of floors");
        Integer numberOfRooms = getInt("Enter the number of rooms");
        if (numberOfRooms% numberOfFloors==0){
            System.out.println("please enter the number of rooms divisible by number of floors");
            return;
        }
        Hotel hotel=new Hotel(hotelName,Location.valueOf(location),numberOfFloors,numberOfRooms);
        System.out.println("Hotel has been added successfully");
    }

    @Override
    public void showHotel() {
        String uuid=getLine("Enter ID of the hotel");
        for (Hotel hotel : db.hotels) {
            if (hotel.getId().equals(uuid)){
                System.out.println(hotel);
            }
        }
    }

    @Override
    public void showHotels() {
        for (Hotel hotel : db.hotels) {
            System.out.println(hotel);
        }

    }

    @Override
    public void editHotel() {
        for (Hotel hotel : db.hotels) {
            System.out.println("Name of hotel: "+hotel.getName()+" id: "+hotel.getId());
        }
        String hotelName=getLine("Enter hotel name");
        for (String location : db.locations) {
            System.out.println(location);
        }
        String location = getLine("Enter location (with capital letters)");
        Integer numberOfFloors = getInt("Enter the number of floors");
        Integer numberOfRooms = getInt("Enter the number of rooms");
        if (numberOfRooms% numberOfFloors==0){
            System.out.println("please enter the number of rooms divisible by number of floors");
            return;
        }
        Hotel hotel=new Hotel(hotelName,Location.valueOf(location),numberOfFloors,numberOfRooms);
        System.out.println("Hotel has been added successfully");
    }

    @Override
    public void deleteHotel() {

    }

    @Override
    public void showUsers() {

    }

    @Override
    public void showReservationHistory() {

    }

    @Override
    public void calcelReservation() {

    }

    @Override
    public void reserveForUser() {

    }
    public Integer menu(){
        return getInt("""
                0->exit
                1->add hotel
                2->show hotel
                3->show hotels
                4->edit hotel
                5->delete hotel
                6->show users
                7->edit user
                8->delete user
                9->show reservation history
                10->cancel reservation
                11->reserve for user""");
    }
}
