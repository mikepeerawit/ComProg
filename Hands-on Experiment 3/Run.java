public class Run{
  public static void main(String[] args){
    Java101 j = new Java101();
    String a = j.typeOf(20.0/2.5);
    String b = j.typeOf("3"+2+1);
    String c = j.typeOf(5+"6"+7);
    String d = j.typeOf(4/6*3);
    String e = j.typeOf(3.0/4*4);
    String f = j.typeOf((short)1.5);
    String g = j.typeOf(3+2.0F+4.0);
    String h = j.typeOf(4-6==7-9);
    String i = j.typeOf((int)(5-6.5)==1-2);
    System.out.println("Data Type="+a+","+"Value="+(20.0/2.5));
    System.out.println("Data Type="+b+","+"Value="+("3"+2+1));
    System.out.println("Data Type="+c+","+"Value="+(5+"6"+7));
    System.out.println("Data Type="+d+","+"Value="+(4/6*3));
    System.out.println("Data Type="+e+","+"Value="+(3.0/4*4));
    System.out.println("Data Type="+f+","+"Value="+((short)1.5));
    System.out.println("Data Type="+g+","+"Value="+(3+2.0F+4.0));
    System.out.println("Data Type="+h+","+"Value="+(4-6==7-9));
    System.out.println("Data Type="+i+","+"Value="+((int)(5-6.5)==1-2));
  }
}
