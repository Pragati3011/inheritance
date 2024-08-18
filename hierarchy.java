package inheritance;
  class childno1 {
      int AA = 100;

      void home() {
      }

      class childno2 {
          boolean name = true;

          void house() {
          }
      }
  }
  class childno3 {
      float BB = 2345;

      void villa(){

      }
  }

public class hierarchy extends childno1 {
    public static void main(String[]args){
        hierarchy CC = new hierarchy();
        CC.home();
        System.out.print("AA"+CC.AA);
    }
}
