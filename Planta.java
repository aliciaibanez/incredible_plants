    public class Planta {
    double altura;
    String nombre;
    Cultivo tipoCultivo;
    
    public Planta () {
        altura = 1.6;
        nombre = "Cactus";
        Cultivo tipoCultivo = new Cultivo();
    }

    public double getAltura() {
        return altura;
    }

    public String getNombre() {
        return nombre;
    }

    public Cultivo getTipoCultivo() {
        return tipoCultivo;
    }
    
}