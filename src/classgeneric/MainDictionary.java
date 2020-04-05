package classgeneric;

public class MainDictionary {
    public static void main(String[] args) {
        Dictionary dictionary=new Dictionary("1","So mot");
        DictionaryGeneric dictionaryGeneric=new DictionaryGeneric(1,"so mot");
        DictionaryGeneric dictionaryGeneric2=new DictionaryGeneric("one","so mot");
        DictionaryGeneric<String,String> dictionaryGeneric3=new DictionaryGeneric("one","so mot");
        //DictionaryGeneric<Integer,String> dictionaryGeneric4=new DictionaryGeneric<Integer,String>("one","so mot");
    }
}
