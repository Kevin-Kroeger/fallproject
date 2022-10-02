import java.util.Date;

public class User extends Person {

    private String password;
    private String email;

    public User(String pName,String pPassword, String pEmail){
        super(pName);
        if(passwordValid(pPassword) == true){
            setPassword(pPassword);
        }else{
            System.out.println("Passwort ist nicht Sicher genug!");
            setName(null);
            setPassword(null);
            setEmail(null);
            System.exit(0);
        }
        setEmail(pEmail);

    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean passwordValid(String pPassword){
        char[] password = new char[pPassword.length()];
        password = pPassword.toCharArray();
        System.out.println(password);


        //Checks if passord is longer than 8
        if(password.length < 8){
            return false;
        }

        boolean lower = false;
        boolean upper = false;
        boolean figure = false;
        boolean special = false;

        for(int i = 0; i < password.length; i++){
            if(password[i] >= 'a' && password[i] <='z'){
                lower = true;
            }else if(password[i] >= 'A' && password[i] <='Z'){
                upper = true;
            }else if(password[i] >= '0' && password[i] <='9'){
                figure = true;
            }else if(password[i] >= '!' || password[i] <='*'){
                special = true;
            }
        }

        if(lower  && upper  && figure  && special ){
            System.out.println("Passwort wurde übernommen!");
            return true;
        }else{
            return false;
        }

    }

    public String toString(){
        return "Name " + getName() + "Email: " + getEmail() + "Password: " + getPassword();
    }

}
