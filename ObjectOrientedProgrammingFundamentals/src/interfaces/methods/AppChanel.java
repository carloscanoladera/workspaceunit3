package interfaces.methods;

public class AppChanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SamsungTelevision tv= new SamsungTelevision(1);
		
		tv.downChannel();
		tv.upChannel();
		tv.setChannel(4);
		
		TvChannelInterface ct = tv;
		
		ct.setChannel(7);
		ct.downChannel();
		ct.upChannel();
		
		

	}

}
