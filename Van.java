
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (Diana e Vitor) 
 * @version (3/4/2024)
 */
public class Van extends GroundTransportation
{
    private int packages; //atributo para o número de pacotes que a furgoneta trasnporta
    
    /**
     * Construtor para objetos da classe Van
     */
    public Van(int packages, String licensePlate)
    {
        super(licensePlate); //inicialização da matricula
        this.packages = packages; //inicialização dos pacotes
    }
    
    /**
     * Método modificador para definir o número de pacotes
     * 
     * @param numero de pacotes
     * 
     */
    public void setPackages(int packages){
        this.packages = packages;
    }
    
    /**
     * Método seletor para retornar o número de pacotes
     * 
     * @return numero de pacotes
     * 
     */
    public int getPackages(){
        return packages;
    }
}
