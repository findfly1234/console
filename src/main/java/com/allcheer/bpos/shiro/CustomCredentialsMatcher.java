package com.allcheer.bpos.shiro;

import com.allcheer.bpos.util.EncryptUtils;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.apache.shiro.crypto.hash.Sha384Hash;


/**
 * Created by fireWorks on 2016/2/25.
 */
public class CustomCredentialsMatcher extends SimpleCredentialsMatcher  {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken authcToken, AuthenticationInfo info) {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;

//        Object tokenCredentials = encrypt(String.valueOf(token.getPassword()));
        Object tokenCredentials = encrypt(String.valueOf(token.getPassword()));
        Object accountCredentials = getCredentials(info);
        //将密码加密与系统加密后的密码校验，内容一致就返回true,不一致就返回false
        return equals(tokenCredentials, accountCredentials);
    }

    //将传进来密码加密方法
    public static String encrypt(String data) {
        data = EncryptUtils.encryptMD5(data);
        String sha384Hex = new Sha384Hash(data).toBase64();
        System.out.println(data + ":" + sha384Hex);
        return sha384Hex;
//        return data;
    }
}
