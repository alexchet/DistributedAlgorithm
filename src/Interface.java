import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Common.*;

public class Interface {
	public static void MainMenu() throws IOException, InterruptedException {
		System.out.println("****************************************");
		System.out.println("*** CSC8103 - Distributed Algorithms ***");
		System.out.println("****************************************");
		System.out.println("");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Choose: ");
		System.out.println("1: Wave Algorithm");
		System.out.println("2: Election Algorithm");
        try{
            int algorithmChosen = Integer.parseInt(br.readLine());
            
            switch (algorithmChosen) {
	            case 1:
	        		System.out.println("************ Wave Algorithm ************");
	            	break;
	            case 2:
	        		System.out.println("********** Election Algorithm **********");
	            	break;
            	default:
            		break;
            }
            
            treeMenu(algorithmChosen);
            
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
	}
	
	public static void treeMenu(int algorithmChosen) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Choose: ");
		System.out.println("1: Balanced Tree");
		System.out.println("2: Un-balanced Tree");
		System.out.println("3: Arbitrary Tree");
		System.out.println("4: Go Back");
		try{
            int treeChoosen = Integer.parseInt(br.readLine());
            Wave wave = new Wave();
            Election election = new Election();
            Tree tree = null;
            
            switch (treeChoosen) {
	            case 1:
	        		System.out.println("************ Balanced Tree *************");
	        		tree = new Tree();
	        		tree.generateRandomTree(7, 2, 2);
	            	break;
	            case 2:
	        		System.out.println("********** Un-balanced Tree ************");
	        		tree = new Tree();
	        		tree.generateRandomTree(7, 1, 2);
	            	break;
	            case 3:
	        		System.out.println("************ Arbitrary Tree ************");
	        		tree = new Tree();
	        		tree.generateRandomTree(7, 0, 6);
	            	break;
	            case 4:
	        		MainMenu();
	            	break;
            	default:
            		break;
            }           
            
            if (algorithmChosen == 1) {
            	wave.algorithm(tree.getNodesArr());
            } else {
            	election.algorithm(tree.getNodesArr());
            }
            
            System.out.println("");
            System.out.println("***************** End ******************");
            System.out.println("");
            MainMenu();
            
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
	}
}
