/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Canal implements Components<Video> {
    
    private final String name;
    private final List<Component<Video>> observers;
    private Video currentVideo;
    
    // Instância única da classe
    private static Canal instance;
    
    // Construtor privado
    private Canal(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }
    
    // Método estático que retorna a instância única da classe
    public static Canal getInstance(String name) {
        if (instance == null) {
            instance = new Canal(name);
        }
        return instance;
    }
    
    @Override
    public void registrarInscrito(Component<Video> observer) {
        observers.add(observer);
    }
    
    @Override
    public void removerInscrito(Component<Video> observer) {
        observers.remove(observer);
    }
    
    @Override
    public void notificarInscritos() {
        for (Component<Video> observer : observers) {
            observer.update(getState());
        }
    }
    
    @Override
    public Video getState() {
        return currentVideo;
    }
    
    public void postVideo(String title, String description) {
        currentVideo = new Video(title, description);
        notificarInscritos();
    }
    
    public String getName() {
        return name;
    }


    
}