/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extremadura;

import java.util.ArrayList;



/**
 *
 * @author usuario
 */
public class Extremadura {

    public static ArrayList<Provincia> provincias = new ArrayList<Provincia>();

    public static void rellenarDatos() {

        /*provincias[0] = new Provincia();
        provincias[1] = new Provincia();

        Localidad[] localidades;

        provincias[0].setNombre(" caceres ");
        provincias[0].setExtension(1000);
        provincias[1].setNombre(" badajoz  ");
        provincias[1].setExtension(2000);*/
        Provincia p = new Provincia();

        p.setNombre(" badajoz ");
        p.setExtension(234000);
        provincias.add(p);

        p = new Provincia();
        p.setNombre(" caceres ");
        p.setExtension(124000);
        provincias.add(p);

        Localidad loc;

        ArrayList<Localidad> aux = new ArrayList<Localidad>();
        ArrayList<Localidad> aux1 = new ArrayList<Localidad>();
        for (int i = 0; i < 300; i++) {
            loc = new Localidad();
            loc.setNombre("cachorrilla" + i);
            //provincias.get(0).addLocalidad(loc);
            aux.add(loc);

            loc = new Localidad();
            loc.setNombre("bellota" + i);
             provincias.get(1).addLocalidad(loc);
            aux1.add(loc);

        }
        provincias.get(0).setLocalidades(aux);
        provincias.get(0).setLocalidades(aux1);

        // provincias.get(1).setLocalidades(aux2);
        /*for (int i = 0; i < Extremadura.provincias.length; i++) {//rellenar provincias

            localidades = provincias[i].getLocalidades();

            for (int l = 0; l < 50; l++) {
                localidades[l] = new Localidad();
                localidades[l].setNombre("localidades  " + l);
                localidades[l].setHabitantes(l * 1000);
                localidades[l].setExtension(l * 1000000);

            }

        }*/
    }

    public static void ejercicio01()//mostrar nombre provincias
    {
        /* System.out.println(provincias[0].getNombre());
        System.out.println(provincias[1].getNombre());
        //----------------o--------------------

        for (int i = 0; i < provincias.length; i++) {
        }*/

    }

    public static void ejercicio02()//mostrar localidad(provincia)
    {
        /* Localidad localidades[];
        for (int i = 0; i < provincias.length; i++) {

            localidades = provincias[0].getLocalidades();
            for (int l = 0; l < localidades.length; l++) {

                System.out.println(localidades[l].getNombre());
                System.out.println(provincias[i].getNombre());
            }
        }*/
    }

    public static void ejercicio03()//numero habitantes por provincia
    {
        /*int total = 0;
        Localidad localidades[];

        for (int i = 0; i < provincias.length; i++) {
            for (int l = 0; l < provincias[i].getLocalidades().length; l++) {

                total = total + provincias[1].getLocalidades()[l].getHabitantes();

            }
            System.out.println(provincias[i].getNombre());

            localidades = provincias[0].getLocalidades();

            for (int l = 0; l < localidades.length; l++) {
                System.out.println(localidades[l].getHabitantes());
            }
        }
        System.out.println("total de habitantes:" + total);*/

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        rellenarDatos();

        ejercicio01();
        //ejercicio02();
        //ejercicio03();

    }

}
