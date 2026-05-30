interface Notify
{
	void sendmsg(String msg);
}

class MobileNotify implements Notify
{
	public void sendmsg(String msg)
	{
		System.out.println("Mobile notification  "+msg);
	}
}
class EmailNotify implements Notify
{
	public void sendmsg(String msg)
	{
		System.out.println("Email notification  "+msg);
	}
}
class InstaNotify implements Notify
{
	public void sendmsg(String msg)
	{
		System.out.println("Instagram notification  "+msg);
	}
}
class WhatsappNotify implements Notify
{
	public void sendmsg(String msg)
	{
		System.out.println("Whatsapp notification  "+msg);
	}
}
class JobNotify implements Notify
{
	public void sendmsg(String msg)
	{
		System.out.println("Job notification  "+msg);
	}
}
class Notification
{
	public static void main(String[] args)
	{
		MobileNotify m=new MobileNotify();
		EmailNotify e=new EmailNotify();
		InstaNotify i=new InstaNotify();
		WhatsappNotify w=new WhatsappNotify();
		JobNotify j=new JobNotify();
		m.sendmsg("You have a new msg");
		e.sendmsg("You have a new mail");
		i.sendmsg("send you a reel");
		w.sendmsg("Voice call or video call");
		j.sendmsg("New job application on domain....");
	}
}