package Week5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        RoomService uS = new RoomServiceImpl();
        List<Guest> listGuest = new ArrayList<>();


        Guest guest1 = new Guest("Michal","Patyk", LocalDate.parse("1991-01-05"));
        Guest guest2 = new Guest("Michal","Drugi", LocalDate.parse("1899-05-21"));
        Guest guest3 = new Guest("Michal","Trzeci", LocalDate.parse("2015-09-12"));


        listGuest.add(guest1);
        listGuest.add(guest2);
        listGuest.add(guest3);

        char x;

        while (true){
            uS.startMenu();
            System.out.print("  SELECTION:  ");
            x = scanner.next().charAt(0);
            switch (x){
                case '1':
                    System.out.println("================  List of rooms  ================");
                    uS.listOfRooms();
                    break;
                case '2':
                    System.out.println("===========  List of available rooms  ===========");
                    uS.listOfFreeRooms();
                    break;
                case '3':
                    System.out.print("  SELECTION ROOM:  ");
                    uS.roomOrder(listGuest);
                    break;
                case '4':
                    System.out.print("  SELECTION ROOM:  ");
                    uS.roomMoveOut();
                    break;
                case '5':
                    System.exit(0);
                    break;
                default:
                    System.out.println("No way!");
                    break;
            }
        }
    }
}

