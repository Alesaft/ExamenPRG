package domain.model;

import domain.enums.TipoPersonaje;
import domain.util.interfaces.Curable;
import domain.util.interfaces.HabilidadEspecial;

public class Curandero extends Personaje implements Curable, HabilidadEspecial {
    public Curandero(String nombre, int vidaMax, int vidaAct, int ataque, int defensa, int id){
        super(TipoPersonaje.CURANDERO,nombre,vidaMax,vidaAct,ataque,defensa,id);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println("Ataca usando magia debil");
        enemigo.recibirDaño(this.getAtaque());
    }

    @Override
    public void curar(Personaje acurar) {
        System.out.println("Cura usando magia curativa");
        acurar.curar(this.getAtaque());
    }

    @Override
    public void usarHabilidadEspecial(Personaje enemigo) {
        System.out.println(getNombre()+" usa su habilidad especial");
        enemigo.revivir(getAtaque());
    }
}
