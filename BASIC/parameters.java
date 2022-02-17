public class parameters {
    static void myMethod(int id,String fname, int age) {
        System.out.println("ID: " + id +" | NAME: "+ fname + " | AGE: " + age);
      }
    
      public static void main(String[] args) {
        myMethod(62010193, "Apizz", 22);
        myMethod(62011019, "Razza", 23);
        myMethod(62011123, "Kunzu", 24);
      }
}
