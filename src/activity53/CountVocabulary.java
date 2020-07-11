package activity53;

public class CountVocabulary {
    private int countVA;
    private int countAV;

    public CountVocabulary(int countVA, int countAV) {
        this.countVA = countVA;
        this.countAV = countAV;
    }

    public CountVocabulary() {
    }

    public int getCountVA() {
        return countVA;
    }

    public void setCountVA(int countVA) {
        this.countVA = countVA;
    }

    public int getCountAV() {
        return countAV;
    }

    public void setCountAV(int countAV) {
        this.countAV = countAV;
    }
}
