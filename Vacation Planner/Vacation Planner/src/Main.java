import java.util.*;
public class Main
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("***WELCOME TO YOUR VACATION PLANNER***");
		int choice,ch,x,cost=0,days,hotelcost=0,finalchoice;
		String des;
		System.out.println();
		System.out.println("Please Enter The Name Of Your Destination");
		des=sc.nextLine();
		System.out.println("Please Note That All Routes Will Be Planned From Chandigarh");
		System.out.println("Press 1 To Continue OR Press 0 to exit");
		choice=sc.nextInt();
		
		if(choice==1)
		{
			if(des.equals("andhra pradesh")||des.equals("Andhra Pradesh")||des.equals("Andhra pradesh")||des.equals("andhra Pradesh"))
			{
				System.out.println("Distance from Chandigarh To Andhra Pradesh is 2078 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=20780;
					if(x>=2&&x<=4)
						cost=2078*10*3;
					if(x>4&&x<=7)
						cost=2078*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			
			if(des.equals("arunachal pradesh")||des.equals("Arunachal Pradesh")||des.equals("Arunachal pradesh")||des.equals("arunachal Pradesh"))
			{
				System.out.println("Distance from Chandigarh To Arunachal Pradesh is 2767 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=27670;
					if(x>=2&&x<=4)
						cost=2767*10*3;
					if(x>4&&x<=7)
						cost=2767*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			if(des.equals("arunachal pradesh")||des.equals("Arunachal Pradesh")||des.equals("Arunachal pradesh")||des.equals("arunachal Pradesh"))
			{
				System.out.println("Distance from Chandigarh To Arunachal Pradesh is 2767 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=27670;
					if(x>=2&&x<=4)
						cost=2767*10*3;
					if(x>4&&x<=7)
						cost=2767*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			if(des.equals("arunachal pradesh")||des.equals("Arunachal Pradesh")||des.equals("Arunachal pradesh")||des.equals("arunachal Pradesh"))
			{
				System.out.println("Distance from Chandigarh To Arunachal Pradesh is 2767 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=27670;
					if(x>=2&&x<=4)
						cost=2767*10*3;
					if(x>4&&x<=7)
						cost=2767*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			if(des.equals("arunachal pradesh")||des.equals("Arunachal Pradesh")||des.equals("Arunachal pradesh")||des.equals("arunachal Pradesh"))
			{
				System.out.println("Distance from Chandigarh To Arunachal Pradesh is 2767 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=27670;
					if(x>=2&&x<=4)
						cost=2767*10*3;
					if(x>4&&x<=7)
						cost=2767*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			if(des.equals("arunachal pradesh")||des.equals("Arunachal Pradesh")||des.equals("Arunachal pradesh")||des.equals("arunachal Pradesh"))
			{
				System.out.println("Distance from Chandigarh To Arunachal Pradesh is 2767 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=27670;
					if(x>=2&&x<=4)
						cost=2767*10*3;
					if(x>4&&x<=7)
						cost=2767*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			
			
			if(des.equals("Assam")||des.equals("assam"))
			{
				System.out.println("Distance from Chandigarh To Assam is 2297 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=27670;
					if(x>=2&&x<=4)
						cost=2767*10*3;
					if(x>4&&x<=7)
						cost=2767*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			
			
			
			if(des.equals("Bihar")||des.equals("Bihar"))
			{
				System.out.println("Distance from Chandigarh To Bihar is 1385 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=13850;
					if(x>=2&&x<=4)
						cost=1385*10*3;
					if(x>4&&x<=7)
						cost=1385*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			
			
			
			if(des.equals("Chattisgarh")||des.equals("chattisgarh"))
			{
				System.out.println("Distance from Chandigarh To Chattisgarh is 1481 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=14810;
					if(x>=2&&x<=4)
						cost=1481*10*3;
					if(x>4&&x<=7)
						cost=1481*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			
			
			
			if(des.equals("Goa")||des.equals("goa"))
			{
				System.out.println("Distance from Chandigarh To Goa is 2112 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=21120;
					if(x>=2&&x<=4)
						cost=2112*10*3;
					if(x>4&&x<=7)
						cost=2112*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			
			
			
			if(des.equals("Gujarat")||des.equals("gujarat"))
			{
				System.out.println("Distance from Chandigarh To Gujarat is 1330 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=1330;
					if(x>=2&&x<=4)
						cost=1330*10*3;
					if(x>4&&x<=7)
						cost=1330*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			
			
			
			if(des.equals("jharkhand")||des.equals("Jharkhand"))
			{
				System.out.println("Distance from Chandigarh To Jharkhand is 1490 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=14900;
					if(x>=2&&x<=4)
						cost=1490*10*3;
					if(x>4&&x<=7)
						cost=1490*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			
			
			
			if(des.equals("arunachal pradesh")||des.equals("Arunachal Pradesh")||des.equals("Arunachal pradesh")||des.equals("arunachal Pradesh"))
			{
				System.out.println("Distance from Chandigarh To Arunachal Pradesh is 2767 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=27670;
					if(x>=2&&x<=4)
						cost=2767*10*3;
					if(x>4&&x<=7)
						cost=2767*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			
			
			
			if(des.equals("arunachal pradesh")||des.equals("Arunachal Pradesh")||des.equals("Arunachal pradesh")||des.equals("arunachal Pradesh"))
			{
				System.out.println("Distance from Chandigarh To Arunachal Pradesh is 2767 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=27670;
					if(x>=2&&x<=4)
						cost=2767*10*3;
					if(x>4&&x<=7)
						cost=2767*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			
			
			
			if(des.equals("arunachal pradesh")||des.equals("Arunachal Pradesh")||des.equals("Arunachal pradesh")||des.equals("arunachal Pradesh"))
			{
				System.out.println("Distance from Chandigarh To Arunachal Pradesh is 2767 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=27670;
					if(x>=2&&x<=4)
						cost=2767*10*3;
					if(x>4&&x<=7)
						cost=2767*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			
			
			
			if(des.equals("arunachal pradesh")||des.equals("Arunachal Pradesh")||des.equals("Arunachal pradesh")||des.equals("arunachal Pradesh"))
			{
				System.out.println("Distance from Chandigarh To Arunachal Pradesh is 2767 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=27670;
					if(x>=2&&x<=4)
						cost=2767*10*3;
					if(x>4&&x<=7)
						cost=2767*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			
			
			
			if(des.equals("arunachal pradesh")||des.equals("Arunachal Pradesh")||des.equals("Arunachal pradesh")||des.equals("arunachal Pradesh"))
			{
				System.out.println("Distance from Chandigarh To Arunachal Pradesh is 2767 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=27670;
					if(x>=2&&x<=4)
						cost=2767*10*3;
					if(x>4&&x<=7)
						cost=2767*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			
			
			
			if(des.equals("arunachal pradesh")||des.equals("Arunachal Pradesh")||des.equals("Arunachal pradesh")||des.equals("arunachal Pradesh"))
			{
				System.out.println("Distance from Chandigarh To Arunachal Pradesh is 2767 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=27670;
					if(x>=2&&x<=4)
						cost=2767*10*3;
					if(x>4&&x<=7)
						cost=2767*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
			
			
			
			
			
			
			if(des.equals("arunachal pradesh")||des.equals("Arunachal Pradesh")||des.equals("Arunachal pradesh")||des.equals("arunachal Pradesh"))
			{
				System.out.println("Distance from Chandigarh To Arunachal Pradesh is 2767 Kms");
				System.out.println();
				System.out.println("Press 1 for Road Route");
				System.out.println("Press 2 for Train Route");
				System.out.println("Press 3 for Airways");
				System.out.println("Press 4 to exit");
				ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Road Route involves Taxi");
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=27670;
					if(x>=2&&x<=4)
						cost=2767*10*3;
					if(x>4&&x<=7)
						cost=2767*6*10;
					System.out.println("Rs"+cost+" is the Taxi fare");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==2)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=6000;
					if(x>=2&&x<=4)
						cost=6000*3;
					if(x>4&&x<=7)
						cost=6000*6;
					System.out.println("Rs"+cost+" is the Train ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==3)
				{
					System.out.println("Please enter no. of people in trip");
					System.out.println("Note: Max people allowed is 7");
					x=sc.nextInt();
					if(x==1)
						cost=15000;
					if(x>=2&&x<=4)
						cost=15000*3;
					if(x>4&&x<=7)
						cost=15000*6;
					System.out.println("Rs"+cost+" Is the Aeroplane ticket cost");
					System.out.println("Please Enter no. of days  you wish to stay in hotel");
					System.out.println("Note: Maximum days to stay is 7");
					days=sc.nextInt();
					if(days==1)
						hotelcost=5000*x;
					if(days>=2&&days<=4)
						hotelcost=5000*x*days;
					if(days>4&&days<=7)
						hotelcost=5000*x*days;
					System.out.println("Rs"+hotelcost+" is the cost of hotel stay");
					int total=hotelcost+cost;
					System.out.println("Rs"+total+" is the total trip cost");
					System.out.println("Type 1 to confirm Or 0 to Exit");
					finalchoice=sc.nextInt();
					if(finalchoice==1)
						System.out.println("CONGRATULATIONS , YOUR TRIP IS BOOKED");
					if(finalchoice==0)
						System.out.println("THANK YOU FOR YOUR TIME");
				}
				if(ch==4)
				{
					System.out.println("THANK YOU FOR YOUR TIME");
				}
			}
		}
				
		
		 if(choice==0)
		{
			System.out.println("THANK YOU FOR YOUR TIME");
		}
		
	}

}
