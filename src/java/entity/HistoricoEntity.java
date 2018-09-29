package entity;

import java.util.Date;
/**
 *
 * @author Herlmanoel
 */
public class HistoricoEntity {
    private int id;
    private int matricula;
    private Date dt_login;
    private Date dt_loginOff;

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

    public Date getDt_login() {
        return dt_login;
    }

    public void setDt_login(Date dt_login) {
        this.dt_login = dt_login;
    }

    public Date getDt_loginOff() {
        return dt_loginOff;
    }

    public void setDt_loginOff(Date dt_loginOff) {
        this.dt_loginOff = dt_loginOff;
    }    
}
