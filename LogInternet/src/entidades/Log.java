package entidades;

import java.time.OffsetDateTime;
import java.util.Date;

public class Log{
    private String Nick;
    private Date DateLog;
    
    public Log(String nick, Date DateLog) {
        this.Nick = nick;
        this.DateLog = DateLog;
    }

    public Log(String nick2, OffsetDateTime parse) {
	}

	public String getNick() {
        return Nick;
    }

    public void setNick(String nick) {
        Nick = nick;
    }

    public Date getDateLog() {
        return DateLog;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Nick == null) ? 0 : Nick.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Log other = (Log) obj;
        if (Nick == null) {
            if (other.Nick != null)
                return false;
        } else if (!Nick.equals(other.Nick))
            return false;
        return true;
    }
    
}