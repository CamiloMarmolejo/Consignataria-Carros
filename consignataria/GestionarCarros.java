import java.util.ArrayList;
import java.util.Scanner;

public class GestionarCarros {
    Scanner lector =  new Scanner(System.in);
    ArrayList <Carro> misCarros = new ArrayList<>();

    public void agregarCarro()
    {
        System.out.print("Ingrese la placa del vehiculo: ");
        String placa = lector.nextLine();
        System.out.print("Ingrese la marca: ");
        String marca = lector.nextLine();
        System.out.print("Ingrese el color: ");
        String color = lector.nextLine(); 
        System.out.print("Ingese el modelo: ");
        int modelo = lector.nextInt();
        System.out.print("Ingrese el cilindraje: ");
        int cilindraje = lector.nextInt();
        System.out.print("Ingrese el precio: ");
        double precio = lector.nextDouble();
        lector.nextLine();
        
        Carro miCarro = new Carro(marca,color,placa,cilindraje,modelo,precio);
                
        misCarros.add(miCarro);
        System.out.println("------------------------");
        System.out.println("Carro agregado con exito");
        System.out.println("------------------------");
    }

        public void listarCarros()
        {
        if(misCarros.isEmpty()){
            System.out.println("No hay carros registrados");
        return;
        }
        else{
            System.out.println("Listado de carros: ");
                for(Carro c: misCarros)
                {
                    System.out.println("---------------------");
                    System.out.println("Placa:" + c.getPlaca());
                    System.out.println();
                    System.out.println("Marca:" + c.getMarca());
                    System.out.println();
                    System.out.println("Color:" + c.getColor());
                    System.out.println();
                    System.out.println("Modelo:" + c.getModelo());
                    System.out.println();
                    System.out.println("Cilindraje: " + c.getCilindraje());
                    System.out.println();
                    System.out.println("Precio" + c.getPrecio());
                    System.out.println("---------------------");
                    
                }    
                }
        }
        public void ModificarCarroPorPlaca(){
   
    Scanner lector = new Scanner(System.in);
    int opcEditar;
    boolean activo=true;
     
    System.out.println("--Modificar Carro--");
    System.out.print("Ingrese la placa del carro a modificar: ");
    String BusquedaPlaca = lector.nextLine();

    Carro carroEncontrado = null;
    for (Carro c: misCarros){
        if (c.getPlaca().equalsIgnoreCase(BusquedaPlaca)) {
            carroEncontrado = c;
            break;
        }
    }
    if (carroEncontrado == null) {
        System.out.println("No se encontro ningun vehiculo");
        return;
    }
    do{
    if (carroEncontrado != null) {
    System.out.println("La placa del carro a modificar es: " + carroEncontrado.getPlaca());
    System.out.println("--Menu de modificación del carro--");
    System.out.println("1.Modificar marca");
    System.out.println("2.Modificar color");
    System.out.println("3.Modificar modelo");
    System.out.println("4.Modificar cilindraje");
    System.out.println("5.Modificar precio");
    System.out.println("6.No quiero modificar mas :D");
    System.out.println("Ingrese la opción: ");
    opcEditar = Integer.parseInt(lector.nextLine());
    
    switch(opcEditar){
        case 1:
        System.out.print("Ingrese la nueva marca: ");
            String nuevaMarca = lector.nextLine();
            carroEncontrado.setMarca(nuevaMarca);
        break;
        case 2:
            System.out.print("Ingrese el nuevo color: ");
            String nuevoColor = lector.nextLine();
            carroEncontrado.setColor(nuevoColor);
            break;
        case 3:
            System.out.print("Ingrese el nuevo modelo: ");
            int nuevoModelo = Integer.parseInt(lector.nextLine());
            carroEncontrado.setModelo(nuevoModelo);
            break;
        case 4:
            System.out.print("Ingrese el nuevo cilindraje:  ");
            int nuevoCilindraje = Integer.parseInt(lector.nextLine());
            carroEncontrado.setCilindraje(nuevoCilindraje);
            break;
        case 5:
            System.out.print("Ingrese el nuevo precio: ");
            double nuevoPrecio = Double.parseDouble(lector.nextLine());
            carroEncontrado.setPrecio(nuevoPrecio);
            break;
        case 6:
            activo = false;
            System.out.println("Usted ha salido del menu de modificacion");
            break;
        default:
            System.out.println("Opcion no valida");
    }  
        }  
    else {
        System.out.println("No se encontro ningun vehiculo con la placa ingresada");
        }
    
    }
    while(activo); 
    }
        public void EliminarCarros() {
    Scanner lector = new Scanner(System.in);

    if (misCarros.isEmpty()) {
        System.out.println("No hay carros registrados.");
        return;
    }

    System.out.print("Ingrese la placa del vehiculo que desea eliminar: ");
    String placaBuscada = lector.nextLine();
    boolean carroEncontrado = false;

    for (int i = 0; i < misCarros.size(); i++) {
        if (misCarros.get(i).getPlaca().equalsIgnoreCase(placaBuscada)) {
            misCarros.remove(i);
            carroEncontrado = true;
            System.out.println("El carro ha sido eliminado");
            break;
        }
    }

    if (!carroEncontrado) {
        System.out.println("La placa no esta registrada.");
    }
    }
        
        public void Reporte() {
        double total = 0;
        for (Carro c : misCarros) {
        total += c.getPrecio();
    }
    double promedio = total / misCarros.size();
    System.out.println("Suma total del precio de los carros: " + total);
    System.out.println("-------------------------------------");
    System.out.println("Precio promedio de los carros: " + promedio);
    System.out.println("-------------------------------------");
    System.out.println("Numero total de carros: " + misCarros.size());
    System.out.println("-------------------------------------");
}
       
}

    

