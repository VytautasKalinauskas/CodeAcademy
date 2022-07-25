import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<T> {
	
	private String name;
	int won = 0;

	private ArrayList<T> members;
	
	
	public boolean addPlayer(T player) {
		members.add(player);
		System.out.println(((Player)player).getName() + " was picked for team " + name);
		
		return true;
		
	}

	public Team(String name) {
		
		this.name = name;
		this.members = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}

	public ArrayList<T> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<T> members) {
		this.members = members;
	}
	
	public void playMatch(Team<T> opponent, Integer ourScore, Integer theirScore) {
		
		if(ourScore > theirScore) {
			won++;
			return;
		}
		else if (ourScore == theirScore) {
			return;
		}
		else {
			opponent.playMatch(null, theirScore, ourScore);
		}
		
	}

	@Override
	public int compareTo(T o) {

	
	
		
		return 0;
	}
	
	public void getByHeight(Team<Player> team1) {
		
		if(members.size() > team1.getMembers().size()) {
			System.out.println("We have more players");
		}
		else if (members.size() == team1.getMembers().size()) {
			System.out.println("Both teams have equal amount of players");
		}
		else {
			System.out.println("They have more players");
		}
		
	}

	
	

}
