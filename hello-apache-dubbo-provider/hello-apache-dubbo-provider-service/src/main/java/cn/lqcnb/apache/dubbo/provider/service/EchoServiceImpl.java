package cn.lqcnb.apache.dubbo.provider.service;

import cn.lqcnb.apache.dubbo.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String msg) {
        return "Echo hello "+msg;
    }
}
