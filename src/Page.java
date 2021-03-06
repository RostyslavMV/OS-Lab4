import java.util.Arrays;

public class Page {
    public int id;
    public int physical;
    // public byte R;
    private boolean[] R = new boolean[8];
    public byte M;
    public int inMemTime;
    public int lastTouchTime;
    public long high;
    public long low;

    public Page(int id, int physical, byte R, byte M, int inMemTime, int lastTouchTime, long high, long low) {
        this.id = id;
        this.physical = physical;
        //this.R = R;
        Arrays.fill(this.R, false);
        this.M = M;
        this.inMemTime = inMemTime;
        this.lastTouchTime = lastTouchTime;
        this.high = high;
        this.low = low;
    }

    public void addR(boolean value) {
        if (R.length - 1 >= 0) System.arraycopy(R, 0, R, 1, R.length - 1);
        R[0] = value;
    }

    public String getStringR() {
        StringBuilder result = new StringBuilder();
        for (boolean b : R) {
            result.append(b ? "1" : "0");
        }
        return result.toString();
    }

    public boolean[] getR() {
        return R;
    }

    public boolean isRSmallerThan(boolean[] otherR) {
        for (int i = 0; i < R.length; i++) {
            if (!R[i] && otherR[i]) {
                return true;
            }
            else if (R[i] && !otherR[i]) {
                return false;
            }
        }

        return false;
    }

    public boolean isRZero() {
        for (boolean b : R) {
            if (b) {
                return false;
            }
        }
        return true;
    }
}
