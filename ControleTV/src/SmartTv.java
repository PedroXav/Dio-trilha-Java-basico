public class SmartTv
 {
   boolean ligada = false;
   int canal = 1;
   int volume = 20;

   public void ligar()
   {
    ligada = true;
    System.out.println("Novo Status - TV Ligada ?" + " " + ligada);

   }

   public void desligar()
   {
    ligada = false;
    System.out.println("Novo Status - TV Ligada ?" + " " + ligada);

   }

   public void aumentarVolume()
   {
    volume++;
    System.out.println("O volume foi aumentado para:" + " " + volume);

   }

   public void diminuirVolume()
   {
    volume--;
    System.out.println("O volume foi diminuído para:" + " " + volume);

   }

   public void subirCanal()
   {
    canal++;
    System.out.println("Canal atual:" + " " + canal);

   }

   public void descerCanal()
   {
    canal--;
    System.out.println("Canal atual:" + " " + canal);
   }

   public void escolherCanal(int novoCanal)
   {
    canal = novoCanal;
    System.out.println("Canal atual:" + " " + canal);
   }

}
