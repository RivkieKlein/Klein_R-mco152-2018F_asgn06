
public class H extends Tag {
	private String content;
	private int number=0;
	
	public H(String content) {
		this.content=content;
		
	}
	
	public String getTag() {
		StringBuilder output= new StringBuilder();
		
		output.append("<h");
		if(number>0) {
			output.append(number);
		}
		if(name!=null) {
			output.append(" name="+name);
		}
		if(id!= null ) {
			output.append(" id="+id);
		}
		output.append(">"+content+"<h");
		if(number>0) {
			output.append(number);
		}
		output.append(">");
		
		return output.toString();
	}
	
	
	//throws illegal arg if not between 1 and 6
	public void setNumber(int number) {
		if(number>0&&number<7)
		this.number=number;
		
		else {
			throw new IllegalArgumentException("h tags can only have a number between 1 and 6");
		}
	}

}
