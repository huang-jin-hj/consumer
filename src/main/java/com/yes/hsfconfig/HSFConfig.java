package com.yes.hsfconfig;

import com.hjhsf.ConsumerConfig;
import com.hjhsf.HJHSFConsumer;
import com.provider.hsfclient.Provider;
import org.springframework.context.annotation.Configuration;

/**
 * Created by huangJin on 2023/5/19.
 */
@ConsumerConfig
public class HSFConfig {
    @HJHSFConsumer(serviceName = "provider-service")
    Provider provider;
}
