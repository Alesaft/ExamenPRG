package domain.repository;

import domain.enums.TipoPersonaje;
import domain.model.*;

public class PersonajeFactory {
    public static Personaje crearDesdeData(final PersonajeData data){
        final TipoPersonaje tipo = TipoPersonaje.valueOf(data.getTipo());
        switch (tipo){
            case GUERRERO :
                return new Guerrero(data.getNombre(),data.getVidaMax(),data.getVidaAct(),data.getAtaque(),data.getDefensa(),data.getId());
            case MAGO :
                return new Mago(data.getNombre(),data.getVidaMax(),data.getVidaAct(),data.getAtaque(),data.getDefensa(),data.getId());
            case ARQUERO :
                return new Arquero(data.getNombre(),data.getVidaMax(),data.getVidaAct(),data.getAtaque(),data.getDefensa(),data.getId());
            case CURANDERO :
                return new Curandero(data.getNombre(),data.getVidaMax(),data.getVidaAct(),data.getAtaque(),data.getDefensa(),data.getId());
            default :
                return new Mago("Alam",1,2,3,4,5);
        }
    }
}
