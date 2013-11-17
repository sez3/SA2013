package at.ac.tuwien.am.client;

import at.ac.tuwien.am.interfaces.MessageIntf;
import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

public class MessageSender
	extends AbstractMyxSimpleBrick
{
	public static final IMyxName MESSAGE_NAME = MyxUtils.createName( "messages" );
	
	@Override
	public void begin()
	{
			super.begin();
			
			// get the service object
			MessageIntf messages = (MessageIntf) MyxUtils.getFirstRequiredServiceObject( this, MESSAGE_NAME );
			
			// do something with it
			messages.processMessage( "Hello World!" );
	}
	
	public Object getServiceObject( IMyxName interfaceName )
	{
		// TODO: Auto-generated method stub
		return null;
	}
}
