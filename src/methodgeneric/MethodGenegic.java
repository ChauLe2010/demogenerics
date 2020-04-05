package methodgeneric;

public class MethodGenegic {

    public <E> void displayArray(E[] elements){
        System.out.println();
        for(E e:elements){
            System.out.print(e+" ");
        }
    }
    public <K,V> void displayDic(K key, V value){
        System.out.println(key + " : "+value);
    }
    public <E extends Comparable<E>> E findMax(E[] elements){
        E max=elements[0];
        for(int i=1;i<elements.length;i++){
            if(max.compareTo(elements[i])<0){
                max=elements[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Integer[] integers = {1,4,2,5,3};
        String[] strings = {"Linh","Phi","Son"};
        MethodGenegic methodGenegic=new MethodGenegic();
        methodGenegic.displayArray(integers);
        methodGenegic.displayArray(strings);
        methodGenegic.displayDic("name","Ten");

    }
}
