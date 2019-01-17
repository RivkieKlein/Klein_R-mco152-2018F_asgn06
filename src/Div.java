
public class Div extends Tag {
	private String content;
	
	public Div(String content) {
		this.content=content;
	}
	
	public String getTag() {
		StringBuilder output= new StringBuilder();
		
		output.append("<div");
		if(name!=null) {
			output.append(" name="+name);
		}
		if(id!= null ) {
			output.append(" id="+id);
		}
		output.append(">"+content+"<div>");
		
		return output.toString();
	}
}
