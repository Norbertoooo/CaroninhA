public class Admin {
    String login = "AA";
    String senha = "00";

    public boolean compara(String login,String senha){
        if( (this.login.equals(login)) && (this.senha.equals(senha)) ){
        return true;
        }else
             return false;
    }
}
