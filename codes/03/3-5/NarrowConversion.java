public class NarrowConversion
{
  public static void main(String[] args)
  {
    int a = 233;
    //强制把一个int类型的值转换为byte类型的值
    byte b = (byte)a;
    //将输出-23
    System.out.println(b);
    double d = 3.98;
    //强制把一个double类型的值转换为int
    int tol = (int)d;
    //将输出3
    System.out.println(tol);
  }
}