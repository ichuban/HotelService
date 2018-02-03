package Week5;

import java.time.LocalDate;

public class Room {

    private int roomNumber;
    private int roomCap;
    private boolean roomBath;
    private boolean roomAvailability;
    private boolean isRoomClean;
    private boolean isRoomDirty;
    private LocalDate moveInDate;
    private LocalDate moveOutDate;





    public Room(int roomNumber, int roomCap, boolean roomBath, boolean roomAvailability,boolean isRoomClean,LocalDate moveInDate,LocalDate moveOutDate) {
        this.roomNumber = roomNumber;
        this.roomCap = roomCap;
        this.roomBath = roomBath;
        this.roomAvailability = roomAvailability;
        this.isRoomClean = isRoomClean;
        this.moveInDate = moveInDate;
        this.moveOutDate = moveOutDate;
    }

    public boolean isRoomClean() {
        return isRoomClean;
    }

    public void setRoomClean(boolean roomClean) {
        isRoomClean = roomClean;
    }

    public boolean isRoomDirty() {
        return isRoomDirty;
    }

    public void setRoomDirty(boolean roomDirty) {
        isRoomDirty = roomDirty;
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

    public LocalDate getMoveInDate() {
        return moveInDate;
    }

    public void setMoveInDate(LocalDate moveInDate) {
        this.moveInDate = moveInDate;
    }

    public LocalDate getMoveOutDate() {
        return moveOutDate;
    }

    public void setMoveOutDate(LocalDate moveOutDate) {
        this.moveOutDate = moveOutDate;
    }

    @Override
    public String toString() {
        return "Hotel Grosik: {" +
                "Numer Pokoju: " + roomNumber +
                "  Na ile osób: " + roomCap +
                "  Lazienka: " + roomBath +
                "  Dostępność Pokoju: " + roomAvailability +
                "  Pokoj Posprzątany: " + isRoomClean +
                "  Data Opuszczenia" + moveOutDate +

                '}';
    }
}




