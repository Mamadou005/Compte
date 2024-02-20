public class TestPersCompte {
    public static void main(String[] args) {
        Personne p1 = new Personne("Diop","Jamil",21);
        Personne p2 = new Personne("Sow","Busquito",21);
        Compte c1 = new Compte(0,p1);
        Compte c2 = new Compte(0,p2);
        c1.credite(100000);
        c2.credite(50000);
        c1.info();
        c2.info();

        if (c1.retire(2000)){
            System.out.println("Retrait avec succes");
        }else{
            System.out.println("Solde insuffisant");
        }
            System.out.println("montant avant retrait" +p1.getMonnaie());
    }
}
