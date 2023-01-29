package me.skyla.pathpeak.server.objects.ranks;

import java.util.HashMap;

/**
 * Object to hold all player game info (Gamemode, Rank, and Div)
 * Author: Skye
 * 1/28/2023
 */
public class GameplayInfo {

    private final MMRHelper helper = new MMRHelper();
    private HashMap<Gamemode, Integer> mmrMap;
    private HashMap<Gamemode, RankPackage> rankMap;

    private int casualMMR,  soloMMR, duoMMR,  trioMMR, rumbleMMR,  dropshotMMR,  hoopsMMR,  snowMMR,  tournamentMMR;
    private RankPackage casual, solo, duo, trio, rumble, dropshot, hoops, snow, tournament;

    /**
     * Constructor, make sure to run setup() to use!
     */
    public GameplayInfo() {

    }

    /**
     * Setup function:
     * Sets the MMRs and rank packages, also generates Hashmaps for mmr and ranks.
     * @param casualMMR Casual MMR
     * @param soloMMR Solo MMR
     * @param duoMMR Duo MMR
     * @param trioMMR Trio MMR
     * @param rumbleMMR Rumble MMR
     * @param dropshotMMR Dropshot MMR
     * @param hoopsMMR Hoops MMR
     * @param snowMMR Snow day MMR
     * @param tournamentMMR Tournament mmr
     */
    public void setup (int casualMMR, int soloMMR, int duoMMR, int trioMMR, int rumbleMMR, int dropshotMMR, int hoopsMMR, int snowMMR, int tournamentMMR) {
        setMMRs(casualMMR, soloMMR, duoMMR, trioMMR, rumbleMMR, dropshotMMR, hoopsMMR, snowMMR, tournamentMMR);
        setRankPackages();
        mmrMap = generateMMRMap();
        rankMap = generateRankMap();
    }

    /**
     * Sets all MMRs
     * @param casualMMR casual MMR
     * @param soloMMR solo MMR
     * @param duoMMR duos MMR
     * @param trioMMR trios MMR
     * @param rumbleMMR rumble MMR
     * @param dropshotMMR dropshot MMR
     * @param hoopsMMR hoops MMR
     * @param snowMMR snow day MMR
     * @param tournamentMMR tounament MMR
     */
    public void setMMRs(int casualMMR, int soloMMR, int duoMMR, int trioMMR, int rumbleMMR, int dropshotMMR, int hoopsMMR, int snowMMR, int tournamentMMR) {
        setCasualMMR(casualMMR);
        setSoloMMR(soloMMR);
        setDuoMMR(duoMMR);
        setTrioMMR(trioMMR);
        setRumbleMMR(rumbleMMR);
        setDropshotMMR(dropshotMMR);
        setHoopsMMR(hoopsMMR);
        setSnowMMR(snowMMR);
        setTournamentMMR(tournamentMMR);
    }

    /**
     * Generate a HashMap of Gamemodes and MMRs
     * @return A HashMap of Gamemodes and MMRs.
     */
    private HashMap<Gamemode, Integer> generateMMRMap() {
        HashMap<Gamemode, Integer> map = new HashMap<>();
        map.put(Gamemode.CASUAL, casualMMR);
        map.put(Gamemode.SOLO, soloMMR);
        map.put(Gamemode.DOUBLES, duoMMR);
        map.put(Gamemode.TRIOS, trioMMR);
        map.put(Gamemode.RUMBLE, rumbleMMR);
        map.put(Gamemode.DROPSHOT, dropshotMMR);
        map.put(Gamemode.HOOPS, hoopsMMR);
        map.put(Gamemode.HOCKEY, snowMMR);
        map.put(Gamemode.TOURNAMENT, tournamentMMR);
        return map;
    }

    public HashMap<Gamemode, Integer> getMmrMap() {
        return mmrMap;
    }

    /**
     * Get a MMR for a gamemode
     * @param g The gamemode to retrieve.
     * @return The MMR of the specified gamemode.
     */
    public Integer getMMR(Gamemode g) {
        return mmrMap.get(g);
    }

    /**
     * Use to update the MMR in the MMR map for a certain gamemode
     * @param g The gamemode to update.
     * @param i The new MMR
     */
    public void updateMMRMap(Gamemode g, Integer i) {
        mmrMap.replace(g, i);
    }

    public void setCasualMMR(int casualMMR) {
        this.casualMMR = casualMMR;
    }

    public void setSoloMMR(int soloMMR) {
        this.soloMMR = soloMMR;
    }

