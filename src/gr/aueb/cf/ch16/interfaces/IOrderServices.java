package gr.aueb.cf.ch16.interfaces;

import java.time.LocalDateTime;

public interface IOrderServices {
    void insertOrder(String address, String lastname, String firstname, String phoneNumber,
                     LocalDateTime timestamp, String item, int quantity);

    void updateOrder(long id,String address, String lastname, String firstname, String phoneNumber,
                     LocalDateTime timestamp, String item, int quantity);

    void deleteOrder(Long id);
    String getOrder(Long id);
}
