package classgeneric;

public class DictionaryEngVie2<K,V,T> extends DictionaryGeneric<String,V> {
    private T obj;
    public DictionaryEngVie2(String keyword, V mean) {
        super(keyword, mean);
    }
    public DictionaryEngVie2(String keyword, V mean, T object) {
        super(keyword, mean);
        this.obj=object;
    }

}
