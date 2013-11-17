package at.ac.tuwien.am.peer;

import at.ac.tuwien.am.interfaces.MessageIntf;
import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;


public class MessageReceiver
	extends AbstractMyxSimpleBrick
	implements MessageIntf
{
	public static final IMyxName MESSAGE_NAME = MyxUtils.createName( "messages" );
	
	public void processMessage( String message )
	{
		System.err.println( "Received: " + message );
	}
	
	public Object getServiceObject( IMyxName interfaceName )
	{
		// TODO Auto generated stub
		if( interfaceName.equals( MESSAGE_NAME ) )
		{
			return this;
		}

		return null;
	}
}
