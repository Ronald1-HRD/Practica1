package Ejercicios;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    Persona(){}

    public Persona(String nombre,String apellido,int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public void imprimirDatos(){
        System.out.println("Nombre de la persona:"+nombre);
        System.out.println("Apellido de la persona:"+apellido);
        System.out.println("Edad de lapersona:"+edad);
    }
}
