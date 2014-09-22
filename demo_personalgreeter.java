public class demo_personalgreeter{
    public static void main(String[]args){
	PersonalGreeter zulu;
	zulu = new PersonalGreeter();
	zulu.getGreeting();
	zulu.setGreeting("Good evening, Agent");
	System.out.println(zulu.getGreeting());
	zulu.setName("Sandvich");
	System.out.println(zulu.getName());
	System.out.println(zulu.greet());
    }
}
