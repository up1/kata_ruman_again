package dojo.roman.numeric.noif;

import java.util.HashMap;
import java.util.Map;

public class Roman {
	
	private Map<Integer, String> arabicToRomanMap;
	
	public Roman() {
		arabicToRomanMap = new HashMap<Integer, String>();
		arabicToRomanMap.put(4, "IV");
	}

	public String convert(int arabicNumber) {
		String romanResult = "";
		for (int start = 0; start < arabicNumber; start++) {
			if (arabicToRomanMap.containsKey(arabicNumber)) {
				romanResult += arabicToRomanMap.get(arabicNumber);
				arabicNumber -= arabicNumber;
			} else {
				romanResult += "I";
			}
		}
		return romanResult;
	}

}
