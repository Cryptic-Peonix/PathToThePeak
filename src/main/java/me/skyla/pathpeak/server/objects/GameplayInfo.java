package me.skyla.pathpeak.server.objects;

/**
 * Object to hold all player game info (Gamemode, Rank, and Div)
 * Author: Skye
 * 1/28/2023
 */
public class GameplayInfo {

    private final Gamemode gamemode;
    private final RankPackage rankPackage = new RankPackage();

    public GameplayInfo(Gamemode g, Rank r, Tier t, Division d) {
        this.gamemode = g;
        this.rankPackage.setInfo(r, t, d);
    }

    public GameplayInfo(Gamemode g, int mmr) {
        this.gamemode = g;
        if (!gamemode.equals(Gamemode.CASUAL)) {
            switch (g) {
                case SOLO:

                    break;
            }
        } else {
            this.rankPackage.setInfo(Rank.CASUAL, Tier.I, Division.I);
        }
    }


    public Division getDivision() {
        return rankPackage.getD();
    }

    public Rank getRank() {
        return rankPackage.getR();
    }

    public Gamemode getGamemode() {
        return gamemode;
    }

    public Tier getTier() {
        return rankPackage.getT();
    }

    public RankPackage getRankPackage() {
        return rankPackage;
    }

    /**
     * @return A string containing the rank and division.
     */
    public String getGamemodeAndDivAsString() {
        return rankPackage.toString();
    }
}
