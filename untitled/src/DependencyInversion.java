public class DependencyInversion {
//    class OrderService {
//        private final EmailSender emailSender = new EmailSender(); // Tight coupling ❌
//        private final SmsSender smsSender = new SmsSender(); // Tight coupling ❌
//
//        public void placeOrder(Order order) {
//            // Process order
//            orderRepository.save(order);
//
//            // Hard-coded notification logic
//            emailSender.send(order.getUserEmail(), "Order placed");
//            smsSender.send(order.getUserPhone(), "Order confirmed");
//        }
//    }

//    public interface NotificationChannel {
//        void send(Notification notification);
//        boolean supports(NotificationType type);
//    }

//    public class EmailNotificationChannel implements NotificationChannel {
//        private final JavaMailSender mailSender;
//
//        @Override
//        public void send(Notification notification) {
//            MimeMessage message = mailSender.createMimeMessage();
//            MimeMessageHelper helper = new MimeMessageHelper(message);
//            helper.setTo(notification.getRecipient());
//            helper.setSubject(notification.getSubject());
//            helper.setText(notification.getBody(), true);
//            mailSender.send(message);
//        }
//
//        @Override
//        public boolean supports(NotificationType type) {
//            return type == NotificationType.EMAIL;
//        }
//    }

//    public class SmsNotificationChannel implements NotificationChannel {
//        private final TwilioClient twilioClient;
//
//        @Override
//        public void send(Notification notification) {
//            Message.creator(
//                    new PhoneNumber(notification.getRecipient()),
//                    new PhoneNumber(fromNumber),
//                    notification.getBody()
//            ).create();
//        }
//
//        @Override
//        public boolean supports(NotificationType type) {
//            return type == NotificationType.SMS;
//        }
//    }

}
