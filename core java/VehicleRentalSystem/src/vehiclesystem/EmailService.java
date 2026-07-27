package vehiclesystem;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailService {

    // Sender Email
    private static final String sender_mail = "shahinmomin010@gmail.com";

    // Gmail App Password
    private static final String sender_pass = "mquw hdur lnhu frrt";

    public static void sendBookingconfirmation(Vehicle vehicle, Customer customer) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Receiver Email ID: ");
        String receiver_mail = sc.next();

        String subject = "Vehicle Rental Confirmation";

        String msg = "Hello " + customer.getName()
                + "\n\nVehicle Booking Confirmed!"
                + "\nVehicle ID : " + vehicle.getVehicleid()
                + "\nRental Rate : " + vehicle.getRentalRate()
                + "\nRented Days : " + vehicle.getRentedDays()
                + "\nTotal Bill : "
                + (vehicle.getRentalRate() * vehicle.getRentedDays());

        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties,
                new Authenticator() {

                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(sender_mail, sender_pass);
                    }
                });

        try {

            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(sender_mail));

            message.setRecipient(
                    Message.RecipientType.TO,
                    new InternetAddress(receiver_mail));

            message.setSubject(subject);

            message.setText(msg);
            Transport.send(message);

            Transport.send(message);

            System.out.println("Email Sent Successfully.");

        } catch (MessagingException e) {

            System.out.println("Email Sending Failed.");

            e.printStackTrace();
        }
        System.out.println("Email send to"+receiver_mail);
    }
}