package org.example;


// inicio ejercicio 8

// Crear un objeto persona en el main.
// Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(Integer.parseInt("15"));
        System.out.println(persona.getEdad());

        persona.setNombre("Camilo");
        System.out.println(persona.getNombre());

        persona.setTelefono(Integer.parseInt("98556878"));
        System.out.println(persona.getTelefono());
    }
}

// Crear clase Persona.
// Crear variables las privadas edad, nombre y telefono de la clase Persona.
// Crear gets y sets de cada propiedad.
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad (int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono (int telefono){
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }

} // fin ejercicio 8