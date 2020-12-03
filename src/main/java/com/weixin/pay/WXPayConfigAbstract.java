package com.weixin.pay;

import java.io.InputStream;

/**
 * 未实现的配置类
 *
 * @author hank
 */
public class WXPayConfigAbstract extends WXPayConfig {

    @Override
    public String getAppID() {
        return null;
    }

    @Override
    public String getMchID() {
        return null;
    }

    @Override
    public String getKey() {
        return null;
    }

    @Override
    public InputStream getCertStream() {
        return null;
    }

    @Override
    public int getHttpConnectTimeoutMs() {
        return super.getHttpConnectTimeoutMs();
    }

    @Override
    public int getHttpReadTimeoutMs() {
        return super.getHttpReadTimeoutMs();
    }

    @Override
    public WXPayDomain getWXPayDomain() {
        return null;
    }

    public String getPrimaryDomain() {
        return "api.mch.weixin.qq.com";
    }

    public String getAlternateDomain() {
        return "api2.mch.weixin.qq.com";
    }

    @Override
    public int getReportWorkerNum() {
        return 1;
    }

    @Override
    public int getReportBatchSize() {
        return 2;
    }

    @Override
    public boolean getUseSandbox() {
        return false;
    }
}
