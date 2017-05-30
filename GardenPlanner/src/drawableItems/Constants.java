package drawableItems;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Constants {

	public static Map<Color,String> colorMap = new HashMap<Color,String>();
	static{
		colorMap.put(Color.RED, "Red");
		colorMap.put(Color.YELLOW, "Yellow");
		colorMap.put(Color.GREEN, "Green");
	}
	
}
