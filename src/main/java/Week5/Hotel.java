package Week5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {


    List<Room> roomList = new ArrayList<>();

    Hotel() {
        Room room1 = new Room(1,1,true,true,true, LocalDate.parse("2018-02-15"),LocalDate.parse("2018-02-27"));
        Room room2 = new Room(2, 1, true, true,true, LocalDate.parse("2018-02-14"),LocalDate.parse("2018-02-21"));
        Room room3 = new Room(3, 2, false, true,true, LocalDate.parse("2018-02-13"),LocalDate.parse("2018-02-22"));
        Room room4 = new Room(4, 2, true, true,true, LocalDate.parse("2018-02-12"),LocalDate.parse("2018-02-23"));
        Room room5 = new Room(5, 3, true, true,true, LocalDate.parse("2018-02-11"),LocalDate.parse("2018-02-24"));
        Room room6 = new Room(6, 4, true, true,true, LocalDate.parse("2018-02-10"),LocalDate.parse("2018-02-25"));
        Room room7 = new Room(7, 7, false, true,true, LocalDate.parse("2018-02-09"),LocalDate.parse("2018-02-26"));
        Room room8 = new Room(8, 2, true, true,true, LocalDate.parse("2018-02-08"),LocalDate.parse("2018-02-27"));
        Room room9 = new Room(9, 6, true, true,true, LocalDate.parse("2018-02-07"),LocalDate.parse("2018-02-25"));
        Room room10 = new Room(10, 1, true, true,true, LocalDate.parse("2018-02-06"),LocalDate.parse("2018-02-27"));



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

