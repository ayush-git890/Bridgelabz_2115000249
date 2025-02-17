import java.util.*;
public class P3_StringConcatenationPerformace{
	public static void main(String args[]){
		int[] testSizes = {1000, 10000, 1000000};
		
		for(int n:testSizes){
		//here i do concatenation using string...
		long initialStringTime = System.nanoTime();
		String s = "";
		if(n<=10000){
			for(int i=0;i<n;i++){
				s+="a";
			}
		}
		long calculateStringTime = (System.nanoTime()-initialStringTime);
		double finalStringTime = calculateStringTime/1000000.0;
		
		//here i do concatenation using string builder...
		long initialBuilderTime = System.nanoTime();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
            sb.append("a");
        }
		long calculateBuilderTime = (System.nanoTime()-initialBuilderTime);
		double finalBuilderTime = calculateBuilderTime/1000000.0;
		
		//here i do concatenation using string buffer...
		long initialBufferTime = System.nanoTime();
		StringBuffer sbf = new StringBuffer();
		for (int i = 0; i < n; i++) {
            sbf.append("a");
        }
		long calculateBufferTime = (System.nanoTime()-initialBufferTime);
		double finalBufferTime = calculateBufferTime/1_000_000.0;
		
		System.out.println("the time in string is--> "+finalStringTime+" in string builder--> "+finalBuilderTime+" in string buffer--> "+finalBufferTime);			
		}
	}
}