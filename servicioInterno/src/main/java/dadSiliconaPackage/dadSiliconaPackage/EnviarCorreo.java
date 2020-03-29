package dadSiliconaPackage;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnviarCorreo {
	

	
	@PostMapping(value = "/correopdf")
	public void sendEmail(@RequestBody String pedido){
		
		final String username = "siliconavalleyprueba@gmail.com";
        final String password = "masterdecifuentes1";
        String pedidoenviar = pedido.replace("[", "").replace("]", "");
        

		try
        {
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "465");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.socketFactory.port", "465");
	        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	        
	        Session session = Session.getInstance(props,
	                new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication(username, password);
	                    }
	                });

	        Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("jaime-raf_95@hotmail.com")
            );
            message.setSubject("Confirmación pedido SiliconaValley");
            message.setText("Gracias por tu pedido,"
                    + "\n\n Se ha realizado correctamente"
            		+ "\n\n " + pedidoenviar);

            Transport.send(message);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
			
		}
	
	@PostMapping(value = "/registroAPI")
	public void sendRegistro(){
		
		final String username = "siliconavalleyprueba@gmail.com";
        final String password = "masterdecifuentes1";

		try
        {
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "465");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.socketFactory.port", "465");
	        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	        
	        Session session = Session.getInstance(props,
	                new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication(username, password);
	                    }
	                });

	        Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("jaime-raf_95@hotmail.com")
            );
            message.setSubject("Registro en SiliconaValley");
            message.setText("Gracias por tu registro,"
                    + "\n\n Te has registrado correctamente");

            Transport.send(message);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
			
		}
		
	
}
