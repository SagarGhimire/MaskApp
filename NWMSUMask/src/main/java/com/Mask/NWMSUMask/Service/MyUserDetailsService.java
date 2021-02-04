package com.Mask.NWMSUMask.Service;

import com.Mask.NWMSUMask.Repository.UserRepository;
import com.Mask.NWMSUMask.model.Admin;
import com.Mask.NWMSUMask.model.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        System.out.println("The username is " + userName);
       Optional<Admin> user =  userRepository.findByUserName(userName); //JPA method that gets data from database
       System.out.println(user);
        //checks if user exists else throw exception
        user.orElseThrow(() -> new UsernameNotFoundException("Not Found"+ userName));
       return user.map(MyUserDetails::new).get();



    }
}
