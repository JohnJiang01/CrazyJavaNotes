public class TestDm
{
  public static void main(String[] args)
  {
    int a = 5;
    //让a先自加，然后执行算术运算
    int b = ++a + 6;
    //输出a的值为6，b的值为11
    System.out.println(a + "\n" + b);
    int c = 5;
    int d = c++ + 6;
    //让a先执行算术运算，然后自加
    System.out.println(c + "\n" + d);
  }
}