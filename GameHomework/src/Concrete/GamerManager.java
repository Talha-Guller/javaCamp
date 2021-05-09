package Concrete;

import Abstracts.GamerService;
import Enitities.Gamer;

public class GamerManager implements GamerService{

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu eklenmi�tir : " + gamer.getGamerFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silinmi�tir : " + gamer.getGamerFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu g�ncellenmi�tir : " + gamer.getGamerFirstName());
		
	}

}
