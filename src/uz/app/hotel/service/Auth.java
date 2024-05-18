package uz.app.hotel.service;

import uz.app.hotel.database.DB;
import uz.app.hotel.entity.User;
import uz.app.hotel.repo.UserRepo;

import static uz.app.hotel.utils.Utils.*;

public class Auth implements AuthService {
    DB db = DB.getInstance();
    AdminWork adminWork=new AdminWork();
    UserRepo userRepo = new UserRepo();

    @Override
    public void signUp() {
        String name = getLine("Enter name");
        String userName = getLine("Enter user name");
        String password = getLine("Enter password");
        for (int i = 0; i < db.users.size(); i++) {
            if ((db.users.get(i).getUsername().equals(userName))) {
                System.out.println("This username already exists  ");
                return;
            }
        }
        User user = new User(name, userName, password);
        db.users.add(user);
        System.out.println("user adding !!");
    }

    public void signIn() {
        String userName = getLine("Enter user name");
        String password = getLine("Enter password");
        for (int i = 0; i < db.users.size(); i++) {
            if (db.users.get(i).getUsername().equals(userName) && db.users.get(i).getPassword().equals(password)) {
                if (db.users.get(i).getUserRole().name().equals("USER")) {
                   userRepo.setCurrentUser(db.users.get(i));
                } else if (db.users.get(i).getUserRole().name().equals("ADMIN")) {
                    adminWork.service();
                }
            }
        }
    }
}
