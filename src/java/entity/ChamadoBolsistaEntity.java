package entity;

import java.util.Date;
/**
 *
 * @author Herlmanoel
 */
public class ChamadoBolsistaEntity {
    private int id;
    private int matricula;
    private Date qtd_horas_trab;

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

    public Date getQtd_horas_trab() {
        return qtd_horas_trab;
    }

    public void setQtd_horas_trab(Date qtd_horas_trab) {
        this.qtd_horas_trab = qtd_horas_trab;
    }
    
}
