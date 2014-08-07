package dojo.roman.numeric.noif;

import java.util.HashMap;
import java.util.Map;

public class Roman {

	public String convert(int arabicNumber) {
		Map<Integer, String> arabicToRomanMap = new HashMap<Integer, String>();
		arabicToRomanMap.put(4, "IV");

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
