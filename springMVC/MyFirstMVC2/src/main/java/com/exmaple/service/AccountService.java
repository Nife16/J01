package com.exmaple.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exmaple.entity.Account;

@Service
public class AccountService {

    List<Account> signUpAccounts = new ArrayList<Account>();


    public void signUp(Account account) {
        signUpAccounts.add(account);
    }

    public Account signIn(Account account) {

        for (int i = 0; i < signUpAccounts.size(); i++) {

            if(signUpAccounts.get(i).getEmail().equals(account.getEmail()) &&
                signUpAccounts.get(i).getPassword().equals(account.getPassword())) {

                return signUpAccounts.get(i);

            }
            
        }

        return null;

    }
    
}
