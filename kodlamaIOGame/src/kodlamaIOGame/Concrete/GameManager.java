package kodlamaIOGame.Concrete;

import kodlamaIOGame.Abstract.GameService;
import kodlamaIOGame.Entities.Campaign;
import kodlamaIOGame.Entities.Game;
import kodlamaIOGame.Entities.Gamer;

public class GameManager implements GameService  {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " güncellendi");
		
	}

	@Override
	public void sold(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() +" "+ campaign.getName() +" kampanyasýndan yararlanarak " + game.getPriceAfterDiscountRate() +" tl fiyata "+ game.getName() + " oyununu aldý.");
	}

	

}
