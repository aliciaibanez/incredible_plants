
public class Cultivo
{
    boolean esSecano;
    int horasSol;
    public Cultivo () {
        esSecano = true;
        horasSol = 8; 
    }
    
    public boolean getEsSecano(){
        return esSecano;
    }
    
    public void setEsSecano(boolean seraSecano){
        esSecano = seraSecano;
    }
    
    public int getHorasSol(){
        return horasSol;
    }
    
    public void setHorasSol( int numeroHorasSol){
        horasSol = numeroHorasSol;
    }
    
    public void imprimirDetalles () {
        System.out.println ("La altura es de: " + esSecano);
        System.out.println ("El nombre es: " + horasSol);
        System.out.println ("El tipo de planta es: " + tipoPlanta);
    }
} 