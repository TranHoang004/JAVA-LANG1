package cpm.gpcoder;

public class MyDog {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Tiffany","Border Collie");
		Dog dog2 = new Dog("Max","English Mastiff");
		System.out.println(dog1.getName()+" is " + dog1.getBreed());
		System.out.println(dog2.getName()+" is " + dog2.getBreed());
	}
}
