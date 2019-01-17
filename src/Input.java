
public class Input extends Tag {
	
	private String content;
	private String event;
	private String value;
	private String type;
	
	public void setEvent(String eventName, String event ) {
		event= eventName+"="+event;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Input(String content) {
		this.content=content;
	}
	
	public String getTag() {
		StringBuilder output= new StringBuilder();
		
		output.append("<input");
		if(name!=null) {
			output.append(" name="+name);
		}
		if(id!= null ) {
			output.append(" id="+id);
		}
		if(type!= null ) {
			output.append(" id="+id);
		}
		if(value!= null ) {
			output.append(" id="+id);
		}
		if(event!= null ) {
			output.append(" "+event);
		}
		
		output.append(">"+content+"</input>");
		
		return output.toString();
	}
	
	

}
