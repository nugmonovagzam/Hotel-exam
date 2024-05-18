package uz.app.hotel.repo;

import uz.app.hotel.database.DB;
import uz.app.hotel.entity.Hotel;
import uz.app.hotel.entity.User;
import uz.app.hotel.service.UserService;

import static uz.app.hotel.utils.Utils.*;


public class UserRepo implements UserService {
    DB db = DB.getInstance();
    private User currentUser;

    public void setCurrentUser(User user) {
        this.currentUser = user;
        service();
    }

    @Override
    public void service() {
        showHotels();
        int hotelIndexChooseHotel = getInt("Choose hotel ") - 1;
        if (hotelIndexChooseHotel> db.hotels.size()){
            System.out.println("This index no hotel");
            return;
        }
        Hotel hotel = db.hotels.get(hotelIndexChooseHotel);
        hotel.getIntegerRoomHashMap().forEach((key,val)->{
            for (Integer i = 1; i <=key; i++) {
                System.out.println(i+"- floor");
                for (int i1 = 1; i1 <=val.size(); i1++) {
                    System.out.println(val.get(i));
                }
            }
        });
        int index=getInt("Chosse room ")-1;


    }

    @Override
    public void showHotels() {
        for (int i = 0; i < db.users.size(); i++) {
            System.out.println((i + 1) + "-" + db.hotels.get(i));
        }
    }

    @Override
    public void showReservations() {

    }

    @Override
    public void reserve() {

    }

    @Override
    public void cancelReservation() {

    }

    @Override
    public void rescheduleReservation() {

    }

    @Override
    public void showHistory() {

    }
}
