package entity;

public class PoliEntity {
    private String poli;
    private boolean status;

    public PoliEntity(String poli, boolean status) {
        this.poli = poli;
        this.status = status;
    }

//    public PoliEntity() {
//    }


    public String getPoli() {
        return this.poli;
    }

    public void setPoli(String poli) {
        this.poli = poli;
    }

    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
