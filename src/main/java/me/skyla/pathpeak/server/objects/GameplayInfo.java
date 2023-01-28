package me.skyla.pathpeak.server.objects;

/**
 * Object to hold all player game info (Gamemode, Rank, and Div)
 * Author: Skye
 * 1/28/2023
 */
public class GameplayInfo {

    private Gamemode gamemode;
    private Rank rank;
    private Division division;

    public GameplayInfo(Gamemode g, Rank r, Division d) {
        this.gamemode = g;
        this.rank = r;
        this.division = d;
    }

    public GameplayInfo(Gamemode g, int mmr) {
        this.gamemode = g;

    }

    public Division getDivision() {
        return division;
    }

    public Rank getRank() {
        return rank;
    }

    public Gamemode getGamemode() {
        return gamemode;
    }
}
