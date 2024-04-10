package solutions2.hard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.Permission;

public class CanYouAccess {
	public static void main(String[] args) throws Exception {
		DoNotTerminate.forbidExit();	

		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
			
			//code we had to write
			CanYouAccess.Inner.Private pvt = new Inner().new Private();
			o = (Object) pvt;	//If you instead do, o = new Object(); then second print statement will print, An instance of class: java.lang.Object has been created, instead of, An instance of class: CanYouAccess.Inner.Private has been created
			System.out.println(num + " is " + pvt.powerof2(num));

		System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");	//If instead of o they wrote pvt here then it would print, An instance of class: solutions2.CanYouAccess.Inner.Private has been created
		
		}//end of try
		
		catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}//end of main
	static class Inner{
		private class Private{
			private String powerof2(int num){
				return ((num&num-1)==0)?"power of 2":"not a power of 2";
			}
		}
	}//end of Inner
	
}//end of Solution

class DoNotTerminate { //This class prevents exit(0)
	 
    public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1L;
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
