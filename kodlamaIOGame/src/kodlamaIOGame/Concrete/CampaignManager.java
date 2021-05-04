package kodlamaIOGame.Concrete;

import kodlamaIOGame.Abstract.CampaignService;
import kodlamaIOGame.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " silindi");
		
	}

	@Override
	public void uptade(Campaign campaign) {
		System.out.println(campaign.getName() + " güncellendi");
		
	}

}