    public void setDuoMMR(int duoMMR) {
        this.duoMMR = duoMMR;
    }

    public void setTrioMMR(int trioMMR) {
        this.trioMMR = trioMMR;

    }

    public void setRumbleMMR(int rumbleMMR) {
        this.rumbleMMR = rumbleMMR;
    }

    public void setDropshotMMR(int dropshotMMR) {
        this.dropshotMMR = dropshotMMR;
    }

    public void setHoopsMMR(int hoopsMMR) {
        this.hoopsMMR = hoopsMMR;
    }

    public void setSnowMMR(int snowMMR) {
        this.snowMMR = snowMMR;
    }

    public void setTournamentMMR(int tournamentMMR) {
        this.tournamentMMR = tournamentMMR;
    }

    /**
     * Sets all rank packages based off of MMRs
     */
    public void setRankPackages() {
        setCasual(helper.translateMMR(Gamemode.CASUAL, casualMMR));
        setSolo(helper.translateMMR(Gamemode.SOLO, soloMMR));
        setDuo(helper.translateMMR(Gamemode.DOUBLES, duoMMR));
        setTrio(helper.translateMMR(Gamemode.TRIOS, trioMMR));
        setRumble(helper.translateMMR(Gamemode.RUMBLE, rumbleMMR));
        setDropshot(helper.translateMMR(Gamemode.DROPSHOT, dropshotMMR));
        setHoops(helper.translateMMR(Gamemode.HOOPS, hoopsMMR));
        setSnow(helper.translateMMR(Gamemode.HOCKEY, snowMMR));
        setTournament(helper.translateMMR(Gamemode.TOURNAMENT, tournamentMMR));
    }

    private HashMap<Gamemode, RankPackage> generateRankMap() {
        HashMap<Gamemode, RankPackage> map = new HashMap<>();
        map.put(Gamemode.CASUAL, casual);
        map.put(Gamemode.SOLO, solo);
        map.put(Gamemode.DOUBLES, duo);
        map.put(Gamemode.TRIOS, trio);
        map.put(Gamemode.RUMBLE, rumble);
        map.put(Gamemode.DROPSHOT, dropshot);
        map.put(Gamemode.HOOPS, hoops);
        map.put(Gamemode.HOCKEY, snow);
        map.put(Gamemode.TOURNAMENT, tournament);
        return map;
    }

    public HashMap<Gamemode, RankPackage> getRankMap() {
        return rankMap;
    }

    /**
     * Get a rank package for a gamemode
     * @param g The gamemode to retrieve.
     * @return The rank package of the specified gamemode.
     */
    public RankPackage getRankPackage(Gamemode g) {
        return rankMap.get(g);
    }

    /**
     * Use to update the rank package in the rank map for a certain gamemode
     * @param g The gamemode to update.
     * @param p The new package
     */
    public void updateRankMap(Gamemode g, RankPackage p) {
        rankMap.replace(g, p);
    }

    private void setCasual(RankPackage casual) {
        this.casual = casual;
    }

    private void setSolo(RankPackage solo) {
        this.solo = solo;
    }

    private void setDuo(RankPackage duo) {
        this.duo = duo;
    }

    private void setTrio(RankPackage trio) {
        this.trio = trio;
    }

    private void setRumble(RankPackage rumble) {
        this.rumble = rumble;
    }

    private void setDropshot(RankPackage dropshot) {
        this.dropshot = dropshot;
    }

    private void setHoops(RankPackage hoops) {
        this.hoops = hoops;
    }

    private void setSnow(RankPackage snow) {
        this.snow = snow;
    }

    private void setTournament(RankPackage tournament) {
        this.tournament = tournament;
    }

    @Override
    public String toString() {
        return "Casual: " + getMMR(Gamemode.CASUAL) + "\n" + "Solo: " + getRankPackage(Gamemode.SOLO) + "\n" + "Doubles: " + getRankPackage(Gamemode.DOUBLES) +
                "\n" + "Standard: " + getRankPackage(Gamemode.TRIOS) + "\n" + "Rumble: " + getRankPackage(Gamemode.RUMBLE) +
                "\n" + "Dropshot: " + getRankPackage(Gamemode.DROPSHOT) + "\n" + "Hoops: " + getRankPackage(Gamemode.HOOPS) +
                "\n" + "Snow Day: " + getRankPackage(Gamemode.HOCKEY) + "\n" + "Tournaments: " + getRankPackage(Gamemode.TOURNAMENT);
    }
}
