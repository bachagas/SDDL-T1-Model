package lac.contextnet.model;

import java.io.Serializable;

public class EventObject implements Serializable {

	private static final long serialVersionUID = 1L;
	private String m_name;
	private String m_context;
	
	public EventObject(String name, String context)
	{
		m_name = name;
		m_context = context;
	}
	
	public String toString()
	{
		return m_name + " (" + m_context + ")";
	}

	public String getName() {
		return m_name;
	}
	
	public String getContext() {
		return m_context;
	}
}