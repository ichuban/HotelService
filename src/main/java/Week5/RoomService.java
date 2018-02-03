package Week5;

import java.util.List;

public interface RoomService {

    void listOfRooms();
    void listOfFreeRooms();
    boolean roomOrder(List<Guest>guestList);
    boolean roomMoveOut();
    void startMenu();
}
