package com.myresume.api.user.service;

import com.myresume.api.user.entity.UserEntity;
import com.myresume.api.user.model.CreateUserModel;
import com.myresume.api.user.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserEntity createUser(CreateUserModel userModel) {
        userModel.setPassword(bCryptPasswordEncoder.encode(userModel.getPassword()));
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity userEntity = modelMapper.map(userModel, UserEntity.class);
        userRepository.save(userEntity);
        return userEntity;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<UserEntity> user = Optional.ofNullable(userRepository.findByEmail(email));
        user.orElseThrow(() -> new UsernameNotFoundException(email));
        return new User(user.get().getEmail(), user.get().getPassword(), true, true, true, true, new ArrayList<>());
    }

    @Override
    public UserEntity getUserByEmail(String email) {
        Optional<UserEntity> user = Optional.ofNullable(userRepository.findByEmail(email));
        return user.orElseThrow(() -> new UsernameNotFoundException(email));
    }
}
