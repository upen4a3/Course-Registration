package allservlets;

public class StringUtils {
		
	public static boolean checkValid(String param){
		boolean isvalid=false;
		if(param !=null && !param.trim().equalsIgnoreCase("")){
			isvalid=true;
		}
		return isvalid;
	}
}
