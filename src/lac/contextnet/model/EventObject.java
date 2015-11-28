package lac.contextnet.model;

import java.io.Serializable;

public class EventObject implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String context;
	private String source;
	
	public EventObject(String n, String c, String s)
	{
		name = n;
		context = c;
		source = s;
	}
	
	public String toString()
	{
		return name + " (" + context + ") from " + source;
	}

	public String getName() {
		return name;
	}
	
	public String getContext() {
		return context;
	}
	
	public String getSource() {
		return source;
	}
}