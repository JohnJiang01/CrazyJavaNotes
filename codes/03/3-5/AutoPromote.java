public class AutoPromote
{
  public static void main(String[] args)
  {
    
    //����һ��short���ͱ���
    //short s = 5;
    //���ʽ�е�s���Զ�������int���ͣ����ұߵı��ʽ����Ϊint
    //��һ��int���͸���short���͵ı�������������
    //s = s - 2; 
    byte b = 40;
    char c = 'a';
    int i = 23;
    double d = 0.314;
    //�ұ߱��ʽ������ߵȼ�������Ϊd��double��)
    //���ұ߱��ʽ������Ϊdouble�ͣ��ʸ���һ��double�ͱ���
    double result = b + c + i * d;
    //�����144.222
    System.out.println(result);
    int val = 3;
    //�ұ߱��ʽ��2������������int�����ұ߱��ʽ������Ϊint
    //��ˣ���Ȼ23/3���ܳ�������Ȼ�õ�һ��int����
    int re = 23 / val;
    //�����7
    System.out.println(re);
    //����ַ���Hello!a7
    System.out.println("Hello!" + 'a' + 7);
    //����ַ���104Hello��
    System.out.println('a' + 7 + "Hello!");
  }
}