package me.skyla.pathpeak.server.objects.ranks;

import java.util.ArrayList;
import java.util.Collections;

public final class MMRHelper {
    public MMRHelper() {

    }

    /**
     * <b>Helper Rank</b>
     */
    private Rank rank = Rank.CASUAL;
    /**
     * Helper tier
     */
    private Tier tier = Tier.I;
    /**
     * Helper division
     */
    private Division div = Division.I;

    /**
     * Create a RankPackage object from given MMR and gamemode
     *
     * @param g   Given Gamemode
     * @param mmr Given MMR
     * @return A new RankPackage object
     */
    public RankPackage translateMMR(Gamemode g, int mmr) {
        if (g.isCasual()) {
            return new RankPackage(Rank.CASUAL, Tier.I, Division.I);
        } else {
            //Determine if bronze
            if (mmr < g.silverGate) {
                rank = Rank.BRONZE;
                //Determine tier
                if (mmr < g.b2) {
                    tier = Tier.I;

                    //Determine division
                    if (mmr < g.b1d2) {
                        div = Division.I;
                    } else if (mmr < g.b1d3) {
                        div = Division.II;
                    } else if (mmr < g.b1d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                } else if (mmr < g.b3) {
                    tier = Tier.II;

                    if (mmr < g.b2d2) {
                        div = Division.I;
                    } else if (mmr < g.b2d3) {
                        div = Division.II;
                    } else if (mmr < g.b2d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                } else {
                    tier = Tier.III;

                    if (mmr < g.b3d2) {
                        div = Division.I;
                    } else if (mmr < g.b3d3) {
                        div = Division.II;
                    } else if (mmr < g.b3d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                }

                //Determine if Silver
            } else if (mmr < g.goldGate) {
                rank = Rank.SILVER;
                //Determine tier
                if (mmr < g.s2) {
                    tier = Tier.I;

                    //Determine division
                    if (mmr < g.s1d2) {
                        div = Division.I;
                    } else if (mmr < g.s1d3) {
                        div = Division.II;
                    } else if (mmr < g.s1d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                } else if (mmr < g.s3) {
                    tier = Tier.II;

                    if (mmr < g.s2d2) {
                        div = Division.I;
                    } else if (mmr < g.s2d3) {
                        div = Division.II;
                    } else if (mmr < g.s2d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                } else {
                    tier = Tier.III;

                    if (mmr < g.s3d2) {
                        div = Division.I;
                    } else if (mmr < g.s3d3) {
                        div = Division.II;
                    } else if (mmr < g.s3d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                }

                //Determine if Gold
            } else if (mmr < g.platGate) {
                rank = Rank.GOLD;
                //Determine tier
                if (mmr < g.g2) {
                    tier = Tier.I;

                    //Determine division
                    if (mmr < g.g1d2) {
                        div = Division.I;
                    } else if (mmr < g.g1d3) {
                        div = Division.II;
                    } else if (mmr < g.g1d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                } else if (mmr < g.g3) {
                    tier = Tier.II;

                    if (mmr < g.g2d2) {
                        div = Division.I;
                    } else if (mmr < g.g2d3) {
                        div = Division.II;
                    } else if (mmr < g.g2d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                } else {
                    tier = Tier.III;

                    if (mmr < g.g3d2) {
                        div = Division.I;
                    } else if (mmr < g.g3d3) {
                        div = Division.II;
                    } else if (mmr < g.g3d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                }

                //Determine if Plat
            } else if (mmr < g.diamondGate) {
                rank = Rank.PLAT;
                //Determine tier
                if (mmr < g.p2) {
                    tier = Tier.I;

                    //Determine division
                    if (mmr < g.p1d2) {
                        div = Division.I;
                    } else if (mmr < g.p1d3) {
                        div = Division.II;
                    } else if (mmr < g.p1d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                } else if (mmr < g.s3) {
                    tier = Tier.II;

                    if (mmr < g.p2d2) {
                        div = Division.I;
                    } else if (mmr < g.p2d3) {
                        div = Division.II;
                    } else if (mmr < g.p2d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                } else {
                    tier = Tier.III;

                    if (mmr < g.p3d2) {
                        div = Division.I;
                    } else if (mmr < g.p3d3) {
                        div = Division.II;
                    } else if (mmr < g.p3d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                }

                //Determine if Diamond
            } else if (mmr < g.champGate) {
                rank = Rank.DIAMOND;
                //Determine tier
                if (mmr < g.d2) {
                    tier = Tier.I;

                    //Determine division
                    if (mmr < g.d1d2) {
                        div = Division.I;
                    } else if (mmr < g.d1d3) {
                        div = Division.II;
                    } else if (mmr < g.d1d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                } else if (mmr < g.d3) {
                    tier = Tier.II;

                    if (mmr < g.d2d2) {
                        div = Division.I;
                    } else if (mmr < g.d2d3) {
                        div = Division.II;
                    } else if (mmr < g.d2d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                } else {
                    tier = Tier.III;

                    if (mmr < g.d3d2) {
                        div = Division.I;
                    } else if (mmr < g.d3d3) {
                        div = Division.II;
                    } else if (mmr < g.d3d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                }

                //Determine if Champ
            } else if (mmr < g.gCGate) {
                rank = Rank.CHAMPION;
                //Determine tier
                if (mmr < g.c2) {
                    tier = Tier.I;

                    //Determine division
                    if (mmr < g.c1d2) {
                        div = Division.I;
                    } else if (mmr < g.c1d3) {
                        div = Division.II;
                    } else if (mmr < g.c1d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                } else if (mmr < g.c3) {
                    tier = Tier.II;

                    if (mmr < g.c2d2) {
                        div = Division.I;
                    } else if (mmr < g.c2d3) {
                        div = Division.II;
                    } else if (mmr < g.c2d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                } else {
                    tier = Tier.III;

                    if (mmr < g.c3d2) {
                        div = Division.I;
                    } else if (mmr < g.c3d3) {
                        div = Division.II;
                    } else if (mmr < g.c3d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                }

                //Determine if Grand Champ
            } else if (mmr < g.sSLGate) {
                rank = Rank.GC;
                //Determine tier
                if (mmr < g.gc2) {
                    tier = Tier.I;

                    //Determine division
                    if (mmr < g.gc1d2) {
                        div = Division.I;
                    } else if (mmr < g.gc1d3) {
                        div = Division.II;
                    } else if (mmr < g.gc1d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                } else if (mmr < g.gc3) {
                    tier = Tier.II;

                    if (mmr < g.gc2d2) {
                        div = Division.I;
                    } else if (mmr < g.gc2d3) {
                        div = Division.II;
                    } else if (mmr < g.gc2d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                } else {
                    tier = Tier.III;

                    if (mmr < g.gc3d2) {
                        div = Division.I;
                    } else if (mmr < g.gc3d3) {
                        div = Division.II;
                    } else if (mmr < g.gc3d4) {
                        div = Division.III;
                    } else {
                        div = Division.IV;
                    }
                }

                //Determine if SSL
            } else if (mmr >= g.sSLGate) {
                rank = Rank.SSL;
                tier = Tier.I;
                div = Division.I;
            }

            // Assign Vals to temp variables, so we can reset the helper
            Rank tRank = this.rank;
            Tier tTier = this.tier;
            Division tDivision = this.div;
            resetHelper();
            return new RankPackage(tRank, tTier, tDivision);
        }
    }

    /**
     * @return An array of every gamemode in Rocket League
     */
    public Gamemode[] generateGamemodeArray() {
        return Gamemode.values();
    }

    /**
     * @return An ArrayList of every gamemode in Rocket League
     */
    public ArrayList<Gamemode> generateGamemodeArrayList() {
        ArrayList<Gamemode> list = new ArrayList<>();
        Collections.addAll(list, generateGamemodeArray());
        return list;
    }


    /**
     * Reset the helper to its default state, gets called after every method.
     */
    private void resetHelper() {
        this.rank = Rank.CASUAL;
        this.tier = Tier.I;
        this.div = Division.I;
    }
}
