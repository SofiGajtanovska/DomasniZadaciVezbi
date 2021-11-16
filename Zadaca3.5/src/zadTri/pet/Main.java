package zadTri.pet;

public class Main {
    public static void main (String[] args){
        Avtomobil Pr1 = new Avtomobil("Opel"," Insignia",134.893,"Crna");

        System.out.println("Marka i model na avtomobilot - " + Pr1.getMarka() + Pr1.getModel()+".");
        System.out.println("Pominati Kilometri pred mnozenje - " +Pr1.getPominatiKm() +".");
        System.out.println("Pominati Kilometri posle mnozenjeto - " +Pr1.mnozenje(9)+".");
        System.out.println("BOjata na kolata e - "+Pr1.getBoja()+".");
    }
}
