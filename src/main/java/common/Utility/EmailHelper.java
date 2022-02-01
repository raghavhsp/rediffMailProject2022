package common.Utility;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.testng.annotations.Test;

public class EmailHelper {
	GenericHelper objGenericHelper = new GenericHelper();
	LogHelper objLogHelper = new LogHelper();
	org.apache.log4j.Logger Log = objLogHelper.getLogger(getClass());
	@Test
	public void SendEmailReport() {
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.socketFactory.port", "465");
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.port", "465");
		
		Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication("raghavtestingacc@gmail.com", "Gagu255245@");
			}

		});

		try {

			// Create object of MimeMessage class
			Message message = new MimeMessage(session);

			// Set the from address
			message.setFrom(new InternetAddress("raghavtestingacc@gmail.com"));

			// Set the recipient address
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("raghavhsp@protonmail.com"));

			// Add the subject link
			message.setSubject("NEW TEST REPORT EMAIL");

			// Create object to add multimedia type content
			BodyPart messageBodyPart1 = new MimeBodyPart();

			// Set the body of email
			messageBodyPart1.setText("PFA the new test emails generated at :"+objGenericHelper.convertDateTimeToString());

			// Create another object to add another content
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();

			// Mention the file which you want to send
			String filename = "G:\\Automation_Projects\\test-output\\emailable-report.html";

			// Create data source and pass the filename
			DataSource source = new FileDataSource(filename);

			// set the handler
			messageBodyPart2.setDataHandler(new DataHandler(source));

			// set the file
			messageBodyPart2.setFileName(filename);

			// Create object of MimeMultipart class
			Multipart multipart = new MimeMultipart();

			// add body part 1
			multipart.addBodyPart(messageBodyPart2);

			// add body part 2
			multipart.addBodyPart(messageBodyPart1);

			// set the content
			message.setContent(multipart);

			// finally send the email
			Transport.send(message);

			System.out.println("=====Email Sent=====");

		} catch (MessagingException e) {
			Log.info(e.getMessage());
			throw new RuntimeException(e);

		}
		
	}
}
