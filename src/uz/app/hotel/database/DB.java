package uz.app.hotel.database;

import uz.app.hotel.entity.Hotel;
import uz.app.hotel.entity.Location;
import uz.app.hotel.entity.Reservation;
import uz.app.hotel.entity.User;
import uz.app.hotel.service.AdminService;

import java.util.ArrayList;
import java.util.Arrays;

public class DB {
    public ArrayList<Hotel> hotels=new ArrayList<>();
    public ArrayList<String> locations=new ArrayList<>(Arrays.asList("TASHKENT,NAMANGAN,BUXORO,ANDIJON,XORAZIM"));
    public ArrayList<User> users=new ArrayList<>();
    public ArrayList<Reservation> reservations= new ArrayList<>();


    private static DB db ;
    public static DB getInstance(){
        if (db == null)
            db=new DB();
        return db;
    }


}
