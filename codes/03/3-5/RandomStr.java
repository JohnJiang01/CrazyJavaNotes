
public class RandomStr
{
  public static void main(String[] args)
  {	
     //����һ�����ַ���
     String result = "";
     //����6��ѭ��
     for(int i = 0 ; i < 6 ; i ++ )
     {
	//����һ��97~122��int�͵�����
	int ia = (int)(Math.random() * 26 + 97);
	//��iaǿ��ת��Ϊchar�����ӵ�result����
	result = result + (char)ia;
     }
     //�������ַ���
     System.out.println(result);
  }
}