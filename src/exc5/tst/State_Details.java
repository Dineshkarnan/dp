package exc5.tst;


public class State_Details {
	public void southindia()
	{
		System.out.println("Dravidian Languages");
	}

	public void northindia()
	{
		System.out.println("Aryan Languages");
	}
	public static void main(String[] args) {
		State_Details sd = new State_Details();
		sd.southindia();
		sd.northindia();
		Language_Details ld = new Language_Details();
		ld.tamil();
		ld.english();
		ld.hindi();
	}
}
