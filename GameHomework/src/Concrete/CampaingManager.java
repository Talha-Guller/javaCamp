package Concrete;

import Abstracts.CampaignService;
import Enitities.Campaign;

public class CampaingManager implements CampaignService {

	@Override
	public void add(Campaign compaign) {
		System.out.println("Kampanyan�z eklenmi�tir : " + compaign.getCampanignName());
	}

	@Override
	public void delete(Campaign compaign) {
		System.out.println("Kampanyan�z silinmi�tir : " + compaign.getCampanignName());
		
	}

	@Override
	public void update(Campaign compaign) {
		System.out.println("Kampanyan�z g�ncellenmi�tir : " + compaign.getCampanignName());
		
	}

}
//