package entity;

/**
 *
 * @author Herlmanoel
 */
public class SubareaEntity {
    private int cod_sub;
    private int cod_area;
    private String descricacao;
    private String responsavel;

    public int getCod_sub() {
        return cod_sub;
    }

    public void setCod_sub(int cod_sub) {
        this.cod_sub = cod_sub;
    }

    public int getCod_area() {
        return cod_area;
    }

    public void setCod_area(int cod_area) {
        this.cod_area = cod_area;
    }

    public String getDescricacao() {
        return descricacao;
    }

    public void setDescricacao(String descricacao) {
        this.descricacao = descricacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    
}
