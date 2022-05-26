package Interfaces.New;

public interface CollectionInterface<E> extends Iterable {
    boolean add (E item);
    boolean addAll (CollectionInterface<? extends E> col);
}
