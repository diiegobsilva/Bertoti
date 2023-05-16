
package com.mycompany.combing;

public interface Observavel {
    void adicionarObservador(Observador observador);

    void removerObservador(Observador observador);

    void notificarObservadores();
}
