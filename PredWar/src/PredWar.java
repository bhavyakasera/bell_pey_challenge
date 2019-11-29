class PredWar {
    public static String myPlayer(int x, int y, int z, int r, float b) {
//      cooperate the first few rounds so that my cooperate percentage is high
        if (r <= 100) {
            return "cooperate";
        }
        else {
//          if the reward from betraying is potentially very high, betray those who do not have a high cooperate percentage and
//            those who have an extremely high cooperate percentage, ensuring no 0s and wherever possible, z scores.
            if (z-y > 4) {
                if (b < 0.7 || b > 0.98) {
                    return "betray";
                }
                else {
                    return "cooperate";
                }
            }
            else {
//                if the reward from betraying someone who cooperates is not too high, cooperate with anyone who has between
//                50% and 98% chance of cooperating and betray others, trying for less 0s and mostly y and z scores.
                if (b < 0.5 || b > 0.98) {
                    return "betray";
                }
                else {
                    return "cooperate";
                }
            }
        }
    }
}