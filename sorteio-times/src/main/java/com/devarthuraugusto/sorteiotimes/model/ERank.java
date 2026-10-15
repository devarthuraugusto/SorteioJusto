public enum ERank {
    A(1),
    B(2),
    C(3),
    D(4);
    private final int cir;
    String rank;
    ERank(int cir){
        this.cir = cir;
    }

    public int getCir() {
        return cir;
    }

    public String getRank() {
        return rank;
    }
}
