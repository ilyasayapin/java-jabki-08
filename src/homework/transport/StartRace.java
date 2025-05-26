package homework.transport;

public class StartRace {

    public static void startRace(Transport[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
        }
    }
}
