package entity;

public class AdminEntity extends OrangPasienEntity {
    private String username ;
    private String password;

    public AdminEntity (int nik, String nama, String username, String password) {
        super(nik, nama);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
