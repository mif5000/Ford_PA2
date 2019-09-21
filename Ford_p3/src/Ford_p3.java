import java.util.Scanner;

public class Ford_p3{

	public static final String[] topics = {"Politics", "Global Warming", "World Hunger", "Video Games", "Culture Disputes"};

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int [] [] response = new int[5][11];
        int rating;
        int users = 0; 
        int input;
        System.out.println("Press 1 to add another user, and press 2 to show poll results");
        input = scnr.nextInt();
        
        
        users = 0;
        while(input != 2){
         
        if(input == 1){
        users++;
        }
        else{
        System.out.println("Wrong choice");
        break;
        }    
            
          System.out.println("Response to each question with a rating between 1-10");
		 System.out.println("What are your thoughts on Politics?");
        rating = scnr.nextInt();
        response[0][rating]++; 
        
        System.out.println("What are your thoughts on Global Warming?");
        rating = scnr.nextInt();
        response[1][rating]++; 
        
        System.out.println("What are your thoughts on World Hunger?");
        rating = scnr.nextInt();
        response[2][rating]++;
        
        System.out.println("What are your thoughts on Video Games?");
        rating = scnr.nextInt();
        response[3][rating]++;
        
        System.out.println("What are your thoughts on Culture Divisions?");
        rating = scnr.nextInt();
        response[4][rating]++;
        
        System.out.println("Press 1 to add another user, and press 2 to show poll results");
        input = scnr.nextInt();
           
        }
     int sum1=0;
     int sum2=0;
     int sum3=0;
     int sum4=0;
     int sum5=0;
           
            int i;
            for (i = 1; i < 10; i++){
                   sum1 += (response[0][i]) * i;
            }
            for (i = 1; i < 10; i++){
                   sum2 += (response[1][i]) * i;
            }
            for (i = 1; i < 10; i++){
                   sum3 += (response[2][i]) * i;
            }
            for (i = 1; i < 10; i++){
                   sum4 += (response[3][i]) * i;
            }
            for (i = 1; i < 10; i++){
                   sum5 += (response[4][i]) * i;
            }
                            
                           
     double avg1 = sum1 / users;
     double avg2 = sum2 / users;
     double avg3 = sum3 / users;
     double avg4 = sum4 / users;
     double avg5 = sum5 / users;
              
     System.out.printf("                 1 2 3 4 5 6 7 8 9 10 | Avg");
        System.out.printf("\n-----------------------------------------------");
        System.out.printf("\nPolitics         %d %d %d %d %d %d %d %d %d %d | %.2f", response[0][1], response[0][2], response[0][3], response[0][4], response[0][5], response[0][6], response[0][7], response[0][8], response[0][9], response[0][10], avg1);
        System.out.printf("\nGlobal Warming   %d %d %d %d %d %d %d %d %d %d | %.2f", response[1][1], response[1][2], response[1][3], response[1][4], response[1][5], response[1][6], response[1][7], response[1][8], response[1][9], response[1][10], avg2);
        System.out.printf("\nWorld Hunger     %d %d %d %d %d %d %d %d %d %d | %.2f", response[2][1], response[2][2], response[2][3], response[2][4], response[2][5], response[2][6], response[2][7], response[2][8], response[2][9], response[2][10], avg3);
        System.out.printf("\nVideo Games      %d %d %d %d %d %d %d %d %d %d | %.2f", response[3][1], response[3][2], response[3][3], response[3][4], response[3][5], response[3][6], response[3][7], response[3][8], response[3][9], response[3][10], avg4);
        System.out.printf("\nCulture Disputes %d %d %d %d %d %d %d %d %d %d | %.2f", response[4][1], response[4][2], response[4][3], response[4][4], response[4][5], response[4][6], response[4][7], response[4][8], response[4][9], response[4][10], avg5);
                            
	}

}
