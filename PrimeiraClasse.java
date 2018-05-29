
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
        //x = 0;
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public static String[][] novoKanaArray(int Escolhido, String[][] KanaArray)
    {
        String[][] NovoKanaArray = new String [KanaArray.length-1][KanaArray.length-1];
        int i = 0;
        int j = 0;
        
        for(i = 0; i < KanaArray.length; i++){
            if(i != Escolhido){
             NovoKanaArray[j][1] = KanaArray[i][1];
             j++;
            }   
        }
        
        return NovoKanaArray;
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
      
      /*
      for(i = 0; i < KanaArray.length; i++) {
         System.out.println("KanaArray:[" +i + "]:" + NovoKanaArray[i][1]);
      }
      */
   
     for(i = 0; i < KanaArray.length; i++) {
         System.out.println("KanaArray:[" +i + "]:" + KanaArray[i][1]);
     }
     
     System.out.println(Escolhido); 
     String[][] NovoKanaArray = novoKanaArray(Escolhido, KanaArray);
     Escolhido = rand.nextInt(NovoKanaArray.length);
     
     for(i = 0; i < NovoKanaArray.length; i++) {
         System.out.println("1 - KanaArray:[" +i + "]:" + NovoKanaArray[i][1]);
     }
     
     System.out.println(Escolhido); 
     NovoKanaArray = novoKanaArray(Escolhido, NovoKanaArray);
     Escolhido = rand.nextInt(NovoKanaArray.length);
     
     for(i = 0; i < NovoKanaArray.length; i++) {
         System.out.println("2 - KanaArray:[" +i + "]:" + NovoKanaArray[i][1]);
     }
     
     System.out.println(Escolhido); 
     NovoKanaArray = novoKanaArray(Escolhido, NovoKanaArray);
     Escolhido = rand.nextInt(NovoKanaArray.length);
     
     for(i = 0; i < NovoKanaArray.length; i++) {
         System.out.println("3 - KanaArray:[" +i + "]:" + NovoKanaArray[i][1]);
     }
     


        
        
   }
    
}
