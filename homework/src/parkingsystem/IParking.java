package parkingsystem;

import java.util.ArrayList;

public interface IParking {
	
	public void print();
	
	public boolean addCar(int carType);
	
	public static IParams parse() throws Exception{
		return new IParams() {
			
			@Override
			public int getSmall() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public ArrayList<Integer> getPlanParking() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getMedium() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getBig() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
	
}
