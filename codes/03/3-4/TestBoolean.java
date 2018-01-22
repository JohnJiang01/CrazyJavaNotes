public class TestBoolean
{
  public static void main(String[] args)
  {
    boolean b1 = true;
    boolean b2 = false;
    //使用布尔型数据和字符串进行连接运算，boolean会自动转换成字符串
    String str = b1 + "";
    System.out.println(str);
  }
}