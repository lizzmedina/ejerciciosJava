package org.example.ejerciciosPatronesSebastian.singleton;

import java.util.ArrayList;
import java.util.List;

public class UserRegistry {

    private List<User> users;
    private static UserRegistry instance;

    private UserRegistry() {
        users = new ArrayList<>();
    }
    public static UserRegistry getInstance() {
        if (instance == null) {
            instance = new UserRegistry();
        }
        return instance;
     }
     public void addUser(User user){
        users.add(user);
     }
     public List<User> getUsers(){
        return this.users;
     }
     public User getUserByUserName(String userName) {
         for (User user : this.users) {
             if (user.getUserName().equals(userName)) {
                 return user;
             }
         }
         return null;
     }
}
