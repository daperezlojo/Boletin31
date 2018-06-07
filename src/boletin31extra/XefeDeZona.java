package boletin31extra;

import java.util.ArrayList;

public class XefeDeZona extends Empregado{
    
    private String despacho;
    ArrayList<Vendedor> vendedores = new ArrayList();
    private String secretario;
    private Coche coche;

    public XefeDeZona(String despacho, String secretario, Coche coche, String nome, String apelidos, String DNI, String direccion, double antiguedade, double salario) {
        super(nome, apelidos, DNI, direccion, antiguedade, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.coche = coche;
    }
    
    
    public String getDespacho(){
        return despacho;
    }

    public String getSecretario(){
        return secretario;
    }

    public void cambiarSecretario(String secretario){
        this.secretario=secretario;
    }

    public Coche getCoche(){
        return coche;
    }

    public void cambiarCoche(Coche coche){
        this.coche=coche;
    }

    @Override
    public String toString(){
        return super.toString()+"despacho="+despacho+", secretario="+secretario+", coche="+coche;
    }

    @Override
    public void incrementarSalario(){
        salario=salario+(0.2*antiguedade);
    }}
