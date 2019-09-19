import java.util.Scanner;

public class chaaban_p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] topic={"Football","Soccer","Basketball","Hockey","Chess"}; 
	       int[][] responses=new int[5][11];
	       for(int i=0;i<4;i++){
	           for(int j=1;j<=10;j++){
	               responses[i][j]=0; 
	           }
	       }
	       int peoples;
	       System.out.print("Enter the no. of people willing to Rate:"); 
	       Scanner sc=new Scanner(System.in);
	       peoples=sc.nextInt();
	       int i=1;
	       while(i<=peoples){
	           for(int j=0;j<5;j++){ //Taking vote about topic
	               System.out.print("P"+i+":"+topic[j]+":");
	               int x=sc.nextInt();
	               responses[j][x]=responses[j][x]+1;
	           }
	           i++;
	       }
	       System.out.println("Topic "+"  Total_Rating "+"  Avg_Rating");
	       int max_p=0,min_p=100000,max_topic=0,min_topic=0;
	       for(i=0;i<5;i++)
	       {
	           int total=0,count=0;
	           for(int j=1;j<=10;j++)
	           {
	               total=total+j*responses[i][j]; //Total Points
	               count=count+responses[i][j]; //Total Responses
	           }
	           if(max_p<total)
	           {  
	               max_p=total;
	               max_topic=i;
	           }
	           if(min_p>total)
	           {  
	               min_p=total;
	               min_topic=i;
	           }
	           System.out.println(topic[i]+"      "+total+"      "+(total+0.0)/count);
	       }
	       System.out.println("Topic with the highest point total was:");
	       System.out.println(topic[max_topic]+" with "+max_p + " point(s).");
	       System.out.println("Topic with the lowest point total was:");
	       System.out.println(topic[min_topic]+" with "+min_p + " point(s)");
		

	}

}
