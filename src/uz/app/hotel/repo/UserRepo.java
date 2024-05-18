package uz.app.hotel.repo;

import uz.app.hotel.entity.User;
import uz.app.hotel.service.UserService;

public class UserRepo implements UserService {
    private User setCurrentUser;
    public static  User setCurrentUser(User user){
        return user;
    }

    @Override
    public void service() {

    }

    @Override
    public void showHotels() {

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
