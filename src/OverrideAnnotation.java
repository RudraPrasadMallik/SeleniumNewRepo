
public class OverrideAnnotation {

		void draw()
		{
			System.out.println("I can't say");
		}
	}
class Rectangle extends OverrideAnnotation
{
	@Override
	void draw()
	{
	System.out.println("Drawing Rectangle");	
	
}
}
class square extends OverrideAnnotation		{
	@Override
	void draw()
	{
		System.out.println("drawing square");
	}
}




