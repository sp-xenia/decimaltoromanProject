package it.xeniaconsulting.decimaltoroman;

import java.util.LinkedHashMap;

public class DecimalToRoman {	
	@SuppressWarnings("serial")
	private static final LinkedHashMap<Integer, String> romanSymbolsOfDecimalValues = new LinkedHashMap<Integer, String>() {{
			put(1000,"M");
			put(900,"CM");
			put(500,"D");
			put(400,"CD");
			put(100,"C");
			put(90,"XC");
			put(50,"L");
			put(40,"XL");
			put(10,"X");
			put(9,"IX");
			put(5,"V");
			put(4,"IV");
			put(1,"I");	
		}
	};
	
    public static String converti(int n) {
    	StringBuilder ret = new StringBuilder();
        
        while(n>0) {
        	for(Integer key : romanSymbolsOfDecimalValues.keySet()) {
        		while (n >= key) {
        			ret.append(romanSymbolsOfDecimalValues.get(key));
        			n-=key;
        		}
        	}
        }
        return ret.toString();
    }
    
    public static void main(String[] args) {
    	System.out.println(converti(90));
    }
}
