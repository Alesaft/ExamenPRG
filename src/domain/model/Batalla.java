package domain.model;

import domain.util.interfaces.HabilidadEspecial;

public class Batalla  {
    private Personaje personaje1;
    private  Personaje personaje2;
    private boolean turno;
    private int ronda;
    public Batalla(Personaje personaje1, Personaje personaje2){
        this.personaje1=personaje1;
        this.personaje2=personaje2;
        this.turno=true;
        this.ronda=1;
    }
    public void iniciarBatalla(){
        System.out.println("========BATALLA INICIADA=========");
        System.out.println(personaje1.getNombre()+" vs "+personaje2.getNombre());
        while(personaje1.getVidaAct()>0&&personaje2.getVidaAct()>0){
            System.out.println("Ronda: "+ronda++);
            iniciarTurno();
        }
        verificarGanador();
    }
    public void iniciarTurno(){
        double probabilidad=Math.random();
        if (turno==true){
            if (probabilidad<.30){
                System.out.print(personaje1.getNombre()+" ");
                personaje1.usarHabilidadEspecial(personaje2);
            }else{
            System.out.print(personaje1.getNombre()+" ");
            personaje1.atacar(personaje2);
            System.out.println(personaje1.getNombre()+" HP: "+personaje1.getVidaAct()+" "+personaje2.getNombre()+
                    " HP: "+personaje2.getVidaAct());
            turno=false;
            }
        } else if (turno==false) {
            if (probabilidad<.30){
                System.out.print(personaje2.getNombre()+" ");
                personaje2.usarHabilidadEspecial(personaje1);
            }else {
                System.out.print(personaje2.getNombre() + " ");
                personaje2.atacar(personaje1);
                System.out.println(personaje1.getNombre() + " HP: " + personaje1.getVidaAct() +
                        " " + personaje2.getNombre() + " HP: " + personaje2.getVidaAct());
                turno = true;
            }
        }
    }
    public void verificarGanador(){
        if (personaje1.getVidaAct()==0){
            System.out.println("El ganador de la batalla es: "+personaje2.getNombre());
        } else if (personaje2.getVidaAct()==0) {
            System.out.println("El ganador de la batalla es: "+personaje1.getNombre());
        }
    }
}
