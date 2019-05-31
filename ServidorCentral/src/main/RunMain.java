package main;

import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Cliente;
import negocio.GestorBaseDatos;
import negocio.Plan;
import servicio.RegistraduriaServicios;

/**
 * 28 de Mayo / 2019
 * @author Alexander Inagan
 */

public class RunMain {
    
   
    public static void main(String args[]) throws ClassNotFoundException, SQLException { 
        

        RegistraduriaServicios regSer = new RegistraduriaServicios();
        regSer.iniciar();
    
//        GestorBaseDatos myGestor = new GestorBaseDatos();
//        RegistraduriaServicios mysServicios = new RegistraduriaServicios();
//        
//        ArrayList<Cliente> misClientes = myGestor.obtenerClientes();
//  
//        for(int i=0; i < misClientes.size(); i++)
//        {
//            Cliente myCli = misClientes.get(i);
//            System.out.println("ID: " + myCli.getId());
//            System.out.println("Nombres: " + myCli.getNombres());
//            System.out.println("Apellidos: " + myCli.getApellidos());
//            System.out.println("Fecha Nacimiento: " + myCli.getFechaNacimiento());
//            System.out.println("Sexo: " + myCli.getSexo());
//            System.out.println("E-mail: " + myCli.getEmail());
//            System.out.println("\n------------------------\n");               
//        }
//        
//        ArrayList<Plan> misPlanes = myGestor.obtenerPlanes();
//        
//        for(int i=0; i < misPlanes.size(); i++)
//        {
//            Plan myPlan = misPlanes.get(i);
//            System.out.println("ID: " + myPlan.getIdPlan());
//            System.out.println("Nombre Plan: " + myPlan.getNombrePlan());
//            System.out.println("Descripcion: " + myPlan.getDescripcion());
//            System.out.println("Rango Edad 1: " + myPlan.getRangoEdad1());
//            System.out.println("Rango Edad 2: " + myPlan.getRangoEdad2());
//            System.out.println("Genero: " + myPlan.getGenero());
//            System.out.println("\n------------------------\n");               
//        }
        
//        
//        System.err.println(mysServicios.serializarClientes(misClientes));
//        System.err.println(mysServicios.serializarPlanes(misPlanes));
    }
}
