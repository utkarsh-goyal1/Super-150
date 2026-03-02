package lec1;

public class hello_world {

	public static void main(String[] args) {
		int n=7;
		int []A= {5,3,1,2,6,7,4};
		int i=0;
        int j=n-1;
        int c=0;
        boolean flag=false;
        while(i<j)
        {
            if(A[i]>A[j])
            {
                c+=1;
                if(c>2)
                {
                    System.out.println("NO");
                    flag=true;
                    break;
                }
            }
            i++;
            j--;
        }
        
        if(flag==false)
        {
        	System.out.println("Yes");
        }
	}

}
//we can't declare two variables with the same name.
//variables-->we have to define the type of variables.
/*Operators--arithmetic,assignment ,comparision,logical,bitwise.
1 arithmetic-->
*/
