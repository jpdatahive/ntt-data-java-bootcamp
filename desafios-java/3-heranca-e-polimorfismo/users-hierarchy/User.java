public class User {
  // Atributos da classe
  private String name;
  private String email;
  private String password;
  private boolean isAdmin;

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
    System.out.printf("Nome alterado de '%s' para '%s'.\n", this.name, name);
    this.setName(name);

    System.out.printf("Email alterado de '%s' para '%s'.\n", this.email, email);
    this.setEmail(email);
  } 

  public void changePassword(String password) {
    this.setPassword(password);
    System.out.println("Senha alterada com sucesso.");
  }



}
