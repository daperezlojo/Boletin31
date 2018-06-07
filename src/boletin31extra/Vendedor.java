package boletin31extra;

import java.util.ArrayList;

public class Vendedor extends Empregado{
    
private String movil, area;
ArrayList<String> clientes = new ArrayList();
private int porcentaje;
private Coche coche;

public Vendedor() {
    
}


public Vendedor(String movil, String area, int porcentaje, Coche coche, String nome, String apelidos, String DNI, String direccion, double antiguedade, double salario) {
        super(nome, apelidos, DNI, direccion, antiguedade, salario);
        this.movil = movil;
        this.area = area;
        this.porcentaje = porcentaje;
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "Vendedor" + "movil=" + movil + ", area=" + area + ", clientes=" + clientes + ", porcentaje=" + porcentaje + ", coche=" + coche;
    }

    
public void altaClientes(String nome){
    clientes.add(nome);
}

public void bajaCliente(String nome){
    for(String cliente : clientes){
        clientes.remove(cliente);
    }
}

public void cambiarCoche(Coche coche){
    this.coche=coche;
}

@Override
public void incrementarSalario(){
    salario = salario+(0.1*antiguedade);
}

}
