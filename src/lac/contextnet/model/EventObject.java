package lac.contextnet.model;

import java.io.Serializable;

public class EventObject implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String context;
	
	public EventObject(String n, String c)
	{
		name = n;
		context = c;
	}
	
	public String toString()
	{
		return name + " (" + context + ")";
	}

	public String getName() {
		return name;
	}
	
	public String getContext() {
		return context;
	}
}