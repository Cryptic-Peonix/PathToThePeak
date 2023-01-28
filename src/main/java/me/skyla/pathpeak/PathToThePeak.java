package me.skyla.pathpeak;

import me.skyla.pathpeak.server.objects.*;

public class PathToThePeak {

    public static void main(String[] args) {
        //GameplayInfo test = new GameplayInfo(Gamemode.DOUBLES, Rank.SILVER, Tier.II, Division.IV);
        MMRHelper helper = new MMRHelper();
        System.out.println(helper.translateMMR(Gamemode.SOLO, 823));

    }
}
