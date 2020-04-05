package interfacegeneric;

public interface IDAO<T>{
    void insert(T obj);
    void update(T obj);
    void delete(T obj);
}
