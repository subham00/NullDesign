public class VechileFactory {
    public static Vechile getVechile(String type){
        if("car".equals(type)){
            return new Car();
        }
        else{
            return new Nullobject();
        }
    }
}
