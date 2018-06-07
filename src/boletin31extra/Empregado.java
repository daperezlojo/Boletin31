package boletin31extra;

public abstract class Empregado {
   String nome, apelidos, DNI, direccion;
   double antiguedade, salario;
   Empregado supervisor;

    public Empregado() {
    }

    public Empregado(String nome, String apelidos, String DNI, String direccion, double antiguedade, double salario) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.antiguedade = antiguedade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getAntiguedade() {
        return antiguedade;
    }

    public void setAntiguedade(double antiguedade) {
        this.antiguedade = antiguedade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empregado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empregado supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", apelidos=" + apelidos + ", DNI=" + DNI + ", direccion=" + direccion + ", antiguedade=" + antiguedade + ", salario=" + salario + ", supervisor=" + supervisor + '}';
    }
   
    public void cambiarSupervisor(Empregado e){
        supervisor=e;
    }
    
    public void incrementarSalario(){
        
    }
}
