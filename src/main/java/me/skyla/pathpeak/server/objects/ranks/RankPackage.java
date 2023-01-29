package me.skyla.pathpeak.server.objects.ranks;

/**
 * A Rank package, holds rank name, tier, and division
 * Note: Defaults to Casual I Division I
 * Author: Skye
 * 1/28/2023
 */
public class RankPackage {
    private Rank r;
    private Tier t;
    private Division d;

    /**
     * Default Constructor
     */
    public RankPackage() {
        r = Rank.CASUAL;
        t = Tier.I;
        d = Division.I;
    }

    /**
     * Custom Constructor
     * @param r Rank
     * @param t Tier
     * @param d Division
     */
    public RankPackage(Rank r, Tier t, Division d) {
        this.r = r;
        this.t = t;
        this.d = d;
    }

    public Division getD() {
        return d;
    }

    public Rank getR() {
        return r;
    }

    public Tier getT() {
        return t;
    }

    public void setD(Division d) {
        this.d = d;
    }

    public void setR(Rank r) {
        this.r = r;
    }

    public void setT(Tier t) {
        this.t = t;
    }

    /**
     * Set the rank info for this package
     * @param rank Rank name
     * @param tier Tier (I, II, III)
     * @param division Division (I, II, III, IV)
     */
    public void setInfo(Rank rank, Tier tier, Division division) {
        setR(rank);
        setT(tier);
        setD(division);
    }

    @Override
    public String toString() {
        return this.r + " " + this.t + " Division " + this.d;
    }
}
