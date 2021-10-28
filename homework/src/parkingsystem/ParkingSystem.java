package parkingsystem;

public class ParkingSystem implements IParking {
	Integer bigPark,medPark,smallPark;
	
	public ParkingSystem(Integer big, Integer medium, Integer small) {
		// TODO Auto-generated constructor stub
		this.bigPark = big;
		this.medPark = medium;
		this.smallPark = small;
	}
	
	public boolean addCar(int carType) {
		switch(carType) {
		case 1:
			if(bigPark > 0) {
				bigPark--;
				return true;
			}else {
				break;
			}
		case 2:
			if(medPark > 0) {
				medPark--;
				return true;
			}else {
				break;
			}
		case 3:
			if(smallPark > 0) {
				smallPark--;
				return true;
			}else {
				break;
			}
		}
		return false;
	}
	
	public String[] parse(String input) {
		
		
		
		return new String[1];
	}
	
	public void print() {
		
	}


}
