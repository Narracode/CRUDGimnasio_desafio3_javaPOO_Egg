package Servicio;

import Entidad.Cliente;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author zero
 */
public class ServicioCliente {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void registrarCliente(List<Cliente> clientes) {
        Cliente c = new Cliente();
        
        System.out.print("**Asistente de Registro de cliente**\nIngrese el ID del cliente > ");
        c.setId(leer.nextInt());
        System.out.print("Nombre Completo > ");
        c.setNombre(leer.next());
        System.out.print("Edad > ");
        c.setEdad(leer.nextInt());
        System.out.print("Altura en metros > ");
        c.setAltura(leer.nextDouble());
        System.out.print("Peso en kilogramos > ");
        c.setPeso(leer.nextDouble());
        System.out.print("Ingrese un texto con el objetivo buscado > ");
        c.setObjetivo(leer.next());
        
        clientes.add(c);
    }
    
    public void obtenerClientes(ArrayList<Cliente> clientes) {
        System.out.println("**Miembros inscritos en el gimnasio**");
        for (Cliente cliente : clientes) {
            System.out.println(cliente + "\n*******\n");
        }
    }
    
    public void actualizarCliente(List<Cliente> clientes, int id) {
        Cliente c = clientes.get(indiceID(clientes,id));
        char r = '\u0000';
        String msj = "Cambiar [N]ombre\nCambiar [E]dad\nCambiar [A]ltura\nCambiar [P]eso\nCambiar [O]bjetivo\n[S]alir";
        if (c.getId() == id ) {
            System.out.println("Actualizar cliente" + c + "\n¿Que dato necesita actualizar?");
            do {
                System.out.println(msj);
                r = leer.next().toUpperCase().charAt(0);
                switch (r) {
                    case 'N': System.out.print("Corrija el nombre > ");c.setNombre(leer.next()); break;
                    case 'E': System.out.print("Acutaliza la edad > ");c.setEdad(leer.nextInt()); break;
                    case 'A': System.out.print("Corrija la altura > ");c.setAltura(leer.nextDouble()); break;
                    case 'P': System.out.print("Peso actual > ");c.setPeso(leer.nextDouble());break;
                    case 'O': System.out.print("Ingrese nuevo objetivo > "); c.setObjetivo(leer.next());break;
                    case 'S': System.out.println("Saliendo:");break;
                    default : System.out.println("Opcion Invalida");
                }
            } while (r != 'S');
        } else {
            System.out.println("Ciente no encontrado");
        }
    }
    
    public void eliminarCliente(List<Cliente> clientes, int id) {
        Cliente c = clientes.get(indiceID(clientes,id));
        
        clientes.remove(c);
    }
    
    public int indiceID(List<Cliente> clientes, int id) {
        int indice = 0;
        for (int c = 0; c < clientes.size(); c++) {
            if (clientes.get(c).getId() == id) {
                indice = c;
            }
        }
        return indice;
    }
}
