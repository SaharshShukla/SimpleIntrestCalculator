import java.util.*;

public class simple_Intrest_Calculator {
    public static void main(String[]args){
    	
     Scanner scn=new Scanner(System.in);
     System.out.println("Press 1 for calculation of simple Intrest: ");
     System.out.println("Press 2 for calculation of Rate: ");
     System.out.println("Press 3 for calculation of Time: ");
     System.out.println("Press 4 for calculation of Principal when si,time and rate is given: ");
     System.out.println("Press 5 for calculation of Amount: ");
     System.out.println("Press 6 for calculation of Principal when amount,time and rate is given: ");
     System.out.println("Press 7 for calculation of Principal when amount and si given : ");
     System.out.println("Press 8 for calculation of Amount when when principal,time and rate given : ");
     int cs=scn.nextInt();
      
      
     switch (cs){
    	 case 1:
         System.out.println("Simple interst is "+calSi());
         break;
         
    	 case 2:
         System.out.println("Rate is "+calRate());
         break; 
         
    	 case 3:
         System.out.println("time is "+calTime());
         break;
         
    	 case 4:
         System.out.println("Principal is "+calPri());
         break;
         
    	 case 5:
         System.out.println("Principal is "+calAmnt());
         break;
         
    	 case 6:
         System.out.println("Principal is "+calprin());
         break;
         
    	 case 7:
         System.out.println("Principal is "+calPrin());
         break;
     
    	 case 8:
         System.out.println("Principal is "+calAmt());
         break;
         
         default:
         System.out.println("Invalid press");
         
     }
     
     
       
    	
    }
    
    //1
     public static float calSi(){
    	Scanner scn=new Scanner(System.in);
    	
    	float r,si=0,p,t;
     	

     	try{
     	System.out.println("Enter number of costumer: ");
        int n =scn.nextInt();
        
        for(int i=1 ;i<=n ;i++){
        System.out.println("Enter principal: ");
         p=scn.nextFloat();
        System.out.println("Enter rate: ");
         r=scn.nextFloat();
         r=r/100;
        System.out.println("Enter time: ");
         t=scn.nextFloat();
        	
         si=(p*r*t)/100;	
        }
     	
     	 
     	 }
    	 catch(Exception e) {
    		 System.out.println(e);
    	 }
    	 return si;
    } 
    
    //2
    static float calRate(){
    	Scanner scn=new Scanner(System.in);
    	
    	float r=0.0f,si,p,t;
    	
    	    	
    	try {
    		System.out.println("Enter number of costumer: ");
            int n =scn.nextInt();
            
            for(int i=1 ;i<=n ;i++){
            System.out.println("Enter principal: ");
             p=scn.nextFloat();
            System.out.println("Enter intrest: ");
             si=scn.nextFloat();
            System.out.println("Enter time: ");
             t=scn.nextFloat();
               	
             r=(si*100)/(p*t);
             
            }
        }
    	catch(Exception e) {
    		System.out.println(e);
    	}
    	return r;
    } 
    
    //3
    static float calTime(){
    	Scanner scn=new Scanner(System.in);
    	
    	float r,si,t=0.0f,p;
    	
    	
    	try {
    		System.out.println("Enter number of costumer: ");
            int n =scn.nextInt();
            for(int i=1;i<=n;i++){}

    	System.out.println("Enter principal: ");
       	 p=scn.nextFloat();
       	System.out.println("Enter intrest: ");
       	 si=scn.nextFloat();
       	System.out.println("Enter rate: ");
       	 r=scn.nextFloat();
       	 r=r/100;
       	
       	t=((si*100)/(p*r));	
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    	return t;
    } 
    
    //4
    static float calPri(){
    	Scanner scn=new Scanner(System.in);
    	
    	float t,p=0.0f,r,si;
    	
    	
    	try {
    		System.out.println("Enter number of costumer: ");
            int n =scn.nextInt();
            for(int i=1;i<=n;i++){}

    	System.out.println("Enter time: ");
       	 t=scn.nextFloat();
       	System.out.println("Enter intrest: ");
       	 si=scn.nextFloat();
       	System.out.println("Enter rate: ");
       	 r=scn.nextFloat();
       	 r=r/100;
       	
       	 p=((si*100)/(t*r));	
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    	return p;
    } 
    
    //5
    static float calAmnt(){
    	Scanner scn=new Scanner(System.in);
    	
    	float a=0.0f,si,p;
    
    	try {
    		System.out.println("Enter number of costumer: ");
            int n =scn.nextInt();
            
            for(int i=1;i<=n;i++){
            System.out.println("Enter principal: ");
             p=scn.nextFloat();
            System.out.println("Enter intrest: ");
             si=scn.nextFloat();
              	 
             a=p+si;
            }
    	}
    	catch(Exception e) {
   		 System.out.println(e);
   	 }
    	return a;
    } 
    
  //6
    static float calprin(){
    	Scanner scn=new Scanner(System.in);
    	
    	float r,p=0.0f,a,t;
    	
    	
    	try {
    		System.out.println("Enter number of costumer: ");
            int n =scn.nextInt();
            
            for(int i=1;i<=n;i++){
            	
            System.out.println("Enter time: ");
             t=scn.nextFloat();
            System.out.println("Enter rate: ");
             r=scn.nextFloat();
             r=r/100;
            System.out.println("Enter amount: ");
             a=scn.nextFloat();
              	
             p=((a*100)/(100+(t*r)));	
            }

    	
    	}catch(Exception e) {
    		System.out.println(e);
    	}return p;
    } 
     
  //7
    static float calPrin(){
    	Scanner scn=new Scanner(System.in);
    	
    	float p=0.0f,si,a;
    	
    	

    	 try {
    		 System.out.println("Enter number of costumer: ");
    	        int n =scn.nextInt();
    	        
    	        for(int i=1;i<=n;i++){
    	        	
    	     System.out.println("Enter intrest: ");
    	      si=scn.nextFloat();
    	     System.out.println("Enter amount: ");
    	      a=scn.nextFloat();
    	       	    	
    	      p=(a-si);        	
    	        }

    	    		 
    	 }catch(Exception e) {
     		System.out.println(e);
     	}
    	return p;
    } 

   //8
    static float calAmt(){
    	Scanner scn=new Scanner(System.in);
    	
    	float a=0.0f,p,t,r;
    	
    	
    	 try {
    		 System.out.println("Enter number of costumer: ");
    	        int n =scn.nextInt();
    	        for(int i=1;i<=n;i++){
    	        	
    	     System.out.println("Enter rate: ");
    	        r=scn.nextFloat();
    	     System.out.println("Enter time: ");
    	        t=scn.nextFloat();
    	     System.out.println("Enter principal: ");
    	        p=scn.nextFloat();
    	            	
    	        a=p*(100+(t*r))/100;        	
    	        }

       	 
    	 }catch(Exception e) {
     		System.out.println(e);
     	}
    	return a;
    	
    }   
    
}

 
 