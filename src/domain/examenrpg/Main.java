package domain.examenrpg;

import domain.exceptions.ArchivoPersonajeException;
import domain.model.*;
import domain.repository.JsonPersonajeRepository;
import domain.repository.PersonajeRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero(
                "Arthur",
                110,
                110,
                100,
                50,
                1);

        Mago mago = new Mago(
                "Merlin",
                90,
                90,
                80,
                30,
                1);
        Arquero arquero = new Arquero(
                "Legolas",
                80,
                80,
                60,
                20,
                1);
        Curandero curandero = new Curandero(
                "Elena",
                100,
                100,
                20,
                35,
                1);
        ArrayList<Personaje> listapersoaje = new ArrayList<Personaje>();
        /*listapersoaje.add(guerrero);
        listapersoaje.add(mago);
        listapersoaje.add(arquero);
        listapersoaje.add(curandero);
        g.mostrarInf();
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
        m.mostrarInf();
        Batalla batalla = new Batalla(arquero,mago);
        batalla.iniciarBatalla();*/
        final PersonajeRepository repositoryJson = new JsonPersonajeRepository("src/domain/resourses/personajes.json");
        List<Personaje> personajes = new ArrayList<>();
        try{
            personajes = repositoryJson.getListaPersonajes();
        }catch (ArchivoPersonajeException e){
            e.printStackTrace();
        }
        for (final Personaje personaje:personajes){
            personaje.mostrarInf();
        }
    }
}
