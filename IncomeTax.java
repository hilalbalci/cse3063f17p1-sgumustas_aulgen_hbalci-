public class IncomeTax extends Square {

<<<<<<< HEAD
    public IncomeTax(String name) {
        super(name, 0, 0);
    }

    @Override
    public void doAction(Player player, Board board) {
        int a = player.getMoney().getMoney(), b = a / 10;
        Printer.print(player, " will lose TL" + b + " by paying Income Tax!", board.squares);
        if (a - b >= 0 && a != 0) {
            player.reduceMoney(b);
            Printer.print(player, " has lost TL" + b + " by paying Income Tax!", board.squares);
        } else {
            Printer.print(player, " gives his all money because " + player.getName() + " doesn't have enough money for Income Tax!", board.squares);
            player.reduceMoney(a);
            player.setLost(true);
        }
    }
=======
	public IncomeTax(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction(Player player, Board board) {
		int a = player.getMoney().getMoney()/10;
		player.getMoney().reduceMoney(a);
	}

>>>>>>> eafa3ad1d8f6dc5c8999e635de3730c7e86992c7
}
