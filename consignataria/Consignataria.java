/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umariana.consignataria;

/**
 *
 * @author marmota
 */
import java.util.Scanner;
        
public class Consignataria {

    public static void main(String[] args) {
    //construir el menu
    GestionarCarros gestionar = new GestionarCarros();
    Scanner lector = new Scanner(System.in);
    boolean activo=true;
    int opc;
    
        do {
        System.out.println("---Menu de opciones---");
        System.out.println("1. Agregar Carro");
        System.out.println("2. Listar todos los carros");
        System.out.println("3. modificar carro por placa");
        System.out.println("4. Eliminar carro por placa");
        System.out.println("5. Generar reporte");
        System.out.println("6. Salir");
        System.out.println("-----------------------");
        System.out.print("Seleccione una opcion: ");
        opc = Integer.parseInt(lector.nextLine());
        //construir el conmutador
        
        switch(opc){
            case 1:
                gestionar.agregarCarro();
                break;
            case 2:
                gestionar.listarCarros();
                break;
   
            case 3:
                gestionar.ModificarCarroPorPlaca();
                break;
       
            case 4:
                gestionar.EliminarCarros();
                break;
      
            case 5:
                gestionar.Reporte();
                break;
        
            case 6:
                activo = false;
                System.out.println("Usted ha salido del sistema");
                break;
    
            default:
                System.out.println("Opcion no valida");
                break;
        }
        
    }while(activo);
    
    
    
    }
}

