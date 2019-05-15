abstract class Item
{
	public abstract int id_getter();
	public abstract void id_setter(int id);
	public abstract int cpoies_getter();
	public abstract void copies_setter(int copies);
	public abstract String title_getter();
	public abstract void title_setter(String title);
	public abstract void check_in();
	public abstract void check_out();
	public abstract void print();
}

class Library extends Item
{
	private int idno, totalcopy;
	private String title, checkin, checkout;

	Library( int idno, int totalcopy, String title)
	{
		this.idno = idno;
		this.totalcopy = totalcopy;
		this.title = title;
	}

	public int id_getter(){
		return idno;
	}
	public void id_setter(int id)
	{
		idno = id;
	}
	public int cpoies_getter()
	{
		return totalcopy;
	}
	public void copies_setter(int copies)
	{
		totalcopy = copies;
	}
	public String title_getter()
	{
		return title;
	}
	public void title_setter(String title)
	{
		this.title = title;
	}
	public void check_in()
	{
		System.out.println("Checked In");
	}
	public void check_out()
	{
		System.out.println("Checked Out");
	}

	public void print()
	{
		System.out.println("Enter your choice to print:");
		System.out.println("1. Title \n 2. Number of copies \n 3. Identification Number");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1: System.out.println("Title: "+title); break;
			case 2: System.out.println("Number of copies: "+totalcopy); break;
			case 3: System.out.println("Identification Number: "+idno); break;
			default: System.out.println("Enter appropriate choice:");
		}

	}
} 


class WrittenItem extends Item{
	private int idno, totalcopy;
	private String title; 
	String author_name;


	WrittenItem( int idno, int totalcopy, String title, String author_name)
	{
		this.idno = idno;
		this.totalcopy = totalcopy;
		this.title = title;
		this.author_name = author_name;
	}

	public String get_author_name(){
		return author_name;
	}
	public void set_author_name(String author_name)
	{
		this.author_name = author_name;
	}	

	public int id_getter(){
		return idno;
	}
	public void id_setter(int id)
	{
		idno = id;
	}
	public int cpoies_getter()
	{
		return totalcopy;
	}
	public void copies_setter(int copies)
	{
		totalcopy = copies;
	}
	public String title_getter()
	{
		return title;
	}
	public void title_setter(String title)
	{
		this.title = title;
	}
	public void check_in()
	{
		System.out.println("Checked In");
	}
	public void check_out()
	{
		System.out.println("Checked Out");
	}

	public void print()
	{
		System.out.println("Enter your choice to print:");
		System.out.println("1. Title \n 2. Number of copies \n 3. Identification Number");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1: System.out.println("Title: "+title); break;
			case 2: System.out.println("Number of copies: "+totalcopy); break;
			case 3: System.out.println("Identification Number: "+idno); break;
			default: System.out.println("Enter appropriate choice");
		}

	}
}

class Books extends WrittenItem
{
	Books(int identification_number, int number_of_copies, String title, String author_name)
	{
		super(identification_number, number_of_copies, title, author_name);
	}
}

class Journal extends WrittenItem
{
	private String year_published;

	Journal(int identification_number, int number_of_copies, String title, String author_name, String year_published)
	{
		super(identification_number, number_of_copies, title, author_name);
		this.year_published = year_published;
	}

	public String get_year_published(){
		return year_published;
	}
	public void set_year_published(String year_published)
	{
		this.year_published = year_published;
	}	

}

class Myclass
{
	public static void main(String[] args) {
		Library l =new Library(101,60,"Wings of fire");
		Library l =new Library(105,70,"Harry Potter");
		l.print();
		WrittenItem wi = new WrittenItem(101,60,"Wings of fire","Abdul Kalam");
		WrittenItem wi = new WrittenItem(105,70,"Harry Potter","JK Rowling");
		System.out.println(wi.get_author_name());
	}
}