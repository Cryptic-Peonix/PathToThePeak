package me.skyla.pathpeak.server.objects;

import me.skyla.pathpeak.server.objects.ranks.GameplayInfo;
import me.skyla.pathpeak.server.objects.ranks.MMRHelper;

/**
 * User class, for players that are using the service
 * Author: Skye
 * 1/28/2023
 */
public class User {

    private String name;
    private static final int DEFAULT_MMR = 600;

    private final MMRHelper helper = new MMRHelper();
    private final GameplayInfo info = new GameplayInfo();

    /**
     * User with default values
     */
    public User() {
        this.name = "Jimbob";
        info.setMMRs(DEFAULT_MMR, DEFAULT_MMR, DEFAULT_MMR, DEFAULT_MMR, DEFAULT_MMR,DEFAULT_MMR, DEFAULT_MMR, DEFAULT_MMR, DEFAULT_MMR);
    }
    public User(String name, int casualMMR, int soloMMR, int duoMMR, int trioMMR, int rumbleMMR, int dropshotMMR, int hoopsMMR, int snowMMR, int tournamentMMR) {
        this.name = name;
        info.setup(casualMMR, soloMMR, duoMMR, trioMMR, rumbleMMR, dropshotMMR, hoopsMMR, snowMMR, tournamentMMR);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User " + name + ":\n" + info.toString();
    }
}
