// �ѦҩI�sEX-1: �Ƨ� 


public class CH05_03
{
	static void Sort(char data[]) {
		int i, j;
		char t;
		for (i=data.length-2; i>=0; i--) 
		{
			for (j=0; j<= i; j++) 
			{
				if (data[j] > data[j+1]) 
				{
					t = data[j];
					data[j]=data[j+1];
					data[j+1] = t;
				}				
			}
		}
		System.out.println("�b Sort ���A�Ƨ�:");
		for (i=0; i<=data.length-2; i++)
			System.out.print(data[i]+"�A");
		System.out.println(data[data.length-1]);
	}
	
	public static void main(String[] args)
	{
		char word[] = {'B', 'p', 'D', 'a', 'G'};
		int i;
		System.out.println("main���A�Ƨǫe:");
		for (i=0; i<=word.length-2; i++) {
			System.out.print(word[i]+"�A");
		}
		System.out.println(word[word.length-1]);
		
		System.out.println();
		Sort(word);
		
		System.out.println("main���A�Ƨǫ�:");
		for (i=0; i<=word.length-2; i++) {
			System.out.print(word[i]+"�A");
		}
		System.out.println(word[word.length-1]);
	}

}
