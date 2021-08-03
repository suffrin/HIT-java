package project1;

import java.util.Properties;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class Email {
	public static void sendMail(String recepient) throws Exception {
		System.out.println("Preparing to send email....");
		Properties p = new Properties();  // to configure properties for mail..
		p.put("mail.smtp.auth", "true");	
		p.put("mail.smtp.starttls.enable", "true");
		p.put("mail.smtp.host", "suffrinbegam@gmail.com");
		p.put("mail.smtp.port","587");
		
		String myAccountEmail = "suffrinbegam@gmail.com";
		String password = "-------";
		     
		Session s = Session.getInstance(p,new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("suffrinbegam@gmail.com","------");
			}
		});
		Message message = prepareMessage(s, "suffrinbegam@gmail.com","recepient");
		
		Transport.send(message);
		System.out.println("Message sent sucessfully");
	}
	private static Message prepareMessage(Session s,String myAccountEmail,String recepient) {
		try {
		Message message=new MimeMessage(s);
		message.setFrom(new InternetAddress(myAccountEmail));
		message.setRecipient(Message.RecipientType.TO,new InternetAddress(recepient));
		message.setSubject("My first message from java api");
		message.setText("Hey there, \n look my email!");
		return message; 
		}
		catch(Exception ex) {
		Logger.getLogger(Email.class.getName()).log(Level.SEVERE,null,ex);
		}
		return null;
	}
}
