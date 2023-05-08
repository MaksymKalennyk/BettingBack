package com.example.betting.controllers;

import com.example.betting.models.Account;
import com.example.betting.service.UserService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class AccountController {

    private final UserService userService;

    public AccountController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public String updateUserEmail(@RequestBody UserRequest userRequest) {
        userService.updateUserEmail(userRequest.getNickname(), userRequest.getEmail());
        return userRequest.getEmail();
    }

    @PostMapping("/users/phone")
    public int updateUserPhone(@RequestBody UserRequest userRequest) {
        userService.updateUserPhone(userRequest.getNickname(), userRequest.getPhone());
        return userRequest.getPhone();
    }

    @PostMapping("/users/name")
    public String updateUserName(@RequestBody UserRequest userRequest) {
        userService.updateUserName(userRequest.getNickname(), userRequest.getName());
        return userRequest.getName();
    }

    @PostMapping("/users/card")
    public int updateUserCardNumber(@RequestBody UserRequest userRequest) {
        userService.updateCardNumber(userRequest.getNickname(), userRequest.getCardNumber());
        return userRequest.getCardNumber();
    }

    @PostMapping("/users/nickname")
    public void addNicknameToAccount(@RequestBody UserRequest userRequest){
        userService.copyToAccount(userRequest.getNickname());
    }

    @PostMapping("/users/amount")
    public int updateAmount(@RequestBody UserRequest userRequest) {
        userService.updateAmount(userRequest.getNickname(), userRequest.getAmountOfMoney());
        return userRequest.getAmountOfMoney();
    }

    @GetMapping("/get/users")
    public Account getEmail(@RequestParam("nickname") String nickname) {
        return userService.getUserByNickname(nickname);
    }

    public static class UserRequest {
        private String email;
        private String nickname;
        private int phone;
        private String name;
        int cardNumber;
        int amountOfMoney;

        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        public String getNickname() {
            return nickname;
        }
        public void setNickname(String nickname) {
            this.nickname = nickname;
        }
        public int getPhone() {
            return phone;
        }
        public void setPhone(int phone) {
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(int cardNumber) {
            this.cardNumber = cardNumber;
        }

        public int getAmountOfMoney() {
            return amountOfMoney;
        }

        public void setAmountOfMoney(int amountOfMoney) {
            this.amountOfMoney = amountOfMoney;
        }
    }

}
