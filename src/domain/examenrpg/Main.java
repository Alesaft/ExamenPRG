package domain.examenrpg;

import domain.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero(
                "Arthur",
                110,
                110,
                100,
                50);

        Mago mago = new Mago(
                "Merlin",
                90,
                90,
                80,
                30);
        Arquero arquero = new Arquero(
                "Legolas",
                80,
                80,
                60,
                20);
        Curandero curandero = new Curandero(
                "Elena",
                100,
                100,
                20,
                35);
        ArrayList<Personaje> listapersoaje = new ArrayList<Personaje>();
        listapersoaje.add(guerrero);
        listapersoaje.add(mago);
        listapersoaje.add(arquero);
        listapersoaje.add(curandero);
        /*g.mostrarInf();
        m.mostrarInf();
        g.atacar(m);
        m.verificarAlive();
        m.mostrarInf();
        g.atacar(m);
        m.verificarAlive();
        c.curar(m);
        m.mostrarInf();
        c.usarHabilidadEspecial(m);
        m.verificarAlive();
        m.mostrarInf();*/
        Batalla batalla = new Batalla(arquero,curandero);
        batalla.iniciarBatalla();
    }
}
