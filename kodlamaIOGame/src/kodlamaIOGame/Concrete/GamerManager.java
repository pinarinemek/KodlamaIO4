package kodlamaIOGame.Concrete;

import kodlamaIOGame.Abstract.GamerService;
import kodlamaIOGame.Entities.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		if(gamer.getFirstName()!=null && gamer.getLastName()!=null && gamer.getNationalityId()!=null) {
			System.out.println(gamer.getFirstName() + " "+gamer.getLastName()+ " eklendi");
		}
		else {
			System.out.println("kullanýcý bilgileri yetersizdir.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " "+gamer.getLastName()+ " silindi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " "+gamer.getLastName()+ " güncellendi");
		
	}

}
