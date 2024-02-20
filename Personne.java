public class Personne {
    private String nom;
    private String prenom;
    public int age;
    private double monnaie;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void setPrenom(String p) {
        this.prenom = p;
    }

    public void anniversaire() {
        this.age++;

    }

    public String toString() {
        return "Je m'appelle:" + this.prenom + " " + this.nom + " j'ai " + this.age + " ans ";
    }

    public static boolean donnne(Personne p1, Personne p2, int montant) {
        if (p1.monnaie >= montant) {
            p2.monnaie = p2.monnaie + montant;
            p1.monnaie -= montant;
            return true;
        } else {
            System.out.println("Solde insuffisant");
            return false;
        }
    }
    public void setMonnaie(int monnaie){
        this.monnaie += monnaie;
    }
    public double getMonnaie() {
        return monnaie;
    }
    public boolean debourse(int montant){
        if(this.monnaie<=montant){
            this.monnaie -= montant;
            return true;
        }
        return false;
    }

}
