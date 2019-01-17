
public class TagTester {
	
	public static void main(String[]args) {
		Tag tag = new H("This is  program test");
		((H) tag).setNumber(2);
		System.out.println(tag.getTag());
		
		tag= new P("now lets test some more");
		tag.setID("test tag");
		System.out.println(tag.getTag());
		
		tag= new Small(tag);
		System.out.println(tag.getTag());
		
		tag=new I(tag);
		System.out.println(tag.getTag());
		
	}

}
