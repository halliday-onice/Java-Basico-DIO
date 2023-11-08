public class Operadores {
      public static void main(String [] args)
      {
            String nomeUm = "Jonatas";
            String nomeDois = "Jonatas";

            System.out.println(nomeUm == nomeDois);

            String nomeTres = new String("Jonatas");
            //System.out.println(nomeUm == nomeTres); false
            // Para comparar objetos utilizar o equals
            System.out.println(nomeUm.equals(nomeTres));


      }
}
