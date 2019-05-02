package ch09_15;

public class Ch09_15
{

	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("Java");
		System.out.println("原始字串:" + sb1);
		
		char[] ch = {'字','串','緩','衝','區'};
		
		sb1.append(ch, 2, 3);
		System.out.println("\n新增字串陣列:" + sb1);
		
		sb1.append("教育實務");
		System.out.println("\n新增字串:" + sb1);
		
		sb1.insert(7, "與");
		System.out.println("\n插入字串:" + sb1);
		
		int num = 2;
		sb1.insert(4, num);
		System.out.println("\n插入數字:" + sb1);
		
		sb1.delete(6, 9);
		System.out.println("\n刪除字串:" + sb1);
		
		sb1.deleteCharAt(5);
		System.out.println("\n刪除第6個字元:" + sb1);
		
		sb1.replace(5, 9, "取代字串");
		System.out.println("\n取代字串:" + sb1);
		
		sb1.setCharAt(4, '-');
		System.out.println("\n設定字元:" + sb1);
		
		sb1.reverse();
		System.out.println("\n字串反轉:" + sb1);
	}

}
