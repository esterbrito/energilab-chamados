package entity;

import java.util.Date;

/**
 *
 * @author Herlmanoel
 */
public class MovimentacaoEntity {
    private int id;
    private int id_chamado;
    private String descricao;
    private String autor;
    private Date dt_movimentacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_chamado() {
        return id_chamado;
    }

    public void setId_chamado(int id_chamado) {
        this.id_chamado = id_chamado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getDt_movimentacao() {
        return dt_movimentacao;
    }

    public void setDt_movimentacao(Date dt_movimentacao) {
        this.dt_movimentacao = dt_movimentacao;
    }
    
    
    
}
