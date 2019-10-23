import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class math10_22 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=1;
		PrintWriter out;//定义变量
		try
		{
	        out=new PrintWriter("d:/result.txt");//输出的路径和文件名
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
			System.out.println("是否含负数 是 1 否 2");
			if(reader.hasNextInt()){
				int k=reader.nextInt();		//是否有括号
				System.out.println("输入题目数量");
				if(reader.hasNextInt())
				{
					int Num=reader.nextInt();
					System.out.println("操作数字范围");
					if(reader.hasNextLong())
					{
						long all=reader.nextLong();
						for(;i<=Num;){	       //题目数量定制		
						    int num1=(int)(Math.random()*all);//自动生成算数
							int num2=(int)(Math.random()*all);
							int fuhao=(int)(Math.random()*b);
							int fushu=(int)(-all-Math.random()*2*all);
							switch (fuhao) {                  //生成符号
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
						System.out.println("输入错误");
					}
				}else{
					System.out.println("输入错误请输入数字");
				}
			}else{
				System.out.println("输入错误请输入数字");
			}	
			
		}else
		{
			System.out.println("输入错误请输入数字");
		}
		out.close();

	}

}
