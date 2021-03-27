import java.util.Scanner;
public class TraverseString {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter message :");
		String[] message=sc.nextLine().split(" ");
		String[] msg={"0","1","2","3","4","5","6","7",};
		traverseMessage(message);
		traverseMessage(msg);
	}
	public static void traverseMessage(String[] msg)
	{
		StringBuffer[] buffer=new StringBuffer[msg.length];
		for (int i=0;i<msg.length/2;i++)
		{
			String temp=msg[msg.length-1];
				for(int j=msg.length-1;j>i*2;j--)
					msg[j]=msg[j-1];
			msg[i*2]=temp;
		}
		//print traver value 
		for(int i=0;i<msg.length;i++)
		{
			buffer[i]=new StringBuffer(msg[i]);
			System.out.print(buffer[i].reverse()+" ");
		}
		
	}
}