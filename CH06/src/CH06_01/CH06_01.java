package CH06_01;

class Triangle
{
	// 資料成員
	int base; 
	int height;
	double ans;
	
	// 以下三個方法成員
	void Area()
	{
		ans = (base * height) / 2;
		System.out.println("在 Area 中，底="+base+"，高="+height+"，三角形面積="+ans+"\n");
	}
	
	double Area_2(int i)
	{
		System.out.print("在 Area_2 中，底="+base+"，高="+height+"，");
		return ans = (i* height)/2;
	}
	
	double Area_3(int i, int j)
	{
		System.out.print("在 Area_3 中，底="+base+"，高="+j+ "，");
		return ans = (i* j)/2;
	}
}

public class CH06_01
{

	public static void main(String[] args)
	{
		Triangle triangle = new Triangle();
		//物件.變數
		triangle.base = 2;  
		triangle.height = 8;
		
		System.out.println("在main中，底="+triangle.base+"，高="+triangle.height+ "\n");

		System.out.println("不具回傳值的方法，沒有引數:");
		triangle.Area();			//物件.方法()
		
		System.out.println("從main中，傳入單一引數base,且具有回傳值:");
		System.out.println("三角形面積="+triangle.Area_2(4) + "\n");
		
		System.out.println("從main中，傳入兩個引數base及height,且具有回傳值:");
		System.out.println("三角形面積="+triangle.Area_3(4,10));
		
		

	}

}
