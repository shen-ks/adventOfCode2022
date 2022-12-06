import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class SupplyStacks {
public static void main(String[] args) {
	Stack[] stacks = new Stack[9];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the crate in each stack");
	for (int i = 0; i < 9; i++) {
		String line = sc.nextLine();
		String[] input = line.split(",");
		stacks[i] = new Stack();
		for (String s : input) {
			stacks[i].push(s);
		}
		System.out.println(stacks[i]);
		System.out.println(stacks[i].peek());
	}
	// method to read user input into a two-dimensional array list
	ArrayList<Integer> array_list_count = new ArrayList<>();
	ArrayList<Integer> array_list_source = new ArrayList<>();
	ArrayList<Integer> array_list_to = new ArrayList<>();
	
	int i=0;
	while (sc.hasNextLine()) {
		
		if (sc.hasNextInt()) {
			if(i==0){
				array_list_count.add(sc.nextInt());
				i++;
			}
			else if(i==1){
				array_list_source.add(sc.nextInt());
				i++;
			}
			else if(i==2){
				array_list_to.add(sc.nextInt());
				i=0;
			}
		
			
		}
		else if (sc.next().equals("EOR")) {
			sc.close();
			break;
		}
		
	}
	System.out.println(array_list_count);
	System.out.println(array_list_source);
	System.out.println(array_list_to);
			
		for(int j=0; j<array_list_count.size(); j++){
			for (int k = 0; k < 9; k++)
				if(stacks[k].isEmpty()){
					System.out.println("Stack is empty");
				}
				else{
					System.out.println("Before Move Stack " +k+ " is  "+ stacks[k].peek());
				}
	
			moveNElements(stacks[array_list_source.get(j)-1], stacks[array_list_to.get(j)-1], array_list_count.get(j));
			for (int k = 0; k < 9; k++)
				if(stacks[k].isEmpty()){
					System.out.println("Stack is empty");
				}
				else{
					System.out.println("After Move Stack " +k+ " is  "+ stacks[k].peek());
				}
		}
		
	
}
//method to move n elements from one stack to another
	//method to move n elements from one stack to another
public static void moveNElements(Stack source, Stack destination, int n) {
	Stack temp = new Stack();
	Stack temp2 = new Stack();
	if(n==1) {
		destination.push(source.pop());
	}
	else{
		for(int i=0; i<n; i++) {
		
			temp.push(source.pop());
			
		}
		for(int i=0; i<n; i++) {
			temp2.push(temp.pop());
			destination.push(temp2.pop());
		}
	}
}

}
