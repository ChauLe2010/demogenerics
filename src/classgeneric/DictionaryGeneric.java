package classgeneric;

public class DictionaryGeneric<K,V> {
    private K keyword;
    private V mean;

    public DictionaryGeneric() {
    }

    public DictionaryGeneric(K keyword, V mean) {
        this.keyword = keyword;
        this.mean = mean;
    }

    public K getKeyword() {
        return keyword;
    }

    public void setKeyword(K keyword) {
        this.keyword = keyword;
    }

    public V getMean() {
        return mean;
    }

    public void setMean(V mean) {
        this.mean = mean;
    }
}
