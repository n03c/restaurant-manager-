package com.aldrin.cafsysv2.util;

import com.aldrin.cafsysv2.model.UserAccount;

public class LoginUser {
    private static UserAccount userAccount;

    /**
     * @return the userAccount
     */
    public static UserAccount getUserAccount() {
        return userAccount;
    }

    /**
     * @param aUserAccount the userAccount to set
     */
    public static void setUserAccount(UserAccount aUserAccount) {
        userAccount = aUserAccount;
    }
}
