public class BonusMilesService {
    public int calculate (int cost) {
        int freeMiles;
        if (cost > 0) {
            freeMiles = cost / 20;
        } else {
            freeMiles = 0;
        }
        return freeMiles;
    }
}
