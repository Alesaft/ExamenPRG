package domain.model;

public abstract class Personaje {
    private final String nombre;
    private final int vidaMax;
    private int vidaAct;
    private final int ataque;
    private final int defensa;

    public Personaje(String nombre, int vidaMax, int vidaAct, int ataque, int defensa) {
        this.nombre = nombre;
        this.vidaMax = vidaMax;
        this.vidaAct = vidaAct;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public int getVidaAct() {
        return vidaAct;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void recibirDaño(int ataque) {
        double probabilidad=Math.random();
        int dano = 0;
        if (ataque > 0) {
            if (probabilidad<.20){
                System.out.println(getNombre()+"ha asestado un ataque critico");
                dano = (ataque - (ataque * defensa) / 100)+(30*100)/100;
            }else {
                dano = ataque - (ataque * defensa) / 100;
                vidaAct -= dano;
            }
            if (vidaAct < 0) {
                vidaAct = 0;
            }
        }
    }
    public void curar(int ataque) {
        int curacion = 0;
        if (ataque > 0 && vidaAct > 0) {
            curacion = ataque / 10;
            vidaAct += curacion;
            if (vidaAct>vidaMax){
                vidaAct=vidaMax;
            }
        } else if (vidaAct <= 0) {
            System.out.println("No puedes curar a alguien muerto");
        }
    }

    public void revivir(int ataque){
        int curacion = 0;
        if (ataque > 0 && vidaAct==0) {
            curacion = ataque + (ataque * vidaMax) / 100;
            vidaAct += curacion;
            if (vidaAct>vidaMax){
                vidaAct=vidaMax;
            }
        }else if (vidaAct>0){
            System.out.println("No puedes revivir a alguien ya vivo");
        }
    }
    public void mostrarInf() {
        System.out.println(nombre + " HP: " + vidaAct + " ATC: " + ataque + " DFS: " + defensa);
    }

    public void verificarAlive() {
        boolean vivo = false;
        if (vidaAct > 0) {
            vivo = true;
            System.out.println(getNombre() + " Sigue vivo");
        } else {
            System.out.println(getNombre() + " Murio");
        }
    }
    public void usarHabilidadEspecial(Personaje enemigo){
        System.out.println("No tiene habilidad especial");
    }

    public abstract void atacar(Personaje enemigo);
}
