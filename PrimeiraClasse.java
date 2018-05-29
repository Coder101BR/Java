
/**
 * Escreva a descrição da classe PrimeiraClasse aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Random;

public class PrimeiraClasse
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    /**
     * COnstrutor para objetos da classe PrimeiraClasse
     */
    public PrimeiraClasse()
    {
        // inicializa variáveis de instância
        x = 0;
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public int sampleMethod(int y)
    {
       
        // ponha seu código aqui
        return x + y;
    }
    
      public static void main(String[] args)
   {
       
       /* Autoclean CMD*/
       System.out.print('\u000C'); 
       
        String[][] KanaArray = new String [][] {
            { "a", "あ"},
            { "i", "い"},
            { "u", "う"},
            { "e", "え"},
            { "a", "お"}
        };
      
        String[][] NovoKanaArray = new String [KanaArray.length-1][KanaArray.length-1];
        
     //System.out.println("Hello World!");
     /*
      for(int i = 0; i < KanaArray.length; i = i + 1) {
         System.out.print("value of x : " + i);
         System.out.print("\n");
      }
      
      */
        Random rand = new Random();
         
        int RandomKanaIndex = rand.nextInt(KanaArray.length);
        int Random_1 = rand.nextInt(KanaArray.length);
        int Random_2 = rand.nextInt(KanaArray.length);
        int Random_3 = rand.nextInt(KanaArray.length);
        int i = 0;
        int j = 0;
        int Escolhido = RandomKanaIndex;
       // int Escolhido = 1;
       // NovoKanaArray = KanaArray;
      System.out.println(Escolhido); 
      /*
      for(i = 0; i < KanaArray.length; i++) {
         System.out.println("KanaArray:[" +i + "]:" + NovoKanaArray[i][1]);
      }
      */
   
     for(i = 0; i < KanaArray.length; i++) {
         System.out.println("KanaArray:[" +i + "]:" + KanaArray[i][1]);
     }
     
     
     
     for(i = 0; i < KanaArray.length; i++){
         if(i != Escolhido){
             NovoKanaArray[j][1] = KanaArray[i][1];
             j++;
         }   
     }
         
     for(i = 0; i < NovoKanaArray.length; i++) {
         System.out.println("NovoKanaArray:[" +i + "]:" + NovoKanaArray[i][1]);
     }
   
       ///////////////////////////////////
       String[][] NovoNovoKanaArray = new String [NovoKanaArray.length-1][NovoKanaArray.length-1];
       //Escolhido = 0;
       Escolhido = rand.nextInt(NovoNovoKanaArray.length);
       System.out.println(Escolhido); 
       j = 0;
      // System.out.println(NovoKanaArray.length);
       
       
     for(i = 0; i < NovoKanaArray.length; i++){
         if(i != Escolhido){
             NovoNovoKanaArray[j][1] = NovoKanaArray[i][1];
             j++;
         }   
     }
         
     for(i = 0; i < NovoNovoKanaArray.length; i++) {
         System.out.println("NovoNovoKanaArray:[" +i + "]:" + NovoNovoKanaArray[i][1]);
     }
     
        ///////////////////////////////////
       String[][] NovoNovoNovoKanaArray = new String [NovoNovoKanaArray.length-1][NovoNovoKanaArray.length-1];
       //Escolhido = 1;
       Escolhido = rand.nextInt(NovoNovoNovoKanaArray.length);
       System.out.println(Escolhido); 
       j = 0;
      // System.out.println(NovoKanaArray.length);
       
       
     for(i = 0; i < NovoNovoKanaArray.length; i++){
         if(i != Escolhido){
             NovoNovoNovoKanaArray[j][1] = NovoNovoKanaArray[i][1];
             j++;
         }   
     }
         
     for(i = 0; i < NovoNovoNovoKanaArray.length; i++) {
         System.out.println("NovoNovoNovoKanaArray:[" +i + "]:" + NovoNovoNovoKanaArray[i][1]);
     }
        
        
   }
    
}
