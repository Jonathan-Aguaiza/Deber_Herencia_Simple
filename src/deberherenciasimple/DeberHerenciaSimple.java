/*
Realizar un algoritmo que me indique la posicion del motor, tipo de alimentació y
sus caracteristicas.
 */
package deberherenciasimple;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.Scanner;
class Motor{
    String combustible;
    String tamanio;
    String tipo_pistones;
    int velocidad;
    int tiempo_encendido;
    
    void Mostrar_Caracteristicas(){
        System.out.println("El motor es "+tamanio+" de pistones tipo "+tipo_pistones
                +". El tipo de combustible que ocupa es "+combustible+" con un tiempo de encendido"
                        + "de "+tiempo_encendido+" segundos, con una velocidad máxima "
                                + "de "+velocidad+" km/h.");
    }
}
class Motor_Combustion_Interna extends Motor{
    String tipo_alimentacion;
    String posicion;
    
    void Mostrar_Tipo_Alimentacion(){
        System.out.println("El tipo de Alimentación es: "+tipo_alimentacion);
    }
    void Indicar_Posicion(){
        System.out.println("El motor es : "+posicion);
    }
}
public class DeberHerenciaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner com=new Scanner(System.in);
        Scanner num=new Scanner(System.in);
        
        Motor_Combustion_Interna m1 = new Motor_Combustion_Interna();
        Motor_Combustion_Interna m2 = new Motor_Combustion_Interna();
        
        
        System.out.println("      UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
        System.out.println("");
        System.out.println("Nombre: Aguaiza Quimbita Jonathan Fabricio");
        System.out.println("MATERIA: PROGRAMACION");
        System.out.println("CARRERA: INGENIERIA AUTOMOTRIZ");
        System.out.println("NRC: 7450");
        System.out.println(" ");
        
        System.out.println("Primer Motor ");
        System.out.println();
        
        System.out.println("Indique el tipo de combustible del primero Motor:");
        String r1=com.nextLine();
        
        System.out.println("Indique el tamaño del primer motor:");
        String r2=com.nextLine();
        
        System.out.println("Especificar el tipo de piston del primero Motor:");
        String r3=com.nextLine();
        
        System.out.println("Ingrese la velocidad máxima del primero Motor:");
        int r4=num.nextInt();
        
        System.out.println("Ingrese el tiempo de encendido del primero Motor:");
        int r5=num.nextInt();
        
        System.out.println("Determine el tipo de alimentacion del primero Motor:");
        String r6=com.nextLine();
        
        System.out.println("Indique la posicion del primer motor:");
        String r7=com.nextLine();
        System.out.println();
        
        System.out.println("Segundo Motor ");
        System.out.println();
        
        System.out.println("Indique el tipo de combustible del segundo motor:");
        String r8=com.nextLine();
        
        System.out.println("Indique el tamaño del segundo motor:");
        String r9=com.nextLine();
        
        System.out.println("Especificar el tipo de piston del segundo Motor:");
        String r10=com.nextLine();
        
        System.out.println("Ingrese la velocidad máxima del segundo Motor:");
        int r11=num.nextInt();
        
        System.out.println("Ingrese el tiempo de encendido del segundo Motor:");
        int r12=num.nextInt();
        
        System.out.println("Determine el tipo de alimentacion del segundo Motor:");
        String r13=com.nextLine();
        
        System.out.println("Indique la posicion del segundo motor:");
        String r14=com.nextLine();
        
        m1.combustible=r1;
        m1.tamanio=r2;
        m1.tipo_pistones=r3;
        m1.velocidad=r4;
        m1.tiempo_encendido=r5;
        m1.tipo_alimentacion=r6;
        m1.posicion=r7;
        
        m2.combustible=r8;
        m2.tamanio=r9;
        m2.tipo_pistones=r10;
        m2.velocidad=r11;
        m2.tiempo_encendido=r12;
        m2.tipo_alimentacion=r13;
        m2.posicion=r14;
        
        System.out.println();
        
        System.out.println("Información del primer motor:");
        m1.Indicar_Posicion();
        m1.Mostrar_Tipo_Alimentacion();
        m1.Mostrar_Caracteristicas();
        
        System.out.println();
        
        System.out.println("Información del segundo motor: ");
        m2.Indicar_Posicion();
        m2.Mostrar_Tipo_Alimentacion();
        m2.Mostrar_Caracteristicas();
        // TODO code application logic here
    }
    
}