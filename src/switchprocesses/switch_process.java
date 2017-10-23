package switchprocesses;

public class switch_process implements processes{
	public String action(){
		return null; 
	}
	public static void main(String[]args){
		ActionOne myThing1 = new ActionOne(); 
		ActionTwo myThing2 = new ActionTwo(); 
		ActionThree myThing3 = new ActionThree(); 
		ActionFour myThing4 = new ActionFour(); 
		int choice = 2; 
		if (choice == 1){
			System.out.println(myThing1.action()); 
		}
		else if(choice == 2){
			System.out.println(myThing2.action()); 
		}
		else if(choice == 3){
			System.out.println(myThing3.action()); 
		}
		else if(choice == 4){
			System.out.println(myThing4.action()); 
		}
	}

}
