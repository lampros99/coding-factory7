package gr.aueb.cf.ch18.mobileContact.dao;

import gr.aueb.cf.ch18.mobileContact.Model.MobileContact;

import java.util.List;

public interface IMobileContactDAO {
    MobileContact insert(MobileContact mobileContact);
    MobileContact update(Long id, MobileContact mobileContact);
    void deleteById(Long id);
    MobileContact getById(Long id);
    List<MobileContact> getAll();

    void deleteByPhoneNumber(String phoneNumber);

    MobileContact getByPhoneNumber(String phoneNumber);
    boolean userIdExists(Long id);
    boolean phoneNumberExist(String phoneNumber);

}
