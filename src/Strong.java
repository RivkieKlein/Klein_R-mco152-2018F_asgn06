
public class Strong extends DecoratorTags {
	private Tag baseTag;

	public Strong(Tag tag) {
		baseTag=tag;
	}
	
	
	public String getTag() {
		 return "<strong>"+baseTag.getTag()+"</strong>";
	}
}
