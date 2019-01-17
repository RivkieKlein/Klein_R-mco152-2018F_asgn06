
public class A extends DecoratorTags {
	private Tag baseTag;
	private String href;

	public A(Tag tag) {
		baseTag=tag;
	}
	
	
	public String getTag() {
		if(href==null) {
		 return "<a>"+baseTag.getTag()+"</a>";
		}
		else {
			 return "<a "+"href="+href+">"+baseTag.getTag()+"</a>";
		}
	}
	
	public void setHref(String href) {
		this.href=href;
	}
	
}
