
public class Em extends DecoratorTags {
	private Tag baseTag;

	public Em(Tag tag) {
		baseTag=tag;
	}
	
	
	public String getTag() {
		 return "<em>"+baseTag.getTag()+"</em>";
	}
}
