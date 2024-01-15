package com.togadiya.umang.service;

import com.togadiya.umang.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public String getStringService() {
        return "Umang Togadiya";
    }

    public UserModel getObjectService() {
        return new UserModel("Umang Togadiya", "umang@gmail.com");
    }

    public List<UserModel> getArrayService() {
        List<UserModel> userList = new ArrayList<>();

        // Add some sample data to the list
        userList.add(new UserModel("John", "john@gmail.com"));
        userList.add(new UserModel("Alice", "alice@gmail.com"));
        userList.add(new UserModel("Bob", "bob@gmail.com"));
        return userList;
    }
}
