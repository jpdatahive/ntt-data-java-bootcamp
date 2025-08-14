public class User {
  // Atributos da classe
  protected String name;
  protected String email;
  protected String password;
  protected boolean isAdmin;

  //Construtor
  public User(String name, String email, String password, boolean isAdmin) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.isAdmin = isAdmin;
  }

  // Getters 
  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  public boolean isAdmin() {
    return this.isAdmin;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  // Metodos
  public void login() {
    System.out.println("Login realizado com sucesso.");
  }

  public void logoff() {
    System.out.println("Logoff realizado com sucesso.");
  }

  public void changeInfo(String name, String email) {
    String newName = name;
    String newEmail = email;
    System.out.println("Nome alterado com sucesso, ANTIGO: %s - NOVO: %s.", this.name, newName);
    System.out.println("Email alterado com sucesso, ANTIGO: %s - NOVO: %s.", this.email, newEmail);
    this.name = newName;
    this.email = newEmail;
  } 

  public void changePassword(String password) {
    String newPassword = password;
    System.out.println("Senha alterada com sucesso.");
    this.password = newPassword;
  }



}
