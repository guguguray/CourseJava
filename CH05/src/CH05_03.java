// 參考呼叫EX-1: 排序 


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
		System.out.println("在 Sort 中，排序:");
		for (i=0; i<=data.length-2; i++)
			System.out.print(data[i]+"，");
		System.out.println(data[data.length-1]);
	}
	
	public static void main(String[] args)
	{
		char word[] = {'B', 'p', 'D', 'a', 'G'};
		int i;
		System.out.println("main中，排序前:");
		for (i=0; i<=word.length-2; i++) {
			System.out.print(word[i]+"，");
		}
		System.out.println(word[word.length-1]);
		
		System.out.println();
		Sort(word);
		
		System.out.println("main中，排序後:");
		for (i=0; i<=word.length-2; i++) {
			System.out.print(word[i]+"，");
		}
		System.out.println(word[word.length-1]);
	}

}
