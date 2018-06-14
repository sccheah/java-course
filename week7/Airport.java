import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Airport {
    private HashMap<String, Plane> planes;
    private ArrayList<Flight> flights;
    private Scanner airportScanner;
    private Scanner flightScanner;

    public Airport() {
        planes = new HashMap<String, Plane>();
        flights = new ArrayList<Flight>();
    }

    public void addPlane(String ID, int capacity) {
        Plane plane = new Plane(ID, capacity);
        planes.put(ID, plane);
    }

    public void addFlight(String ID, String departureCode, String destinationCode) {
        Flight flight = new Flight(planes.get(ID), departureCode, destinationCode);
        flights.add(flight);
    }

    public void printPlanes() {
        for (String key : planes.keySet()) {
            System.out.println(planes.get(key));
        }
    }

    public void printFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

    public void printPlaneInfo(String ID) {
        System.out.println(planes.get(ID));
    } 

    public void printAirportPanelMenu() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }

    public void runAirportPanel(Scanner scanner) {
        airportScanner = scanner;
        String command;
        String planeID;
        String departureCode;
        String destinationCode;
        int capacity;

        System.out.println("Airport panel");
        System.out.println("--------------------\n");
        printAirportPanelMenu();
        
        command = airportScanner.nextLine();

        while(!command.equals("x")) {
            if (command.equals("1")) {
                System.out.print("Give plane ID: ");
                planeID = airportScanner.nextLine();

                System.out.print("Give plane capacity: ");
                capacity = Integer.parseInt(airportScanner.nextLine());

                addPlane(planeID, capacity);
            }

            if (command.equals("2")) {
                System.out.print("Give plane ID: ");
                planeID = airportScanner.nextLine();

                System.out.print("Give departure airport code: ");
                departureCode = airportScanner.nextLine();

                System.out.print("Give destination airport code: ");
                destinationCode = airportScanner.nextLine();

                addFlight(planeID, departureCode, destinationCode);
            }

            printAirportPanelMenu();
            command = airportScanner.nextLine();
        }
    }

    public void printFlightServiceMenu() {
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
    }
    public void runFlightService(Scanner scanner) {
        flightScanner = scanner;
        String command;
        String planeID;

        System.out.println("Flight service");
        System.out.println("------------\n");

        printFlightServiceMenu();
        command = flightScanner.nextLine();

        while(!command.equals("x")) {
            if (command.equals("1")) {
                printPlanes();
            }

            if (command.equals("2")) {
                printFlights();
            }

            if (command.equals("3")) {
                System.out.print("Give plane ID: ");
                planeID = flightScanner.nextLine();

                printPlaneInfo(planeID);
            }

            printFlightServiceMenu();
            command = flightScanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Airport airport = new Airport();
        Scanner airportScanner = new Scanner(System.in);
        Scanner flightScanner = new Scanner(System.in);

        airport.runAirportPanel(airportScanner);
        airport.runFlightService(flightScanner);
    }
}