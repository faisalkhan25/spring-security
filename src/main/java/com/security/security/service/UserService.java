package com.security.security.service;

import com.security.security.dtos.UserRequest;
import com.security.security.dtos.UserResponse;
import com.security.security.entity.User;
import com.security.security.exception.ResourceNotFoundException;
import com.security.security.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponse saveUser(UserRequest userRequest) {
        User user = new User();
        BeanUtils.copyProperties(userRequest, user);
        User savedUser = userRepository.save(user);
        return new UserResponse(savedUser.getUsername(), savedUser.getPassword());
    }

    public UserResponse getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("This User does not exist")
        );
        return new UserResponse(user.getUsername(), user.getPassword());
    }

    public void deleteUserById(Long id) {
        getUserById(id);
        userRepository.deleteById(id);
    }
}
