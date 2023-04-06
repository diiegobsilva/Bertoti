package observer;
/**
 *
 * @author diego
 */
interface Observer<T> {
    void update(T state);
}

interface Observable<T> {
    void registrarInscrito(Observer<T> observer);
    void removerInscrito(Observer<T> observer);
    void notificarInscritos();
    T getState();
}
