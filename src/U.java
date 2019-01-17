
public class U extends DecoratorTags {
	private Tag baseTag;

	public U(Tag tag) {
		baseTag=tag;
	}
	
	
	public String getTag() {
		 return "<u>"+baseTag.getTag()+"</u>";
	}
}
