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
        for (int i = R.length - 1; i > 0; i--) {
            R[i] = R[i - 1];
        }
        R[0] = value;
    }

    public String getStringR() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < R.length; i++) {
            result.append(R[i] ? "1" : "0");
        }
        return result.toString();
    }

    public boolean[] getR() {
        return R;
    }
}
