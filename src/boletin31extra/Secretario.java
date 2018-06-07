package boletin31extra;

public class Secretario extends Empregado {
    private String numero, fax, despacho;

    public Secretario() {
    }
    
    public Secretario(String numero, String fax, String despacho, String nome, String apelidos, String DNI, String direccion, double antiguedade, double salario) {
        super(nome, apelidos, DNI, direccion, antiguedade, salario);
        this.numero = numero;
        this.fax = fax;
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return "Secretario" + "numero=" + numero + ", fax=" + fax + ", despacho=" + despacho;
    }
    
    @Override
    public void incrementarSalario(){
        salario=salario+(0.05*antiguedade);
    }
}
