public class binaria {
 
    public static void main(String[] args) {
 
        int vetor[] = {100,200,300,400,500,600,700};
        int fim = vetor.length -1;
<<<<<<< HEAD
        int start = 0;
        int pivo = 0;
        int value = 500;
        System.out.println(Search(vetor, fim, pivo, start, value));
    }


         public static int Search(int vetor[],int fim,int pivo, int start,int value){
           
           if(fim == 0){
               return -1;
           }
                               
            pivo =  (start + fim)/2;
            
 
              if(vetor[pivo] == value){
                  return pivo;
              }
               else if(vetor[pivo]< value){
                   start = pivo +1;
              }
              else if(vetor[pivo]>value){
                   fim = pivo -1;
              }
     

             return Search(vetor, fim,pivo,start,value);
         }
=======
        int pivo;
        System.out.println(BinSearch(vetor));

    }


    public static int BinSearch(int v[]){

              
     
     
     
     
        return 1;


    }
>>>>>>> 363d7fd29d618ac0b2d0aa05394d77f17e2b01be
    
}