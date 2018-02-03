package Week5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        RoomService uS = new RoomServiceImpl();
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
                    uS.roomOrder();
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

