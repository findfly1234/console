package com.allcheer.bpos.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.net.util.Base64;

import java.io.UnsupportedEncodingException;
import java.security.SignatureException;

/**
 * Created by fireWorks on 2016/7/25.
 */
public class MD5ZX {

//    public static void main(String[] args) {
//        String str = "attach=附加信息&bank_type=ICBC_FP&charset=UTF-8&coupon_fee=0&fee_type=1&mch_id=001075562100008&nonce_str=7e158509216bb7c3aa4cf72165af043a&out_trade_no=1409543900454&pay_result=0&result_code=0&sign_type=MD5&status=0&time_end=20140901115747&total_fee=1&trade_type=pay.weixin.scancode&transaction_id=001075562100008201409010000129&version=1.0";
//        System.out.println(MD5ZX.sign(str, "&key=e1cf0ddcf6b47b59c351565d8ad717af", "utf-8"));
//
//    }

    /**
     * 签名字符串
     * @param text 需要签名的字符串
     * @param key 密钥
     * @param input_charset 编码格式
     * @return 签名结果
     */
    public static String sign(String text, String key, String input_charset) {
        text = text + key;
        System.out.println(text);
        return DigestUtils.md5Hex(getContentBytes(text, input_charset));
    }

    /**
     * 签名字符串
     * @param text 需要签名的字符串
     * @param input_charset 编码格式
     * @return 签名结果
     */
    public static String signHy(String text, String input_charset) {
        System.out.println(text);
        return DigestUtils.md5Hex(getContentBytes(text, input_charset));
    }

    /**
     * 签名字符串
     * @param text 需要签名的字符串
     * @param sign 签名结果
     * @param key 密钥
     * @param input_charset 编码格式
     * @return 签名结果
     */
    public static boolean verify(String text, String sign, String key, String input_charset) {
        text = text + key;
        String mysign = DigestUtils.md5Hex(getContentBytes(text, input_charset));
        if(mysign.equals(sign)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * @param content
     * @param charset
     * @return
     * @throws SignatureException
     * @throws UnsupportedEncodingException
     */
    private static byte[] getContentBytes(String content, String charset) {
        if (charset == null || "".equals(charset)) {
            return content.getBytes();
        }
        try {
            return content.getBytes(charset);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("MD5签名过程中出现错误,指定的编码集不对,您目前指定的编码集是:" + charset);
        }
    }

    public static void main(String args[]) {
        try {

            String md5String = signHy("lepos" + "17B10781A8C5178870197906F71749D8" + "{\"base\":{\"area\":\"宝安\",\"address\":\"深圳宝安区新区大道1102\",\"name\":\"马鑫\",\"merchantType\":1,\"province\":\"广东省\",\"merchantName\":\"马鑫\",\"idcard\":\"650102198611294016\",\"city\":\"深圳市\",\"mobile\":\"13999861129\"},\"account\":{\"cardId\":\"6222023002016366513\",\"holder\":\"马鑫\",\"branch\":\"中国工商银行股份有限公司乌鲁木齐人民路支行\",\"unionpay\":\"102881002129\",\"type\":1,\"mobile\":\"13999861129\"}}","UTF-8");
            String result = Base64.encodeBase64String(md5String.getBytes());
            System.out.print(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
