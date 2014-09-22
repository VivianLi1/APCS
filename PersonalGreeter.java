public class PersonalGreeter{
    private String greeting,name,combined;

    public PersonalGreeter(String name, String greeting){
	setName(name);
	setGreeting(greeting);
    }

    public PersonalGreeter(String name){
	setName(name);
    }

    public PersonalGreeter(){
    }

    public String getGreeting(){
	 return greeting;
    }

    public void setGreeting(String greeting){
	this.greeting = greeting;
    }

    public String getName(){
	return name;
    }

    public void setName(String name){
	this.name = name;
    }

    public String greet(){
	combined = greeting + " " + name;
	return combined;
    }
}
