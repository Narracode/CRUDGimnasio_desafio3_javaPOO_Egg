package Servicio;

import Entidad.Rutina;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author zero
 */
public class ServicioRutina {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearRutina(List<Rutina> rutinas) {
        Rutina r = new Rutina();
        System.out.print("*Asistente de creacion de Rutina*\nIngrese el ID de la nueva rutina > ");
        r.setId(leer.nextInt());
        System.out.print("Nombrela > ");
        r.setNombre(leer.next());
        System.out.print("Ingrese la duracion en minutos > ");
        r.setDuracion(leer.nextInt());
        System.out.print("Establezca un nivel de dificultad 1-5 > ");
        r.setNivelDificultad(leer.nextInt());
        System.out.print("Teclea la descripcion de como se ejecuta > ");
        r.setDescripcion(leer.next());
        
        rutinas.add(r);
    }
    
    public void obtenerRutinas(List<Rutina> rutinas) {
        System.out.println("**Rutinas Disponibles**");
        for (Rutina r : rutinas) {
            System.out.println(r + "\n******\n");
        }
    }
    
    public void actualizarRutina(List<Rutina> rutinas, int id) {
        Rutina r = rutinas.get(indiceID(rutinas,id));
        System.out.println("debug \n" + r);
        char o  = '\u0000';
        String msj = "Cambiar [N]ombre\nCambiar [D]uracion\nCambiar n[I]vel de dificultad\nCambiar d[E]scripcion\n[S]alir";
        if (r.getId() == id) {
            System.out.println("Cambiando datos de la rutina con id " + id);
            do {
                System.out.println(msj);
                o = leer.next().toUpperCase().charAt(0);
                switch (o) {
                    case 'N': System.out.print("Corrija el nombre > ");r.setNombre(leer.next());break;
                    case 'D': System.out.print("Nueva Duración > ");r.setDuracion(leer.nextInt());break;
                    case 'I': System.out.print("Nueva Dificultad > ");r.setNivelDificultad(leer.nextInt());break;
                    case 'E': System.out.println("Registra la duracion > ");r.setDescripcion(leer.next());break;
                    case 'S': System.out.println("**Saliendo**");break;
                    default: System.out.println("Oye, eso no es valido");
                }
            } while (o != 'S');
        }
    }
    
    public void eliminarRutina(List<Rutina> rutinas, int id) {
        Rutina r = rutinas.get(indiceID(rutinas,id));
        char o;
        String msj = "Seguro que desea eliminar la rutina con id " + id + "?";
        System.out.println(msj + "Teclea [S] para confirmar, [N] para abortar");
        o = leer.next().toUpperCase().charAt(0);
        if(o == 'S') {
        rutinas.remove(r);
        } else {
            System.out.println("Abortando accion.");
        }
    }
    
    public int indiceID(List<Rutina> rutinas, int id) {
        int indice = 0;
        for (int r = 0; r < rutinas.size(); r++) {
            if (rutinas.get(r).getId() == id) {
                indice = r;
            }
        }
        return indice;
    }
}
