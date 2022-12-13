package trampo;

import trampo.batuta.Legalidade;

public class Main {
    public static void main(String[] args) {
        Legalidade leg = new Legalidade();
        leg.setNome("churrasco");
        leg.setQtd(4);
        leg.setTipo("assado");
        System.out.println(leg.toString());
    }
}