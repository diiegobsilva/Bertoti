package singleton;
/**
 *
 * @author diego
 */
public interface Component<T> {
    void update(T state);
}

interface Components<T> {
    void registrarInscrito(Component<T> observer);
    void removerInscrito(Component<T> observer);
    void notificarInscritos();
    T getState();
}