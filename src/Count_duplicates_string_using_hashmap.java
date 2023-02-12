import java.util.HashMap;
import java.util.Map;

public class Count_duplicates_string_using_hashmap 
{
	public static void main(String[] args) 
	{
		Map<String, Integer> map= new HashMap<>();
		String str[]= {"swanand","swanand","sharu","reshu"};

		for (String wrd : str) 
		{
			if (map.containsKey(wrd)) 
			{
				map.put(wrd, map.get(wrd) + 1);
			}
			else 
			{
				map.put(wrd, 1);
			}
		}
		System.out.println(map);
	}
}
