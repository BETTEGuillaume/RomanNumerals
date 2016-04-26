package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String res = "";
		String futur = "";
		char car;
		for(int i = 0; i < arabe.length();i++){
			car = arabe.charAt(i);
		}
		return "I";
	}

	public int convertCharFromRoman(char roman) {
		int calc = 0;

		if(roman == 'M')
			calc = 1000;
		else if(roman == 'D')
			calc =500;
		else if(roman == 'C')
			calc =100;		
		else if(roman == 'L')
			calc =50;
		else if(roman == 'X')
			calc =10; 
		else if(roman == 'V')
			calc =5;
		else if(roman == 'I')
			calc =1;

		return calc;
	}
	
	public String convertFromRoman(String rom){
		String s ="";
		for(int i = 0; i < rom.length();i++){
			convertCharFromRoman(rom.charAt(i));
		}
		return s;
	}

}
