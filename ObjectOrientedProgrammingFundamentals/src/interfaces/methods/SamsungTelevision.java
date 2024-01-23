package interfaces.methods;

public class SamsungTelevision implements TvChannelInterface{

	private int channel=0;
	
	public SamsungTelevision() {
		
		
	}
	
	public SamsungTelevision(int channel) {
		this.channel=channel;
		
	}
	
	@Override
	public int getChannel() {
		// TODO Auto-generated method stub
		return channel;
	}

	@Override
	public void setChannel(int channel) {
		// TODO Auto-generated method stub
		
		TvChannelInterface.changeChannelOutput();
		this.channel=channel;
	}

}
