package kodlamaIOGame;

import kodlamaIOGame.Concrete.CampaignManager;
import kodlamaIOGame.Concrete.GameManager;
import kodlamaIOGame.Concrete.GamerManager;
import kodlamaIOGame.Entities.Campaign;
import kodlamaIOGame.Entities.Game;
import kodlamaIOGame.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1,"Pýnar","Ýnemek","12345678910","2001");
		Gamer gamer1 = new Gamer(2,"Alpay","Özer",null,"2002");
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer);
		gamerManager.add(gamer1);
		System.out.println("---------");
		Campaign campaign = new Campaign("black friday",2,10);
		Game game = new Game(1,"valorant",100,"silah",campaign);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.uptade(campaign);
		System.out.println("---------");
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.update(game);
		gameManager.sold(game, gamer1, campaign);
		
		

	}

}
