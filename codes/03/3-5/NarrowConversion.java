public class NarrowConversion
{
  public static void main(String[] args)
  {
    int a = 233;
    //ǿ�ư�һ��int���͵�ֵת��Ϊbyte���͵�ֵ
    byte b = (byte)a;
    //�����-23
    System.out.println(b);
    double d = 3.98;
    //ǿ�ư�һ��double���͵�ֵת��Ϊint
    int tol = (int)d;
    //�����3
    System.out.println(tol);
  }
}