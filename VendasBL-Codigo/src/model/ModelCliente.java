package model;
/**
*
* @author Israel
*/
public class ModelCliente {

    private int idCliente;
    private String cliNome;
    private String cliZona;
    private String cliEndereco;
    private String cliBairro;
    private String cliCidade;
    private String cliUf;
    private String cliCep;
    private String cliTelFixo;
    private String cliTelCel;

    /**
    * Construtor
    */
    public ModelCliente(){}

    /**
    * seta o valor de idCliente
    * @param pIdCliente
    */
    public void setIdCliente(int pIdCliente){
        this.idCliente = pIdCliente;
    }
    /**
    * @return pk_idCliente
    */
    public int getIdCliente(){
        return this.idCliente;
    }

    /**
    * seta o valor de cliNome
    * @param pCliNome
    */
    public void setCliNome(String pCliNome){
        this.cliNome = pCliNome;
    }
    /**
    * @return cliNome
    */
    public String getCliNome(){
        return this.cliNome;
    }

    /**
    * seta o valor de cliZona
    * @param pCliZona
    */
    public void setCliZona(String pCliZona){
        this.cliZona = pCliZona;
    }
    /**
    * @return cliZona
    */
    public String getCliZona(){
        return this.cliZona;
    }

    /**
    * seta o valor de cliEndereco
    * @param pCliEndereco
    */
    public void setCliEndereco(String pCliEndereco){
        this.cliEndereco = pCliEndereco;
    }
    /**
    * @return cliEndereco
    */
    public String getCliEndereco(){
        return this.cliEndereco;
    }

    /**
    * seta o valor de cliBairro
    * @param pCliBairro
    */
    public void setCliBairro(String pCliBairro){
        this.cliBairro = pCliBairro;
    }
    /**
    * @return cliBairro
    */
    public String getCliBairro(){
        return this.cliBairro;
    }

    /**
    * seta o valor de cliCidade
    * @param pCliCidade
    */
    public void setCliCidade(String pCliCidade){
        this.cliCidade = pCliCidade;
    }
    /**
    * @return cliCidade
    */
    public String getCliCidade(){
        return this.cliCidade;
    }

    /**
    * seta o valor de cliUf
    * @param pCliUf
    */
    public void setCliUf(String pCliUf){
        this.cliUf = pCliUf;
    }
    /**
    * @return cliUf
    */
    public String getCliUf(){
        return this.cliUf;
    }

    /**
    * seta o valor de cliCep
    * @param pCliCep
    */
    public void setCliCep(String pCliCep){
        this.cliCep = pCliCep;
    }
    /**
    * @return cliCep
    */
    public String getCliCep(){
        return this.cliCep;
    }

    /**
    * seta o valor de cliTelFixo
    * @param pCliTelFixo
    */
    public void setCliTelFixo(String pCliTelFixo){
        this.cliTelFixo = pCliTelFixo;
    }
    /**
    * @return cliTelFixo
    */
    public String getCliTelFixo(){
        return this.cliTelFixo;
    }

    /**
    * seta o valor de cliTelCel
    * @param pCliTelCel
    */
    public void setCliTelCel(String pCliTelCel){
        this.cliTelCel = pCliTelCel;
    }
    /**
    * @return cliTelCel
    */
    public String getCliTelCel(){
        return this.cliTelCel;
    }

    @Override
    public String toString(){
        return "ModelCliente {" + "::idCliente = " + this.idCliente + "::cliNome = " + this.cliNome + "::cliZona = " + this.cliZona + "::cliEndereco = " + this.cliEndereco + "::cliBairro = " + this.cliBairro + "::cliCidade = " + this.cliCidade + "::cliUf = " + this.cliUf + "::cliCep = " + this.cliCep + "::cliTelFixo = " + this.cliTelFixo + "::cliTelCel = " + this.cliTelCel +  "}";
    }
}