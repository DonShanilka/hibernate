package lk.ijse.embed;

import jakarta.persistence.Embeddable;

@Embeddable
public class FullName {
    private String fName;
    private String sName;

    public FullName(String fName, String sName) {
        this.fName = fName;
        this.sName = sName;
    }

    public FullName() {

    }

    public String getfName() {
        return fName;
    }

    public String getsName() {
        return sName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "fName='" + fName + '\'' +
                ", sName='" + sName + '\'' +
                '}';
    }
}
