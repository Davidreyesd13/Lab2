package lab2_davidreyes;

import java.util.ArrayList;

public class Personajes {
private ArrayList clerigo = new ArrayList();
private ArrayList barbaro = new ArrayList();
private ArrayList Mago = new ArrayList();
private ArrayList picaro=new ArrayList();

    public ArrayList getClerigo() {
        return clerigo;
    }
    
    public void setClerigo(ArrayList clerigo) {
        this.clerigo = clerigo;
    }

    public ArrayList getBarbaro() {
        return barbaro;
    }

    public void setBarbaro(ArrayList barbaro) {
        this.barbaro = barbaro;
    }

    public ArrayList getMago() {
        return Mago;
    }

    public void setMago(ArrayList Mago) {
        this.Mago = Mago;
    }

    public ArrayList getPicaro() {
        return picaro;
    }

    public void setPicaro(ArrayList picaro) {
        this.picaro = picaro;
    }

}
