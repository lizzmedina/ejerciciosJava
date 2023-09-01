package org.example.ejerciciosPatronesSebastian.singleton;

import java.util.List;

public class MainSingleton {
    public static void main(String[] args) {
        UserRegistry userRegistry = UserRegistry.getInstance();

        User user1 = new User("usuario1", "usuario1@example.com", "contraseña1");
        User user2 = new User("usuario2", "usuario2@example.com", "contraseña2");

        userRegistry.addUser(user1);
        userRegistry.addUser(user2);

        List<User> users = userRegistry.getUsers();
        for (User user : users) {
            System.out.println("Nombre de usuario: " + user.getUserName());
            System.out.println("Correo electrónico: " + user.getEmail());
            System.out.println();
        }

        String usernameToFind = "usuario1";
        User foundUser = userRegistry.getUserByUserName(usernameToFind);
    }
}
