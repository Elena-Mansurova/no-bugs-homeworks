package practice_4;

public class GameSettings {

    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName) {
        this.gameName = gameName;
        currentPlayers = 0;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    public void addPlayers() {

        if (currentPlayers < maxPlayers) {
            currentPlayers ++;
        }
    }

    public void printGameStatus() {
        System.out.println(gameName + ", " + currentPlayers + ",  " + maxPlayers);
    }


}
