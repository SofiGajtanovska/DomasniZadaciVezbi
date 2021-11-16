package zadTri.cet;

public class Main {
    public static void main (String[] args){
        Proizvod Pr1 = new Proizvod();

        System.out.println("Imeto na proizvodot e " + Pr1.getIme());
        System.out.println("Proizvoditel e "+ Pr1.getProizvoditel());
        System.out.println("Za tezina od " + Pr1.getTezina() +" litri, cenata e "+Pr1.getCena()+" denari.");

    }
}
