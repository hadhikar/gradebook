package com.hadhikari.userservice.service;

import com.hadhikar.database_service.model.User;
import com.hadhikar.database_service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User saveUser(User newUser){
        try{
            return userRepository.save(newUser);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<User> getUsers(){
        try{
            return userRepository.findAll();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public User updateUser(User user){
        try{
            User existingUser= userRepository.findById(user.getId()).get();
            if(existingUser != null){
                existingUser.setEmail(user.getEmail());
                existingUser.setGradeLevel(user.getGradeLevel());
                existingUser.setPhoneNumber(user.getPhoneNumber());
                return userRepository.save(existingUser);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public boolean deleteUser(long id){
        try{
            userRepository.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
