package domain.repository;

import domain.model.Personaje;

public class PersonajeData {
    public String tipo;
    public String nombre;
    public int vidaMax;
    public int vidaAct;
    public int ataque;
    public int defensa;
    public int id;
    public PersonajeData(){}
    public PersonajeData(String tipo, String nombre, int vidaMax, int vidaAct, int ataque, int defensa){
        this.tipo = tipo;
        this.nombre=nombre;
        this.vidaMax=vidaMax;
        this.vidaAct=vidaAct;
        this.ataque=ataque;
        this.defensa=defensa;
    }
    public String getTipo(){return tipo;}

    public String getNombre(){return nombre;}

    public int getVidaMax() {return vidaMax;}

    public int getVidaAct() {return vidaAct;}

    public int getAtaque() {return ataque;}

    public int getDefensa() {return defensa;}

    public int getId() {return id;}
}
