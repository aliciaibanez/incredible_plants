
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
        System.out.println ("¿El cultivo es secano?: " + esSecano);
        System.out.println ("Las horas de sol son: " + horasSol);
    }
} 