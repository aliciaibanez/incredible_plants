public class Planta {
    double altura;
    String nombre;
    Cultivo tipoCultivo;
    public Planta () {
        altura = 1.6;
        nombre = "Cactus";
        tipoCultivo = new Cultivo();
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

    public void setNombre (String esNombre) {
        nombre = esNombre;
    }

    public void setAltura (double esAltura) {
        altura = esAltura;
    }
    
    public void setTipoCultivo(Cultivo esTipoCultivo) {
        tipoCultivo = esTipoCultivo;
    }
    
    public void imprimirDetalles(){
        System.out.println("La altura es: " + altura);
        System.out.println("El nombre es: " + nombre);
        System.out.println("El tipo del cultivo es: " + getTipoCultivo());

    }
}
