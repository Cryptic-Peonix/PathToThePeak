package me.skyla.pathpeak.server.objects;

/**
 * Object to hold all player game info (Gamemode, Rank, and Div)
 * Author: Skye
 * 1/28/2023
 */
public class GameplayInfo {

    private final Gamemode gamemode;
    private Rank rank;
    private Tier tier;
    private Division division;

    public GameplayInfo(Gamemode g, Rank r, Tier t, Division d) {
        this.gamemode = g;
        this.rank = r;
        this.tier = t;
        this.division = d;
    }

    public GameplayInfo(Gamemode g, int mmr) {
        this.gamemode = g;
        if (!gamemode.equals(Gamemode.CASUAL)) {
            switch (g) {

            }
        } else {
            rank = Rank.CASUAL;
            tier = Tier.I;
            division = Division.I;
        }
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

    public Tier getTier() {
        return tier;
    }

    /**
     * @return A string containing the rank and division.
     */
    public String getGamemodeAndDivAsString() {
        return rank.toString() + " " + tier.toString() + " " + division.toString();
    }
}
