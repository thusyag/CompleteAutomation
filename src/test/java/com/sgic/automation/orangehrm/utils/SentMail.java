//package com.sgic.automation.orangehrm.utils;
//
//import org.apache.commons.mail.*;
//
//import javax.activation.DataHandler;
//import javax.activation.DataSource;
//import javax.activation.FileDataSource;
//import javax.mail.*;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//import java.io.File;
//import java.util.Properties;
//
//public class SentMail  {
//    public static void SendEmail() throws Exception {
//// Create the attachment
//        EmailAttachment attachment = new EmailAttachment();
//        attachment.setPath("src"+ File.separator+"test"+ File.separator+"resources"+ File.separator+"reports"+File.separator+"ExtentReportResults.html");
//        attachment.setDisposition(EmailAttachment.ATTACHMENT);
//        attachment.setDescription("Report");
//        attachment.setName("Thusya");
//
////        // Create the email message
////        MultiPartEmail email = new MultiPartEmail();
////        email.setHostName("mail.google.com");
////        email.setSmtpPort(465);
////        email.addTo("gthusi5@gmail.com", "Thusya");
////        email.setFrom("gthusi5@gmail.com", "Me");
////        email.setSubject("The picture");
////        email.setMsg("Here is the picture you wanted");
////
////        // add the attachment
////        email.attach(attachment);
////
////
////        // send the email
////        email.send();
//
//        Email simpleEmail = new SimpleEmail();
//        simpleEmail.setHostName("smtp.gmail.com");
//        simpleEmail.setSmtpPort(465);
//        simpleEmail.setAuthenticator(new DefaultAuthenticator("thusy.jen@gmail.com", "56789thusy"));
//        simpleEmail.setSSLOnConnect(true);
//        simpleEmail.setFrom("gthusi5@gmail.com");
//        simpleEmail.setSubject("TestMail");
//        simpleEmail.setMsg("This is a test mail ... :-)");
//        simpleEmail.addTo("foo@bar.com");
//        simpleEmail.send();
//
//
//    }
//
//}
//

package com.sgic.automation.orangehrm.utils;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Properties;

public class SentMail  {
    public static void SendEmail() throws Exception {

        // Create object of Property file
        Properties props = new Properties();

        // this will set host of server- you can change based on your requirement
        props.put("mail.smtp.host", "smtp.gmail.com");

        // set the port of socket factory
        props.put("mail.smtp.socketFactory.port", "465");

        // set socket factory
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");

        // set the authentication to true
        props.put("mail.smtp.auth", "true");

        // set the port of SMTP server
        props.put("mail.smtp.port", "465");

        // This will handle the complete authentication
        Session session = Session.getDefaultInstance(props,

                new Authenticator() {

                    protected PasswordAuthentication getPasswordAuthentication() {

                        return new PasswordAuthentication("thusy.jen@gmail.com", "56789thusy");

                    }

                });

        try {

            // Create object of MimeMessage class
            Message message = new MimeMessage(session);

            // Set the from address
            message.setFrom(new InternetAddress("thusy.jen@gmail.com"));

            // Set the recipient address
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("jp.jen123@gmail.com,thusy.jen@gmail.com"));

            // Add the subject link
            message.setSubject("Testing Subject");

            // Create object to add multimedia type content
            BodyPart messageBodyPart1 = new MimeBodyPart();

            // Set the body of email
            messageBodyPart1.setText("This is message body");

            // Create another object to add another content
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();

            // Mention the file which you want to send
            String filename = "src"+ File.separator+"test"+ File.separator+"resources"+ File.separator+"reports"+File.separator+"ExtentReportResults.html";

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

            throw new RuntimeException(e);

        }

    }


}


