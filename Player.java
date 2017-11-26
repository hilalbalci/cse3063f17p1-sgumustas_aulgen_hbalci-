public class Player {
<<<<<<< HEAD
    private int tournamentID = 0, id, location = 0, movement = 0, previousLocation = 0, jailHolder = 0, doubles = 0;
    private String name;
    private Money money = new Money();
    private boolean status = false, isInPrison = false;
    Die die = new Die();

    public Player(int id, String name, int startMoney) {
        this.id = id;
        this.name = name;
        this.money.setMoneyValue(startMoney);
    }

    public int doubles() {
        return doubles;
    }

    public void increaseDouble() {
        doubles++;
    }

    public void setDoubleZero() {
        doubles = 0;
    }

    public int getMovement() {
        return movement;
    }

    public void sendToJail(Square[] a) {
        Printer.print("[Turn " + (this.getMovement() + 1) + "]\t[" + a[this.getPreviousLocation()].getName() + "]\t" + "[TL"
                + this.getMoney().getMoney() + "]\t" + this.getName() +
                " goes to Jail!", true);
        this.setLocation(10);
        isInPrison = true;
    }

    public void getOutOfJail() {
        isInPrison = false;
        jailHolder = 0;
        doubles = 0;
    }

    public boolean isInJail() {
        return isInPrison;
    }

    public int tossSingleDie() {
        return die.getDiceValue();
    }

    public void setTournamentID(int tournamentID) {
        this.tournamentID = tournamentID;
    }

    public int getTournamentID() {
        return tournamentID;
    }

    public int getPreviousLocation() {
        return previousLocation;
    }

    public void setPreviousLocation(int a) {
        previousLocation = a;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void reduceMoney(int a) {
        this.money.reduceMoney(a);
    }

    public void increaseMoney(int a) {
        this.money.increaseMoney(a);
    }

    public Money getMoney() {
        return this.money;
    }

    public void nextTurn() {
        movement++;
    }

    public void setLost(boolean a) {
        status = a;
    }

    public boolean hasLost() {
        return status;
    }

    public int jailHolder() {
        return jailHolder;
    }

    public void increaseJailHolder() {
        jailHolder++;
    }

}
=======
	private int tournamentID = 0, id, location = 0, movement = 0, previousLocation = 0;
	private String name;
	Money money = new Money();
	private boolean status = false;
	
	public Player (int id, String name) {
		this.name = name;
	}
	
	public int getMovement () {
		return movement;
	}
	
	public int getID() {
		return id;
	}
	
	public int tossDie (Player player, Square [] array) {
		int temp = player.getLocation(), dieValue1, dieValue2;
		Die die = new Die();
		dieValue1 = die.getDiceValue();
		dieValue2 = die.getDiceValue();
		System.out.println("[Turn " + (player.getMovement() + 1) + "] ["
				+ array[temp].getName() + "] [TL"
				+ player.getMoney().getMoney() + "] " + player.getName() + 
				" tossed " + dieValue1 + " and " + dieValue2 + " at total " + (dieValue1 + dieValue2) + ".");
		return dieValue1 + dieValue2;
	}
	
	public void setTournamentID (int tournamentID) {
		this.tournamentID = tournamentID;
	}
	
	public int getTournamentID () {
		return tournamentID;
	}
	
	public int getPreviousLocation () {
		return previousLocation;
	}
	
	public void setPreviousLocation (int a) {
		previousLocation = a;
	}
	
	public void setLocation (int location) {
		this.location = location;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLocation () {
		return location;
	}
	
	public String getName() {
		return name;
	}
	
	public void reduceMoney (int a) {
		this.money.reduceMoney(a);
	}
	
	public void increaseMoney (int a) {
		this.money.increaseMoney(a);
	}
	
	public Money getMoney() {
		return this.money;
	}
	
	public void nextTurn() {
		movement++;
	}
	
	public void setLost (boolean a) {
		status = a;
	}
	
	public boolean hasLost() {
		return status;
	}
}
>>>>>>> eafa3ad1d8f6dc5c8999e635de3730c7e86992c7
