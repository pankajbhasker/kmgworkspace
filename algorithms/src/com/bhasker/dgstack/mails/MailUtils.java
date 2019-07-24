package com.bhasker.dgstack.mails;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;


public class MailUtils {


    static String username = "<username>"; //replace this with a valid username
    static String password = "<password>"; //replace this with a valid password

    public static void main(String[] args)throws Exception{

        try{


            String host = "smtp.gmail.com"; //replace this with a valid host
            int smtpPort =    465; // 587 replace this with a valid port
            String from = "sendermail@mail.com"; //replace this with a valid email id
            String to = "reciever@mail.com"; //replace this with a valid email id
            String fileAttachment1 = "MailUtils.java"; // file to attach
            String fileAttachment2 = "/Users/pkpankajk/IdeaProjects/algorithms/algorithms.iml"; // file to attach

            Properties props = System.getProperties();
            props.put("mail.smtp.host", host); // Setup mail server
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", smtpPort);

//            props.put("mail.debug", "true");
//            props.put("mail.smtp.socketFactory.port", smtpPort);
//            props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
//            props.put("mail.smtp.socketFactory.fallback", "true");
//            props.put("mail.smtp.starttls.enable", "true");

            //  Session session = Session.getDefaultInstance(props); // Get session

            Session session = Session.getInstance(props, new javax.mail.Authenticator(){
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });
            MimeMessage message = new MimeMessage(session); // Define message
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Find Attachment"); // create the subject
            MimeBodyPart messageBodyPart = new MimeBodyPart(); //fill message
            messageBodyPart.setText("Welcome to JAVA Family"); // create the message part
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart); // Part two is attachment

            messageBodyPart = new MimeBodyPart();
            DataSource source1 = new FileDataSource(fileAttachment1);
            messageBodyPart.setDataHandler(new DataHandler(source1));
            messageBodyPart.setFileName(fileAttachment1.substring(4, fileAttachment1.length()));
            multipart.addBodyPart(messageBodyPart);

            messageBodyPart = new MimeBodyPart();
            DataSource source2 = new FileDataSource(fileAttachment2);
            messageBodyPart.setDataHandler(new DataHandler(source2));
            messageBodyPart.setFileName(fileAttachment2.substring(4, fileAttachment2.length()));
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            Transport.send(message);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}