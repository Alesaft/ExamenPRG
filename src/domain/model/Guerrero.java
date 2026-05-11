package domain.model;

import domain.util.interfaces.Curable;
import domain.util.interfaces.HabilidadEspecial;

public class Guerrero extends Personaje implements HabilidadEspecial {
    public Guerrero(String nombre, int vidaMax, int vidaAct, int ataque, int defensa){
        super(nombre,vidaMax,vidaAct,ataque,defensa);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(getNombre()+" ataca usando espada");
        enemigo.recibirDaño(this.getAtaque());
    }

    @Override
    public void usarHabilidadEspecial(Personaje enemigo) {
        System.out.println(getNombre()+" usa su habilidad especial Golpe critico");
        enemigo.recibirDaño(this.getAtaque()+(30*100)/100);
    }
}
