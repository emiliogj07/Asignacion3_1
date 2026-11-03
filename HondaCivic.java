/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignacion3_1;

/**
 *
 * @author Emilio
 */
class HondaCivic extends AutoMovil {

    public HondaCivic() {
        super(); // Llama al constructor del padre
        System.out.println("Constructor de HondaCivic");
    }

    @Override
    public void encender() {
        System.out.println("El Honda Civic está encendiendo con arranque deportivo...");
    }

    @Override
    public void acelerar() {
        System.out.println("El Honda Civic acelera rápidamente...");
    }
}