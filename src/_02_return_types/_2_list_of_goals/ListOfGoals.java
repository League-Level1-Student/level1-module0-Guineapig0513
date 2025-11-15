package _02_return_types._2_list_of_goals;



import javax.swing.JOptionPane;

public class ListOfGoals {
	static String listOfGoals ="";
	static int numberOfGoals = 0;
	
	public static void main(String[] args) {
		//1. Call the appropriate method to make your list of goals
		createListOfGoals();
		//2. Call the appropriate method to get your list of goals, 
		//   so you can use a pop-up to display them
		String list = getListOfGoals();
		JOptionPane.showMessageDialog(null, list);
		//3. Call the appropriate method to get the number of goals you entered,
		//   and using a pop-up display the number of goals
		int number = getNumberOfGoals();
		JOptionPane.showMessageDialog(null, "You have "+number+" goals! Keep (not) going! I hope you fai- I MEAN BE SUCCESSFUL HAHA");
		//4. Call the appropriate method to see if you put a lot of goals,
		//   if you did put a lot of goals use a pop-up to say "Wow that's a lot of goals! Awesome!"
		boolean toMany = isManyGoals();
		if(toMany) {
			JOptionPane.showMessageDialog(null, "Thats plenty of goals, give up :D *cutely gets shot*");
		}
	}
	
	static void createListOfGoals() {
		String input = "";
		while(true) {
			input = JOptionPane.showInputDialog("Enter a goal you will never reach but you have\n(Or click X to stop entering goals and realize you will never reach those goals)");
			if( input.equalsIgnoreCase("X") ) {
				break;
			}
			listOfGoals += input+ "\n";
			numberOfGoals++;
		}
	}
	
	static String getListOfGoals() {
		return listOfGoals;
	}
	
	static int getNumberOfGoals() {
		return numberOfGoals;
	}
	
	static boolean isManyGoals() {
		if( getNumberOfGoals() > 5) {
			return true;
		}
		return false;
	}
	
}
