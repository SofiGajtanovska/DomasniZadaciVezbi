package zadTri.cet;

public class Proizvod {
    private String ime;
    private int cena;
    private String proizvoditel;
    private float tezina;

    public Proizvod(){
        this.ime = "Sok";
        this.cena=55;
        this.proizvoditel = "Coca Cola";
        this.tezina = 1.25F;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public float getTezina() {
        return tezina;
    }

    public void setTezina(float tezina) {
        this.tezina = tezina;
    }
}
