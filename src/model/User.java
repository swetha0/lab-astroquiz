package model;

public class User
{
	private String name;
	private String number;
	private int age;
	private int height;
	private int weight;
	private String country;
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getNumber()
	{
		return this.number;
	}
	public void setNumber(String number)
	{
		this.number = number;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getHeight()
	{
		return this.height;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}
	public int getWeight()
	{
		return this.weight;
	}
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	public String getCountry()
	{
		return this.country;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public User (String name, String number, int age, int height, int weight, String country)
	{
		this.name = name;
		this.number = number;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.country = country;
	}
}