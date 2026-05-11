package domain.model;

import domain.util.interfaces.HabilidadEspecial;

public class Arquero extends Personaje implements HabilidadEspecial {
    public Arquero(String nombre, int vidaMax, int vidaAct, int ataque, int defensa){
        super(nombre,vidaMax,vidaAct,ataque,defensa);
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
