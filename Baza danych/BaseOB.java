package com.example.ob; /**
 * Created by bidzis on 2016-03-18.
 */
import java.util.Date;
public class BaseOB {

    protected long id;
    private Date dataUtworzenia;
    private Date dataModyfikacji;

    public long getID() {
        return id;
    }

    public void setID(long id) {
        this.id = id;
    }

    public Date getDataModyfikacji() {
        return dataModyfikacji;
    }

    public void setDataModyfikacji(Date dataModyfikacji) {
        this.dataModyfikacji = dataModyfikacji;
    }
}
