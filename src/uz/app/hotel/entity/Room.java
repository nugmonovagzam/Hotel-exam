package uz.app.hotel.entity;

public class Room {
    private  int numberRoom;
    private  RoomStatus roomStatus;

    public Room() {
    }

    public Room(int numberRoom) {
        this.numberRoom = numberRoom;
        this.roomStatus = RoomStatus.OPEN;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberRoom=" + numberRoom +
                ", roomStatus=" + roomStatus +
                '}';
    }
}
