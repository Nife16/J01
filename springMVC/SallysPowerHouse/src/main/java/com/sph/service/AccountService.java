package com.sph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sph.entity.Account;
import com.sph.entity.Address;
import com.sph.repo.AccountRepo;

@Service
public class AccountService {

    @Autowired
    AccountRepo accountRepo;

    public Account save(Account account, Address blankAddressWithId) {

        account.setAddress(blankAddressWithId);

        return accountRepo.save(account);

    }

    public Account getByEmail(String email) {

        Account account = accountRepo.getAccountByEmail(email);

        if (account == null) {
            return null;
        }

        return account;

    }

    public Account signIn(Account account) {

        Account signedInAccount = accountRepo.getAccountByEmailAndPassword(account.getEmail(), account.getPassword());

        if (signedInAccount == null) {
            return null;
        }

        return signedInAccount;

    }

    public Account getById(Integer id) {

        return accountRepo.findById(id).get();

    }

    public Account update(Account account) {

        return accountRepo.save(account);

    }

    public void deleteById(Integer id) {

        accountRepo.deleteById(id);

    }

}
