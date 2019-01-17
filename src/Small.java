
public class Small extends DecoratorTags {
	private Tag baseTag;

	public Small(Tag tag) {
		baseTag=tag;
	}
	
	
	public String getTag() {
		 return "<small>"+baseTag.getTag()+"</small>";
	}
}
