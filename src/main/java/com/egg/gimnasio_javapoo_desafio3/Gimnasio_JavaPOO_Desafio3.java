package com.egg.gimnasio_javapoo_desafio3;

import Entidad.*;
import Servicio.*;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author zero
 */
public class Gimnasio_JavaPOO_Desafio3 {

    public static void main(String[] args) {
        ServicioCliente serCli = new ServicioCliente();
        ServicioRutina serRut = new ServicioRutina();
        ArrayList<Cliente> miembros = new ArrayList<Cliente>();
        ArrayList<Rutina> rutinas = new ArrayList<Rutina>();
        
        Cliente c1 = new Cliente(88,"juan",22,1.6,69,"ponerse boludo");
        Cliente c2 = new Cliente(11, "maria", 24, 1.5, 50,"ponerse la ropa que ya no le queda");
        Rutina r1 = new Rutina(66, "patitos", 5, 4, "agacharse y caminar tomando los tobillos");
        Rutina r2 = new Rutina(22,"peso muerto", 3, 3,"mata alguien y cargalo");
        rutinas.add(r2);
        rutinas.add(r1);
        miembros.add(c2);
        miembros.add(c1);
//        serCli.registrarCliente(miembros);
//        serCli.registrarCliente(miembros);
//        serCli.registrarCliente(miembros);
//        serCli.registrarCliente(miembros);
//        serCli.registrarCliente(miembros);
    
//        serRut.crearRutina(rutinas);
//        serRut.crearRutina(rutinas);
        

        serCli.obtenerClientes(miembros);
        serRut.obtenerRutinas(rutinas);
        serCli.actualizarCliente(miembros,88);
        serCli.obtenerClientes(miembros);
        serRut.actualizarRutina(rutinas, 66);
        serRut.obtenerRutinas(rutinas);
        serCli.eliminarCliente(miembros, 11);
        serCli.obtenerClientes(miembros);
        serRut.eliminarRutina(rutinas, 22);
        serRut.obtenerRutinas(rutinas);
        
    }
}
