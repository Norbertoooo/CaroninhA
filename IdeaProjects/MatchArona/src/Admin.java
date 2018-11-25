public class Admin extends Usuario{
    private String login = "AA";
    private String senha = "00";

    public boolean compara(String login,String senha){
        if( (this.login.equals(login)) && (this.senha.equals(senha)) ){
            return true;
        }else
            return false;
    }

    //getters e setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
