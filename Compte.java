public class Compte {
    private int solde;
    private Personne p;
    private static int nbCompte = 0;
    private int numero;

    public Compte(int solde, Personne p) {
        this.solde = solde;
        this.p = p;
        numero = nbCompte++;
    }

    public double getSolde() {
        return solde;
    }

    public void credite(int montant) {
        this.solde += montant;
    }

    public boolean debite(int montant) {
        if (this.solde >= montant) {
            this.solde -= montant;
            return true;
        }
        return false;
    }

    public boolean retire(int somme) {
        if (debite(somme)) {
            p.setMonnaie(somme);
            return true;
        }
        return false;
    }

    public boolean depot(int montant) {
        if (p.debourse(montant)) {
        credite(montant);
        return true;
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }
    public void dellet(Compte c){
        if(c!=null){
            nbCompte--;
            c=null;
        }
    }
    public void info(){
        System.out.println(p+ "je suis titulaire du compte \nnumero: "+numero+ "\nSolde :" +solde);
    }
}
