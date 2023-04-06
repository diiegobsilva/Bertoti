/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author diego
 */
public class Inscrito implements Component<Video>{
    
    private final String name;
    
    public Inscrito(String name) {
        this.name = name;
    }
    
    public void update(Video state) {
        System.out.println(name + " Notificação Recebida: " + state.getTitle() + "  //  " + state.getDescription());
    }
}

