package Ejercicios;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;

    Persona(){}
    //Constructores

    public Persona(String nombre,String apellido,int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    //Metodos y comportamientos

    public void imprimirDatos(){
        System.out.println("Nombre de la persona:"+nombre);
        System.out.println("Apellido de la persona:"+apellido);
        System.out.println("Edad de lapersona:"+edad);
        //todos somos geniuales
    }
}
