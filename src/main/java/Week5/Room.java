package Week5;

public class Room {

    private int roomNumber;
    private int roomCap;
    private boolean roomBath;
    private boolean roomAvailability;


    public Room(int roomNumber, int roomCap, boolean roomBath, boolean roomAvailability) {
        this.roomNumber = roomNumber;
        this.roomCap = roomCap;
        this.roomBath = true;
        this.roomAvailability = true;


    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomCap() {
        return roomCap;
    }

    public void setRoomCap(int roomCap) {
        this.roomCap = roomCap;
    }

    public boolean isRoomBath() {
        return roomBath;
    }

    public void setRoomBath(boolean roomBath) {
        this.roomBath = roomBath;
    }

    public boolean isRoomAvailability() {
        return roomAvailability;
    }

    public void setRoomAvailability(boolean roomAvailability) {
        this.roomAvailability = roomAvailability;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomCap=" + roomCap +
                ", roomBath=" + roomBath +
                ", roomAvailability=" + roomAvailability +
                '}';
    }
}



