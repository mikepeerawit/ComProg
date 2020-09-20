import java.util.Random;
  public class Check{
    public static void main(String [] args){
      Random r = new Random();
      System.out.println((int)Math.max(1,Math.min(10,Math.ceil(r.nextGaussian()*2)+5)));
    }
}
