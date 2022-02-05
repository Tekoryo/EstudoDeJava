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

    public void setLog(Date DateLog) {
        this.DateLog = DateLog;
    }

    @Override
    public String toString() {
        return "Log [Log=" + this.DateLog + ", Nick=" + this.Nick + "]";
    }
    
}