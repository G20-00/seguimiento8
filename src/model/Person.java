package model;

public class Person {
	private String id;
	private TypeDocuments typeId;
	public Person(String id1,String typeId) {
		id = id1;
		this.typeId=TypeDocuments.valueOf(typeId.toUpperCase());
	}
	
	public String getId() {
		return id;
	}

	public TypeDocuments getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId=TypeDocuments.valueOf(typeId.toUpperCase());
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
