public Class book
{
	private String name;
	private int id;
}

public void setName(String name)
{
	this.name = name;
	System.out.println("Book name is set : ");
}

public void setId(int id)
{
	this.id =  id;
	System.out.println("Book is is set");
}

public String getName()
{
	return name;
}

public int id()
{
	return id;
}