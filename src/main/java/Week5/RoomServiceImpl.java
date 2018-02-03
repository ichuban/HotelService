package Week5;

import java.util.Scanner;

public class RoomServiceImpl implements RoomService {

    private int roomNr;
    private Hotel hotel = new Hotel();
    private Hotel hotelAvi = new Hotel();
    private Scanner sc = new Scanner(System.in);

    public void listOfRooms() {
        for (int i = 0;i < hotel.roomList.size();i++){
            System.out.println(hotel.roomList.get(i));
        }
        System.out.println("-------------------------------");
    }

    public void listOfFreeRooms() {
        for (int i = 0; i < hotelAvi.roomList.size();i++){
            if (hotelAvi.roomList.get(i).isRoomAvailability()){
                System.out.println(hotelAvi.roomList.get(i));
            }
        }
        System.out.println("-------------------------");
    }

    public void roomOrder() {
        roomNr = sc.nextInt();
        for (int i = 0;i<hotelAvi.roomList.size();i++){
            if (hotelAvi.roomList.get(i).getRoomNumber() == roomNr ){
                if (hotelAvi.roomList.get(i).isRoomAvailability()){
                    hotelAvi.roomList.get(i).setRoomAvailability(false);
                }
            }
        }
    }

    public void roomMoveOut() {
    roomNr = sc.nextInt();
    for (int i = 0;i<hotelAvi.roomList.size();i++){
        if(hotelAvi.roomList.get(i).getRoomNumber() == roomNr){
            if(!hotelAvi.roomList.get(i).isRoomAvailability()){
hotelAvi.roomList.get(i).setRoomAvailability(true);
            }
        }
    }
    }
public void startMenu(){
    System.out.println("---------------------------------------------------------------\n" +
            "-------------------------   WELCOME   -------------------------\n" +
            "---------------------------------------------------------------\n" +
            "--------------------  1. List of rooms  -----------------------\n" +
            "--------------------  2. List of available rooms  -------------\n" +
            "--------------------  3. Book a room  -------------------------\n" +
            "--------------------  4. Free the room  -----------------------\n" +
            "--------------------  5. Exit  --------------------------------\n" +
            "---------------------------------------------------------------");
}
}
