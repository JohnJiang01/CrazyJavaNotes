public class TestDiv
{
  public static void main(String[] args)
  {
    double a = 5.2;
    double b = 3.1;
    double div = a / b;
    //div的值将是1.67741935.......
    System.out.println(div);
    //输出正无穷大：Infinity
    System.out.println("5除以0.0的结果是：" + 5 / 0.0);
    //输出负无穷大：-Infinity
    System.out.println("-5除以0.0的结果是："  + -5 /0.0);
    //下面代码将出现异常 java.lang.ArithmeticException：/ by zero
    System.out.println("-5除以0的结果是：" + -5 / 0);
  }
}