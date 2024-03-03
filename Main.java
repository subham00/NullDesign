public class Main {
    public static void main(String args[]){
        Vechile vechile = VechileFactory.getVechile(null);
        print(vechile);
    }
    public static void print(Vechile vechile){
        System.out.println(vechile.getCapacity());
    }
}
