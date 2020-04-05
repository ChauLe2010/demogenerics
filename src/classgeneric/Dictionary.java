package classgeneric;

public class Dictionary {
    private String  keyWord;
    private String mean;

    public Dictionary() {
    }

    public Dictionary(String keyWord, String mean) {
        this.keyWord = keyWord;
        this.mean = mean;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }
}
