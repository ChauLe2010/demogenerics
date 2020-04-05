package methodgeneric;

public class ArrayManager {
    public <T> void diplayArray(T[] elements){
        System.out.println();
        for(T e:elements)
            System.out.print(e + " ");
    }
    public <K,V> void displayMap(K key, V value){
        System.out.println(key + " : " + value);
    }
    public <T extends Comparable<T>> T findMax(T[] elements){
        T max=elements[0];
//        for(int i=1;i<elements.length;i++)
//            if(max<elements[i])
//                max=elements[i];
        for(int i=1;i<elements.length;i++){
            if(max.compareTo(elements[i])<0){
                max=elements[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Integer[] integers={1,2,3,4,5,6,4,5};
        String[] strings={"Linh","Huy","Son"};
        ArrayManager mn=new ArrayManager();
//        mn.diplayArray(integers);
//        mn.diplayArray(strings);
//        mn.displayMap(1,"So mot");
//        mn.displayMap("so mot","number one");
        System.out.println(mn.findMax(integers));
        System.out.println(mn.findMax(strings));
    }
}
