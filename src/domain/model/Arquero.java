package domain.model;

import domain.enums.TipoPersonaje;
import domain.util.interfaces.HabilidadEspecial;

public class Arquero extends Personaje implements HabilidadEspecial {
    public Arquero(String nombre, int vidaMax, int vidaAct, int ataque, int defensa, int id){
        super(TipoPersonaje.ARQUERO,nombre,vidaMax,vidaAct,ataque,defensa,id);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println("Ataca con flechas");
        enemigo.recibirDaño(this.getAtaque());
    }

    @Override
    public void usarHabilidadEspecial(Personaje enemigo) {
        System.out.println(getNombre()+" usa su habilidad especial Flecha gigante");
        enemigo.recibirDaño(getAtaque()+(20*100)/100);
    }
}
