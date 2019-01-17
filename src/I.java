
public class I extends DecoratorTags {
	private Tag baseTag;

	public I(Tag tag) {
		baseTag=tag;
	}
	
	
	public String getTag() {
		 return "<i>"+baseTag.getTag()+"</i>";
	}
}
