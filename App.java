
public class App {
    public static void main(String[] args) throws Exception {
    
          int vetor[] = {1,2,43,543,65,7657,876,6};
          int control = vetor.length -1;
         System.out.println(Re(vetor, control));

    }


  public static int Re(int a[], int control){
 
          if(a[control] == 43){
      
              return control;
          } 
 
 
              return Re(a, control -1);
  }
}
