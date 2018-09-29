package entity;

import java.util.Date;

/**
 *
 * @author Herlmanoel
 */
public class ChamadoEntity {
    private int id;
    private int matricula;
    private int cod_subarea;
    private Date dt_cricao;
    private String status;
    private Date prazo_h;
    private String assunto;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCod_subarea() {
        return cod_subarea;
    }

    public void setCod_subarea(int cod_subarea) {
        this.cod_subarea = cod_subarea;
    }

    public Date getDt_cricao() {
        return dt_cricao;
    }

    public void setDt_cricao(Date dt_cricao) {
        this.dt_cricao = dt_cricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPrazo_h() {
        return prazo_h;
    }

    public void setPrazo_h(Date prazo_h) {
        this.prazo_h = prazo_h;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    
}
