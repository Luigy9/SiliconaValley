package dadSiliconaPackage;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnviarCorreo {
	

	
	@RequestMapping(value = "/correopdf")
	public ResponseEntity<String> sendEmail(){

		try
        {
            // Propiedades de la conexión
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");

            // Preparamos la sesion
            Session session = Session.getDefaultInstance(props);

            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("siliconavalleyprueba@gmail.com"));
            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress("jaime-raf_95@hotmail.com"));
            message.setSubject("Hola");
            message.setText(
                "Mensaje con Java Mail");

            // Lo enviamos.
            Transport t = session.getTransport("smtp");
            t.connect("jaime-raf_95@hotmail.com", "masterdecifuentes1");
            t.sendMessage(message, message.getAllRecipients());

            // Cierre.
            t.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
			return new ResponseEntity<>("OK",HttpStatus.ACCEPTED);
		}
		
	
}
