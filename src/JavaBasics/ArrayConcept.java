package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// Array:=To store similar data type values in a array variable 
		//The below mentioned array are one dimenssion array
		// 1) int Array
		// lowest bound/index =0;
		//highest bound/idex= n-1(where n=size of array)
		
		//dis advantage of array:=To over come this problem we use COLLECTION concept---Arraylist, HasTable(dynamic array)
		//size is fixed==>we can cal it as Static array(static means fixed)==>to over come we use Object array;
		
		int i[]=new int[4];
		i [0]=10;
		i [1]=20;
		i [2]=30;
		i [3]=40;
		
		System.out.println(i.length);//to get the length of array
        System.out.println(i[3]); 	// to get the value of i[3]	.we can print any value in the same way
         // for printing all the array values we need to use For loop concpet
        
        for(int j=0;j<i.length;j++){
        	System.out.println(i[j]);
        	
        	
        }
        
        
		System.out.println("***Now character arry*******");
		
		char a[]=new char[3];
		a[0]='k';
		a[1]='a';
		a[2]='r';
		
		System.out.println(a.length);// to get the length of char array
		System.out.println(a[1]);
		 
		for(int b=0;b<a.length;b++){ // we can write like this also (for(int b=0;b<3;b++))
			System.out.println(a[b ]);
			
			
			System.out.println("******Double Array*********");
			double d[]=new double[3];
			d[0]=10.3;
			d[1]=12.54;
			d[2]=15.55;
			
			System.out.println(d.length);
			System.out.println(d[2]);
			
			System.out.println("************STRING ARRAY************");
			//String is not a data type (infact it is class)
            String s[]=new String[4];
            s[0]="Hello";
            s[1]="String";
            s[2]="this is ";
            s[3]="Java 6.4";
            System.out.println(s[1]);
            
            for(int t=0;t<s.length;t++){
            	System.out.print(s[t]);
            	
            }
            
            
            System.out.println("************Object array*********");
            //0bject Array :(Object is a Class)--is to store different	data types valuesf
            Object obj[]=new Object[5];
            obj[0]="karthik";
	        obj[1]="5.5";
	        obj[2]="13/10/1991";
	        obj[3]='M';
	        obj[4]=25;
	        
	        for(int obj1=0;obj1<obj.length;obj1++){
	        	System.out.println(obj[obj1]);
	        	
	        }
		}
		
		Object ob1[]=new Object[3];
		ob1[0]="karthikpatel";
		ob1[1]="5.5";
		ob1[2]="M";
		
		for(int ob=0;ob<ob1.length;ob++){
			System.out.println(ob1[ob]);
			
		}
	}

}
