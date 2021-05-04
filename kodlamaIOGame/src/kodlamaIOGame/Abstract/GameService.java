package kodlamaIOGame.Abstract;

import kodlamaIOGame.Entities.Campaign;
import kodlamaIOGame.Entities.Game;
import kodlamaIOGame.Entities.Gamer;

public interface GameService {
	void add(Game game);
	void delete(Game game);
	void update(Game game);
	void sold(Game game, Gamer gamer, Campaign campaign);
	
}
