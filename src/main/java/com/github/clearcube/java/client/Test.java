package com.github.clearcube.java.client;

class Test {

	public static void main(String [ ] args) {
		
		Person person = new Person();
		person.setAge(34);
		person.setName("John");
		
		BsonConverter bsonConverter = new BsonConverter();
		byte[] bson = bsonConverter.toBson(person);
		Person myReturnPerson = (Person) bsonConverter.fromBson(bson, Person.class);
		
		System.out.println("Done");
	}
}


class Person {
	
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
