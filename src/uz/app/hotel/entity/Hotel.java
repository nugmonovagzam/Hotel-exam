package uz.app.hotel.entity;

import uz.app.hotel.database.DB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Hotel {
    private final String id = UUID.randomUUID().toString();
    private String name;
    private Location location;
    private Integer floors;
    private Integer roomsCount;
    private Integer numberOfUsers = 0;
    private HashMap<Integer, ArrayList<Room>> integerRoomHashMap = new HashMap<>();

    public Hotel(String name, Location location, Integer floors, Integer roomsCount) {
        ArrayList<Room> rooms = new ArrayList<>();
        this.name = name;
        this.location = location;
        this.floors = floors;
        this.roomsCount = roomsCount;
        for (int i = 1; i <= floors; i++) {
            for (int j = 1; j <= roomsCount; j++) {
                Room room = new Room(i * 10 + j);
                rooms.add(room);
            }
        }
    }


    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Integer getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(Integer roomsCount) {
        this.roomsCount = roomsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public HashMap<Integer, ArrayList<Room>> getIntegerRoomHashMap() {
        return integerRoomHashMap;
    }

    public void setIntegerRoomHashMap(HashMap<Integer, ArrayList<Room>> integerRoomHashMap) {
        this.integerRoomHashMap = integerRoomHashMap;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", floors=" + floors +
                ", roomsCount=" + roomsCount +
                '}';
    }
}
