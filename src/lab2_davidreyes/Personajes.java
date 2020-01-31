package lab2_davidreyes;

public class Personajes {

    public Personajes(String tipo, String nombre, String Raza, double estatura, double peso, int edad, String descrip, String nacionalidad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.Raza = Raza;
        this.estatura = estatura;
        this.peso = peso;
        this.edad = edad;
        this.descrip = descrip;
        this.nacionalidad = nacionalidad;
        
    }
    
private String tipo;
private String nombre;
private String Raza;
private double estatura;
private double peso;
private int edad;
private String descrip;
private String nacionalidad;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    @Override
    public String toString(){
        return "Personaje("+tipo+" "+nombre+" "+Raza+" "+estatura+" "+peso+" "+edad+" "+descrip+" "+nacionalidad+")";
    }
}
