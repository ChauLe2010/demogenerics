package animalgeneric;

public class DictionaryAnimalGeneric<K,V extends Animal> {
    private K key;
    private V value;

    public DictionaryAnimalGeneric() {
    }

    public DictionaryAnimalGeneric(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public void display(){
        System.out.println(key + " : " + value);
    }
}
