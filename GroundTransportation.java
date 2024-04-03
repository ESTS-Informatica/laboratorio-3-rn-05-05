
/**
 * Classe para representar um transporte terrestre.
 * 
 * @author (Diana e Vitor) 
 * @version (3/4/2024)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate; //atributo com a matrícula do veículo
    
    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation(String licensePlate)
    {
        this.licensePlate = licensePlate; //inicialização do atríbuto
    }
    
    /**
     * Método modificador para definir a matrícula
     * 
     * @param matricula
     * 
     */
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
    
    
    /**
     * Método seletor para retornar a matrícula
     * 
     * @return matricula
     * 
     */
    public String getLicensePlate(){
        return licensePlate;
    }
    
    /**
     * Método com Override que retorna o preço do transporte com a taxa de honorários cobrados
     * 
     * @return preço com honorários
     * 
     */
    @Override
    public double getPriceWithFees(){
        return super.getPrice() * (1.0 + (3 * 0.01));
    }
    
    /**
     * Método que devolve a descrição do tipo de trasnporte
     * 
     * @return tipo de trasnporte em string
     * 
     */
    @Override
    public String getTransportType(){
        return "Transporte Terrestre";
    }
}
