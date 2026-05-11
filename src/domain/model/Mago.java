package domain.model;

import domain.util.interfaces.HabilidadEspecial;

public class Mago extends Personaje implements HabilidadEspecial {
    public Mago(String nombre, int vidaMax, int vidaAct, int ataque, int defensa){
        super(nombre,vidaMax,vidaAct,ataque,defensa);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(getNombre()+"Lanza bola de fuego");
        enemigo.recibirDaño(this.getAtaque());
    }

    @Override
    public void usarHabilidadEspecial(Personaje enemigo) {
        System.out.println(getNombre()+" usa su habilidad especial Mega bola de fuego");
        enemigo.recibirDaño(getAtaque()+(40*100)/100);
    }
}
