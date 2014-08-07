package dojo.roman.numeric.noif;

public class Roman {

	public String convert(int arabicNumber) {
		String romanResult = "";
		for(int start=0; start<arabicNumber; start++) {
			romanResult += "I";
		}
		return romanResult;
	}

}
