import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class math10_22 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=1;
		PrintWriter out;//�������
		try
		{
	        out=new PrintWriter("d:/result.txt");//�����·�����ļ���
	        }
		catch(FileNotFoundException e)
	        {
			throw new RuntimeException(e);
			}
		Scanner reader=new Scanner(System.in);
		if(reader.hasNextInt())
		{
			int a=reader.nextInt();
			int b=a*2;
			System.out.println("�Ƿ񺬸��� �� 1 �� 2");
			if(reader.hasNextInt()){
				int k=reader.nextInt();		//�Ƿ�������
				System.out.println("������Ŀ����");
				if(reader.hasNextInt())
				{
					int Num=reader.nextInt();
					System.out.println("�������ַ�Χ");
					if(reader.hasNextLong())
					{
						long all=reader.nextLong();
						for(;i<=Num;){	       //��Ŀ��������		
						    int num1=(int)(Math.random()*all);//�Զ���������
							int num2=(int)(Math.random()*all);
							int fuhao=(int)(Math.random()*b);
							int fushu=(int)(-all-Math.random()*2*all);
							switch (fuhao) {                  //���ɷ���
							case 0:
								if(k==1&&num1+num2<all&&num1+num2>-all){
									out.println(i+". "+fushu+"+"+num2+"=");
									i++;
								}else{
									if(num1+num2<all){
										out.println(i+". "+num1+"+"+num2+"=");
										i++;
									}
								}
								break;
							case 1:
								if(k==1&&fushu-num2<all&&fushu-num2>-all){
									out.println(i+". "+fushu+"-"+num2+"=");
									i++;
								}else{
									if(num1-num2<all){
										out.println(i+". "+num1+"-"+num2+"=");
										i++;
									}
								}
								break;
							case 2:
								if(num1/num2>0&&num1/num2<all){
									out.println(i+". "+num1+"/"+num2+"=");
							    	i++;
								}
								break;			
							default:
								if(num1*num2>0&&num1*num2<all){
									out.println(i+". "+num1+"*"+num2+"=");
							    	i++;
								}
								break;
							}
						}						
					}else{
						System.out.println("�������");
					}
				}else{
					System.out.println("�����������������");
				}
			}else{
				System.out.println("�����������������");
			}	
			
		}else
		{
			System.out.println("�����������������");
		}
		out.close();

	}

}
