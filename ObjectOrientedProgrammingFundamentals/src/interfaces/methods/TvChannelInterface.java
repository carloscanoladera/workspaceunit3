package interfaces.methods;
public interface TvChannelInterface {
	public int getChannel();
	public void setChannel(int channel);
	default void upChannel() {
	  setChannel(getChannel()+1);
	}
	default void downChannel() {
	  int currentChannel=getChannel();
	  if (currentChannel>0) { 
	    setChannel(getChannel()-1);
	  } else {
	    setChannel(0);
	  }   
	}
	
	static void changeChannelOutput() {
		
		System.out.println("Change Channel");
	}
	
	
}