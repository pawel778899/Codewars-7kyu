public class WrapPresent {
    public static int wrap(int h, int w, int l) {
        return (h + w + l + Math.min(Math.min(w, h), l)) * 2 + 20;
    }
}
