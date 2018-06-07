package boletin31extra;

import java.util.ArrayList;

public class Boletin31Extra {

    public static void main(String[] args) {
 
        
      Coche coche1=new Coche("1234DCC","Seat","Leon");
        XefeDeZona xefe1 = new XefeDeZona("despacho1","secretario1",coche1,"nome1","apelido1","DNI1","direccion2",365,1250);
        Secretario secretario1=new Secretario("numero1","fax1","despacho2","nome2","apelido2","direccion1","dni2",987987987,1500);
        Vendedor vendedor1=new Vendedor("movil3","area1", 3,coche1,"nombre3","apellido3","direccion3","dni3",986986986,900);
    
        ArrayList<Empregado> empregados=new ArrayList();
        
        empregados.add(secretario1);
        empregados.add(xefe1);
        empregados.add(vendedor1);
        
        secretario1.setAntiguedade(6);
        vendedor1.setAntiguedade(4);
        xefe1.setAntiguedade(2);
        
        
        secretario1.setSupervisor(vendedor1);
        
        System.out.println(xefe1.toString());
        System.out.println(secretario1.toString());
        System.out.println(vendedor1.toString());
    }
    
}
