
public class P extends Tag {
private String content;
	
	public P(String content) {
		this.content=content;
	}
	
	public String getTag() {
		StringBuilder output= new StringBuilder();
		
		output.append("<p");
		if(name!=null) {
			output.append(" name="+name);
		}
		if(id!= null ) {
			output.append(" id="+id);
		}
		output.append(">"+content+"<p>");
		
		return output.toString();
	}
}
