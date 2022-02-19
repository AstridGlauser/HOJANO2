
//Astrid Marie Glauser Oliva 21299
//Segunda hoja de trabajo
//Seccion 20
public interface IStack<T> {

    void push(T value);

    T pull();

    T peek();

    int count();

    boolean isEmpty();
}