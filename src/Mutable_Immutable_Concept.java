
public class Mutable_Immutable_Concept 
{
	public static void main(String[] args) 
	{
		String name=new String("Swanand");
		String modified=name.concat("Yadav");// o/p-> SwanandYadav
		System.out.println(name);// Existing object is not change hence it is immutable o/p-> Swanand
		
		StringBuffer sb=new StringBuffer("Swanand");
		sb.append("Yadav");
		System.out.println(sb);// Existing object is changed hence it is mutable o/p-> SwanandYadav
	}

}
