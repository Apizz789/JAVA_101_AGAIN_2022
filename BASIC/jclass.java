public class jclass {
   
    String fname = "Mozanyaku";
    String lname = "Honjo";
    String age = "22";
    String district = "Ladkrabang";
    String province = "Bangkok";
    String country = "THA";
    int zipcode = 10520;

    public static void main(String[] args) {
        jclass obj1 = new jclass();
        jclass obj2 = new jclass();
        jclass obj3 = new jclass();
        jclass obj4 = new jclass();
        jclass obj5 = new jclass();
        jclass obj6 = new jclass();
        System.out.println(obj1.fname +" "+obj2.lname+", "+obj3.age);
        System.out.println(obj3.district+", "+obj4.province+", ");
        System.out.println(obj5.country+", "+ obj6.zipcode);

        System.out.println("\n"+"Editing....");
        obj6.zipcode = 10222;
        System.out.println("ZIPCODE: "+ obj6.zipcode);

    }
}
