
/**
 * Classe para representar um transporte áereo.
 * 
 * @author (Diana e Vitor) 
 * @version (3/4/2024)
 */
public class AirTransportation extends Transport
{
    private String name; //atributo para o nome da aeronave
    private int numberOfContainers; //atributo que identifica a quantidade de contentores
    
    /**
     * Construtor para objetos da classe AirTransportation
     */
    public AirTransportation(String name, int numberOfContainers)
    {
        this.name = name; //inicialização do atributo do nome
        this.numberOfContainers = numberOfContainers; //inicialização do atributo da quantidade de contentores
    }
    
    /**
     * Método modificador para definir o nome do avião
     * 
     * @param nome do avião
     * 
     */
    public void setName(String name){
        this.name = name;
    }
    
    
    /**
     * Método seletor para retornar o nome do avião 
     * 
     * @return nome do avião
     * 
     */
    public String getName(){
        return name;
    }
    
    /**
     * Método modificador para definir a quantidade de contentores
     * 
     * @param quantidade de contentores
     * 
     */
    public void setNumberOfContainers(int numberOfContainers){
        this.numberOfContainers = numberOfContainers;
    }
    
    
    /**
     * Método seletor para retornar a quantidade de contentores
     * 
     * @return quantidade de contentores
     * 
     */
    public int getNumberOfContainers(){
        return numberOfContainers;
    }
}
