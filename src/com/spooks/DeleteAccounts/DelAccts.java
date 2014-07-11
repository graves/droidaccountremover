package com.spooks.DeleteAccounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class DelAccts extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void del(View view) {
        // Do something in response to button
        AccountManager am = AccountManager.get(this);
        Account[] accounts = am.getAccounts();
        if (accounts.length > 0) {
            Account accountToRemove = accounts[0];
            am.removeAccount(accountToRemove, null, null);
        }
    }
}
