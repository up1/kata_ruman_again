package dojo.roman.numeric.noif;

import java.util.HashMap;
import java.util.Map;

public class Roman {

	private Map<Integer, String> arabicToRomanMap;
	private int[] datas = { 1000, 900, 500, 100, 50, 10, 9, 5, 4, 1 };

	public Roman() {
		arabicToRomanMap = new HashMap<Integer, String>();
		arabicToRomanMap.put(1000, "M");
		arabicToRomanMap.put(900, "CM");
		arabicToRomanMap.put(500, "D");
		arabicToRomanMap.put(100, "C");
		arabicToRomanMap.put(50, "L");
		arabicToRomanMap.put(10, "X");
		arabicToRomanMap.put(9, "IX");
		arabicToRomanMap.put(5, "V");
		arabicToRomanMap.put(4, "IV");
		arabicToRomanMap.put(1, "I");
	}

	public String convert(int arabicNumber) {
		String romanResult = "";
		int foundArabicNumber = 0;
		while ((foundArabicNumber = findArabicNumber(arabicNumber)) != 0) {
			romanResult += arabicToRomanMap.get(foundArabicNumber);
			arabicNumber -= foundArabicNumber;
		}
		return romanResult;
	}

	private int findArabicNumber(int arabicNumber) {
		for (Integer arabic : datas) {
			if (arabicNumber >= arabic) {
				return arabic;
			}
		}
		return 0;
	}

}
