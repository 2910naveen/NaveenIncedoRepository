package date16112022;
//methodreferrence is not thing but we will create a method and provide it as a implementation referrence to 
//another method.
interface Messagable{
	Message getMessage(String msg);
}
class Message{
	Message(String msg)
	{
		System.out.println(msg);
	}
}
public class MethodReferenceToConstructor 
{
    public static void main(String args[])
    {
    	Messagable m = Message::new;
    	m.getMessage("hello");
    }
}
