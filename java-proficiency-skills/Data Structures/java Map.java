import java.util.*;
import java.io.*;

class Solution{
	
    private static final Scanner in = new Scanner(System.in);
    
    public static void main(String []argh){
        
		int n=in.nextInt();

        Map<String,Integer> users = new HashMap<>();
		
        in.nextLine();
		
        for(int i=0;i<n;i++){
			String name=in.nextLine();
			int phone=in.nextInt();
            users.put(name,phone);
			in.nextLine();
		}
		while(in.hasNext())	{
			String s=in.nextLine();

            if(users.containsKey(s)) {
                System.out.println(s + "=" + users.get(s));
            } else {
                System.out.println("Not found");
            }
		}
	}
}
