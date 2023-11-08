public class usuarioTV {
      public static void main(String [] args)
      {
            smartTV tv = new smartTV();

            System.out.println(tv.ligada);
            System.out.println(tv.canal);
            System.out.println(tv.volume);

            tv.diminuirVolume();
            tv.diminuirVolume();

            System.out.println(tv.volume);

            System.out.println("Canal atual:" + tv.canal);
            tv.mudarCanal(13);
            System.out.println("Canal atual:" + tv.canal);
      }
}
