public class Main {
    public static void main(String []args){

        pares();
    }

    public static void pares(){
      
        for (int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
