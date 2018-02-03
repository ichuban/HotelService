package Week5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {


    List<Room> roomList = new ArrayList<>();

    Hotel() {
        Room room1 = new Room(1,1,true,true,true);
        Room room2 = new Room(2, 1, true, true,true);
        Room room3 = new Room(3, 2, false, true,true);
        Room room4 = new Room(4, 2, true, true,true);
        Room room5 = new Room(5, 3, true, true,true);
        Room room6 = new Room(6, 4, true, true,true);
        Room room7 = new Room(7, 7, false, true,true);
        Room room8 = new Room(8, 2, true, true,true);
        Room room9 = new Room(9, 6, true, true,true);
        Room room10 = new Room(10, 1, true, true,true);



        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        roomList.add(room4);
        roomList.add(room5);
        roomList.add(room6);
        roomList.add(room7);
        roomList.add(room8);
        roomList.add(room9);
        roomList.add(room10);


    }
}

