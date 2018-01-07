package com.sglabs.medistant.lib;

import java.net.CookieManager;
import java.net.CookiePolicy;

public class HTTPManager {
    protected CookieManager cookieManager;

    public HTTPManager() {
        this.cookieManager = new CookieManager();

        this.cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
    }
}
