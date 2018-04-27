package pkgCore;
import pkgEnum.eGameType;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;

public class GamePlayTest {

	private HashMap<UUID, Player> hashMap = new HashMap<UUID, Player>();
	@Test
	public void test() {
				
		Player player1 = new Player("Brendan", 1);
		Player player2 = new Player("Baz", 2);
		
		Table t = new Table();
		t.AddPlayerToTable(player1);
		t.AddPlayerToTable(player2);
		ArrayList<Player> playerArray = new ArrayList<>();
		playerArray.add(player1);
		playerArray.add(player2);
		t.CreateDeck(eGameType.BLACKJACK);
		GamePlayBlackJack gpbj = new GamePlayBlackJack(t);
		
		gpbj.AddPlayersToGame(playerArray);
		
		assertEquals(gpbj.GetPlayerInGame(player1), player1); 
		
		gpbj.RemovePlayerFromGame(player1);
		assertEquals(gpbj.GetPlayerInGame(player1), null);
	}

}