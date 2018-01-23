
public class RandomStr
{
  public static void main(String[] args)
  {	
     //定义一个空字符串
     String result = "";
     //进行6次循环
     for(int i = 0 ; i < 6 ; i ++ )
     {
	//生成一个97~122的int型的整数
	int ia = (int)(Math.random() * 26 + 97);
	//将ia强制转换为char后连接到result后面
	result = result + (char)ia;
     }
     //输出随机字符串
     System.out.println(result);
  }
}