package solutions2.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class JavaComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

class Checker implements Comparator<Player>{
	@Override
	public int compare(Player p1, Player p2) {
		if (p1.score==p2.score)
			return p1.name.compareTo(p2.name);	//ascending order of name
		return p2.score-p1.score;	//descending order of score. For ascending do p1.score-p2.score.
	}
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

//Rodney Shaghoulian
//The exact value that the compare function returns is not important. 
//It just has to return 0 if scores are equal, a negative number if p1 should be placed before p2 when sorting, and 
//a positive number if p2 should be placed before p1 when sorting.