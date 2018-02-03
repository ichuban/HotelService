package Week5;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class RoomServiceImpl implements RoomService {
    protected static final Logger log = Logger.getLogger(RoomServiceImpl.class.getName());
    private int roomNr;
    private Hotel hotel = new Hotel();
    private Hotel hotelAvi = new Hotel();
    private Scanner sc = new Scanner(System.in);

    public void listOfRooms() {
        for (int i = 0; i < hotel.roomList.size(); i++) {
            System.out.println(hotel.roomList.get(i));
        }
        System.out.println("-------------------------------");
    }

    public void listOfFreeRooms() {
        for (int i = 0; i < hotelAvi.roomList.size(); i++) {
            if (hotelAvi.roomList.get(i).isRoomAvailability()) {
                System.out.println(hotelAvi.roomList.get(i));
            }
        }
        System.out.println("----------------------");
    }

    public boolean roomOrder(List<Guest> guestList) {

        if (Guest.getDayOfBirth().isBefore(LocalDate.now().minusYears(18))) {
            log.warning("Uzytkownik nie ma 18 lat");
            return false;
        }

        roomNr = sc.nextInt();


        for (int i = 0; i < hotelAvi.roomList.size(); i++) {
            if (hotelAvi.roomList.get(i).getRoomNumber() == roomNr) {
                if (hotelAvi.roomList.get(i).isRoomAvailability()) {
                    hotelAvi.roomList.get(i).setRoomAvailability(false);
                    if (!hotelAvi.roomList.get(i).isRoomClean()) {
                        log.warning("Pokoj nie posprzatany, wybierz inny pokój");
                    }
                }
            }
        }


        return false;
    }

    public boolean roomMoveOut() {
        roomNr = sc.nextInt();
        for (int i = 0; i < hotelAvi.roomList.size(); i++) {
            if (hotelAvi.roomList.get(i).getRoomNumber() == roomNr) {
                if (!hotelAvi.roomList.get(i).isRoomAvailability()) {
                    hotelAvi.roomList.get(i).setRoomAvailability(true);
                    if (hotelAvi.roomList.get(i).isRoomClean()) {
                        hotelAvi.roomList.get(i).setRoomClean(false);
                    }

                }
            }
        }


        return false;
    }

    public void startMenu() {
        System.out.println("---------------------------------------------------------------\n" +
                "-------------------------   HOTEL ORLIK   ---------------------\n" +
                "---------------------------------------------------------------\n" +
                "--------------------  1. Lista Pokoji  ------------------------\n" +
                "--------------------  2. Lista Dostępnych Pokoji  -------------\n" +
                "--------------------  3. Zamów Pokoj  -------------------------\n" +
                "--------------------  4. Zwolnij Pokój  -----------------------\n" +
                "--------------------  5. Wyjscie  -----------------------------\n" +
                "--------------------  6. Zleć posprzątanie pokoji  ------------\n" +
                "---------------------------------------------------------------");
    }

    public void cleanRoomService() {
        for (int i = 0; i < hotelAvi.roomList.size(); i++) {
            if (!hotelAvi.roomList.get(i).isRoomClean()) {
                System.out.println(hotelAvi.roomList.get(i));
            }
        }

        roomNr = sc.nextInt();
        for (int i = 0; i < hotelAvi.roomList.size(); i++) {
            if (hotelAvi.roomList.get(i).getRoomNumber() == roomNr) {
                hotelAvi.roomList.get(i).setRoomClean(true);
                log.info("Pokoj nr:" + roomNr + " " + "posprzątany");
            }
        }


    }

}
