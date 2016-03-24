package test;

public class Sum {
  public static void main(String[] args){
	int i=10;
	  System.out.println("第"+i+"个月兔子数："+fun(i));
	
}
  public static int fun(int i){
	  if(i==1||i==2)
		  return 1;
	  else
		return fun(i-1)+fun(i-2);
		  
	  }
	  
} 
