package model;

public class Person {
	private String id;
	private String typeId;
	public Person(String id1,String type) {
		id = id1;
		typeId = type;
	}
	public String getTypeId() {
		return typeId;
	}
	public String getId() {
		return id;
	}
}
