package me.skyla.pathpeak.server.objects;

/**
 * Simple Enum for each gamemode in Rocket League
 * Gates are the MMR barriers for each rank, for example, the Silver gate would be the
 * lowest mmr needed for silver.
 * Author: Skye
 * 1/28/2023
 */
public enum Gamemode {
    CASUAL(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    SOLO(-10000, 114, 128, 141, 155, 159, 178, 197, 215, 219, 238, 257, 274, 279, 298, 317, 335, 339, 358, 377, 395, 399, 418,437, 455, 459, 478, 497, 515, 519, 538, 557, 575, 579, 598, 617, 635, 639, 658, 677, 695, 699, 718, 737, 755, 759, 778, 797, 815, 819, 838, 857, 875, 879, 898, 917, 935, 939, 958, 977, 995, 999, 1018, 1037, 1055, 1059, 1078, 1097, 1114, 1120, 1138, 1157, 1175, 1180, 1198, 1217, 1231, 1240, 1258, 1277, 1287, 1299, 1318, 1337, 1340);
    //DOUBLES,
    //TRIOS,
    //RUMBLE,
    //DROPSHOT,
    //HOOPS,
    //HOCKEY,
    //TOURNAMENT;

    //Bronze
    final int bronzeGate;
    final int b1d2;
    final int b1d3;
    final int b1d4;
    final int b2;
    final int b2d2;
    final int b2d3;
    final int b2d4;
    final int b3;
    final int b3d2;
    final int b3d3;
    final int b3d4;

    //Silver
    final int silverGate;
    final int s1d2;
    final int s1d3;
    final int s1d4;
    final int s2;
    final int s2d2;
    final int s2d3;
    final int s2d4;
    final int s3;
    final int s3d2;
    final int s3d3;
    final int s3d4;

    //Gold
    final int goldGate;
    final int g1d2;
    final int g1d3;
    final int g1d4;
    final int g2;
    final int g2d2;
    final int g2d3;
    final int g2d4;
    final int g3;
    final int g3d2;
    final int g3d3;
    final int g3d4;

    //Plat
    final int platGate;
    final int p1d2;
    final int p1d3;
    final int p1d4;
    final int p2;
    final int p2d2;
    final int p2d3;
    final int p2d4;
    final int p3;
    final int p3d2;
    final int p3d3;
    final int p3d4;

    //Diamond
    final int diamondGate;
    final int d1d2;
    final int d1d3;
    final int d1d4;
    final int d2;
    final int d2d2;
    final int d2d3;
    final int d2d4;
    final int d3;
    final int d3d2;
    final int d3d3;
    final int d3d4;

    //Champ
    final int champGate;
    final int c1d2;
    final int c1d3;
    final int c1d4;
    final int c2;
    final int c2d2;
    final int c2d3;
    final int c2d4;
    final int c3;
    final int c3d2;
    final int c3d3;
    final int c3d4;

    //GC
    final int gCGate;
    final int gc1d2;
    final int gc1d3;
    final int gc1d4;
    final int gc2;
    final int gc2d2;
    final int gc2d3;
    final int gc2d4;
    final int gc3;
    final int gc3d2;
    final int gc3d3;
    final int gc3d4;

    //SSL
    final int sSLGate;

    Gamemode(int bronzeGate, int b1d2, int b1d3, int b1d4, int b2, int b2d2, int b2d3, int b2d4, int b3, int b3d2, int b3d3, int b3d4, int silverGate, int s1d2, int s1d3, int s1d4, int s2, int s2d2, int s2d3, int s2d4, int s3, int s3d2, int s3d3, int s3d4, int goldGate, int g1d2, int g1d3, int g1d4, int g2, int g2d2, int g2d3, int g2d4, int g3, int g3d2, int g3d3, int g3d4, int platGate, int p1d2, int p1d3, int p1d4, int p2, int p2d2, int p2d3, int p2d4, int p3, int p3d2, int p3d3, int p3d4, int diamondGate, int d1d2, int d1d3, int d1d4, int d2, int d2d2, int d2d3, int d2d4, int d3, int d3d2, int d3d3, int d3d4, int champGate, int c1d2, int c1d3, int c1d4, int c2, int c2d2, int c2d3, int c2d4, int c3, int c3d2, int c3d3, int c3d4, int gCGate, int gc1d2, int gc1d3, int gc1d4, int gc2, int gc2d2, int gc2d3, int gc2d4, int gc3, int gc3d2, int gc3d3, int gc3d4, int sSLGate) {
        this.bronzeGate = bronzeGate;
        this.b1d2 = b1d2;
        this.b1d3 = b1d3;
        this.b1d4 = b1d4;
        this.b2 = b2;
        this.b2d2 = b2d2;
        this.b2d3 = b2d3;
        this.b2d4 = b2d4;
        this.b3 = b3;
        this.b3d2 = b3d2;
        this.b3d3 = b3d3;
        this.b3d4 = b3d4;
        this.silverGate = silverGate;
        this.s1d2 = s1d2;
        this.s1d3 = s1d3;
        this.s1d4 = s1d4;
        this.s2 = s2;
        this.s2d2 = s2d2;
        this.s2d3 = s2d3;
        this.s2d4 = s2d4;
        this.s3 = s3;
        this.s3d2 = s3d2;
        this.s3d3 = s3d3;
        this.s3d4 = s3d4;
        this.goldGate = goldGate;
        this.g1d2 = g1d2;
        this.g1d3 = g1d3;
        this.g1d4 = g1d4;
        this.g2 = g2;
        this.g2d2 = g2d2;
        this.g2d3 = g2d3;
        this.g2d4 = g2d4;
        this.g3 = g3;
        this.g3d2 = g3d2;
        this.g3d3 = g3d3;
        this.g3d4 = g3d4;
        this.platGate = platGate;
        this.p1d2 = p1d2;
        this.p1d3 = p1d3;
        this.p1d4 = p1d4;
        this.p2 = p2;
        this.p2d2 = p2d2;
        this.p2d3 = p2d3;
        this.p2d4 = p2d4;
        this.p3 = p3;
        this.p3d2 = p3d2;
        this.p3d3 = p3d3;
        this.p3d4 = p3d4;
        this.diamondGate = diamondGate;
        this.d1d2 = d1d2;
        this.d1d3 = d1d3;
        this.d1d4 = d1d4;
        this.d2 = d2;
        this.d2d2 = d2d2;
        this.d2d3 = d2d3;
        this.d2d4 = d2d4;
        this.d3 = d3;
        this.d3d2 = d3d2;
        this.d3d3 = d3d3;
        this.d3d4 = d3d4;
        this.champGate = champGate;
        this.c1d2 = c1d2;
        this.c1d3 = c1d3;
        this.c1d4 = c1d4;
        this.c2 = c2;
        this.c2d2 = c2d2;
        this.c2d3 = c2d3;
        this.c2d4 = c2d4;
        this.c3 = c3;
        this.c3d2 = c3d2;
        this.c3d3 = c3d3;
        this.c3d4 = c3d4;
        this.gCGate = gCGate;
        this.gc1d2 = gc1d2;
        this.gc1d3 = gc1d3;
        this.gc1d4 = gc1d4;
        this.gc2 = gc2;
        this.gc2d2 = gc2d2;
        this.gc2d3 = gc2d3;
        this.gc2d4 = gc2d4;
        this.gc3 = gc3;
        this.gc3d2 = gc3d2;
        this.gc3d3 = gc3d3;
        this.gc3d4 = gc3d4;
        this.sSLGate = sSLGate;
    }


    /** DEPRECATED DO NOT USE
     Gamemode(int bg, int sg, int gg, int pg, int dg, int cg, int gcg, int sslg) {
     this.bronzeGate = bg;
     this.silverGate = sg;
     this.goldGate = gg;
     this.platGate = pg;
     this.diamondGate = dg;
     this.champGate = cg;
     this.gCGate = gcg;
     this.sSLGate = sslg;
     }
     **/


}
