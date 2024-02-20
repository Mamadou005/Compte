public  class TestPers{
    public static void main(String[] args){
        Personne tony = new Personne("Parker","tony",33);
        System.out.println(tony);
        Personne mickael = tony;
        mickael.setPrenom ("mickael");
        System.out.println(mickael);
        System.out.println(tony);

    }
}