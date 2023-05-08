package com.example.betting.service;

import com.example.betting.models.Account;
import com.example.betting.models.User;
import com.example.betting.repository.AccountRepository;
import com.example.betting.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final AccountRepository accountRepository;


    private DataSource dataSource;

    @Autowired
    public UserService(UserRepository userRepository, AccountRepository accountRepository){
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
    }

    public User addUser(User user){
        userRepository.save(user);
        return user;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public Account getUserByNickname(String nickname) {
        User user = userRepository.findByNickname(nickname);
        return user.getAccount();
    }

    public boolean authenticate(String nickname, String password) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String query = "SELECT COUNT(*) FROM users WHERE nickname=? AND password = ?";
        int count = jdbcTemplate.queryForObject(query, new Object[]{nickname}, Integer.class);
        return count == 1;
    }

    public void updateUserEmail(String nickname, String email) {
        User user = userRepository.findByNickname(nickname);
        Account account = user.getAccount();
        account.setEmail(email);
        userRepository.save(user);
    }

    public void updateUserPhone(String nickname, int phone) {
        User user = userRepository.findByNickname(nickname);
        Account account = user.getAccount();
        account.setPhone(phone);
        userRepository.save(user);
    }

    public void updateUserName(String nickname, String name) {
        User user = userRepository.findByNickname(nickname);
        Account account = user.getAccount();
        account.setName(name);
        userRepository.save(user);
    }

    public void updateCardNumber(String nickname, int cardNumber) {
        User user = userRepository.findByNickname(nickname);
        Account account = user.getAccount();
        account.setCardNumber(cardNumber);
        userRepository.save(user);
    }

    public void copyToAccount(String nickname) {
        Account account = new Account();
        User user = userRepository.findByNickname(nickname);
        account.setUser(user);
        accountRepository.save(account);
    }

    public void updateAmount(String nickname, int amountOfMoney) {
        User user = userRepository.findByNickname(nickname);
        System.out.println(user);
        Account account = user.getAccount();
        account.setAmountOfMoney(amountOfMoney);
        userRepository.save(user);
    }
}

