public class Usuario {

    public static void main(String[] args) {

        SmartTv SmartTv = new SmartTv();

        System.out.println("------------------------------------------------------------");
        System.out.println(" TV Ligada ?" + " " + SmartTv.ligada);
        System.out.println(" Canal Atual :" + " " + SmartTv.canal);
        System.out.println(" Volume Atual :" + " " + SmartTv.volume);
        System.out.println("------------------------------------------------------------");

        System.out.println(" "); 

        System.out.println("------------------------------------------------------------");
        SmartTv.ligar();
        
        SmartTv.aumentarVolume();       

        SmartTv.diminuirVolume();

        SmartTv.escolherCanal(15);
        System.out.println("------------------------------------------------------------");
    }
    
}
