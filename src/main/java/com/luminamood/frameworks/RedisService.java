package com.luminamood.frameworks;

import com.luminamood.domain.interfaces.IRedisService;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;

@Repository
public class RedisService implements IRedisService {
    private Jedis jedis;

    public RedisService(String host, int port) {
        this.jedis = new Jedis(host, port);
    }

    public void setValue(String key, String value) {
        jedis.set(key, value);
    }

    public String getValue(String key) {
        return jedis.get(key);
    }

    public void delete(String key) {
        jedis.del(key);
    }

    public void closeConnection() {
        jedis.close();
    }
}
