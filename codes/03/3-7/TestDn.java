public class TestDm
{
  public static void main(String[] args)
  {
    int a = 5;
    //��a���Լӣ�Ȼ��ִ����������
    int b = ++a + 6;
    //���a��ֵΪ6��b��ֵΪ11
    System.out.println(a + "\n" + b);
    int c = 5;
    int d = c++ + 6;
    //��a��ִ���������㣬Ȼ���Լ�
    System.out.println(c + "\n" + d);
  }
}