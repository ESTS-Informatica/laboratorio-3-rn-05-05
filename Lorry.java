
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @autho (Diana e Vitor) 
 * @version (3/4/2024)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets; //atributo com o número de paletes do Camião
    private int trailers; //atributo com o número de atrelados ao Camião

    /**
     * Construtor para objetos da classe Lorry
     */
    public Lorry(int numberOfPallets, int trailers, String licensePlate)
    {
        super(licensePlate); //inicialização da matrícula
        this.numberOfPallets = numberOfPallets; //inicialização das paletes
        this.trailers = trailers; //inicialização de atrelados
    }
    
    /**
     * Método modificador para definir o numero de paletes
     * 
     * @param numero de paletes
     * 
     */
    public void setNumberOfPallets(int numberOfPallets){
        this.numberOfPallets = numberOfPallets;
    }
    
    /**
     * Método modificador para definir o número de atrelados
     * 
     * @param numero de atrelados
     * 
     */
    public void setTrailers(int trailers){
        this.trailers = trailers;
    }
    
    /**
     * Método seletor para retornar o número de paletes
     * 
     * @return numero de paletes
     * 
     */
    public int getNumberOfPallets(){
        return numberOfPallets;
    }
    
    /**
     * Método seletor para retornar o número de atrelados
     * 
     * @return numero de atrelados
     * 
     */
    public int getTrailers(){
        return trailers;
    }
}
