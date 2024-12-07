public class Main {
    public static void main(String[] args) {
        Hash p = new Hash();
        p.insert("Hazem", "010");
        p.insert("Karim", "011");
        p.insert("Seif", "012");
        p.insert("Fathy", "013");
        p.insert("Sa3d", "014");
        p.insert("Gehad", "016");
        p.insert("AAaaa", "012000");

        p.update("Gehad", "015");
        p.search("Seif");
       
        //p.remove("Hazem");
        //p.remove("Karim");
        p.remove("Seif");
        p.remove("Fathy");
        p.remove("Sa3d");
        p.remove("Gehad");

        p.print();



    }
}