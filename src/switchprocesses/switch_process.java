package switchprocesses;

public class switch_process implements processes{
	public String action(){
		return null; 
	}
	static instances myInstances = instances.TWO;
	public static void main(String[]args){
		ActionOne myInstance1 = null; 
		ActionTwo myInstance2 = null; 
		ActionThree myInstance3 = null; 
		ActionFour myInstance4 = null; 
		switch(myInstances){
			case ONE: 
				if(myInstance1 == null){
					myInstance1 = new ActionOne();
				}
				System.out.println("hello");
				break;
			case TWO: 
				if(myInstance2 == null){
					myInstance2 = new ActionTwo(); 
				}
				System.out.println("awww");
				break; 
			case THREE: 
				if(myInstance3 == null){
					myInstance3 = new ActionThree(); 
				}
				break;
			case FOUR: 
				if(myInstance4 == null){
					myInstance4 = new ActionFour(); 
				}
				break; 
		}
	}
}
