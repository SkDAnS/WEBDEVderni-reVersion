package fr.isen.ticketapp.interfaces.services;

import java.util.List;
import fr.isen.ticketapp.interfaces.models.UserModel;

public interface UsersService {
    List<UserModel> getAllUsers();

    UserModel getUserById(final int id);

    UserModel addUser(final UserModel user);

    boolean removeUser(final int UserId);

    UserModel updateUser(final UserModel newUser);

}
