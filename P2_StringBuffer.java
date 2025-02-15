public class P2_StringBuffer{
	public static void main(String[]args){
		int time = 1000000;
		String str = "Hello";
		
		long startSF = System.nanoTime();
		StringBuffer sf = new StringBuffer();
        for (int i = 0; i < time; i++) {
            sf.append(str);
        }
        long endSF = System.nanoTime();
		
		long startSTB = System.nanoTime();
		StringBuilder stb = new StringBuilder();
        for (int i = 0; i < time; i++) {
            stb.append(str);
        }
        long endSTB = System.nanoTime();
		
        System.out.println("String Buffer Time: "+(endSF - startSF));
        System.out.println("String Builder Time: "+(endSTB - startSTB));
	}
}