package zadTri.tri;

public class Main {
    public static void main (String[] args){
        Restoran objekt1 = new Restoran();
        objekt1.setIme("Aurum");
        objekt1.setLokacija("Pionerska BB");
        objekt1.setBrNaTel(412189);
        objekt1.setSedista(200);

        System.out.println("Imeto na restoranot koj se otvara e " + objekt1.getIme()+".");
        System.out.println("Lokacijata i telefonskiot broj se: " + objekt1.getLokacija() +", br: "+
                objekt1.getBrNaTel()+".");
        System.out.println("Restorantot ima kapacitet od " + objekt1.getSedista()+" gosti.");
    }
}
