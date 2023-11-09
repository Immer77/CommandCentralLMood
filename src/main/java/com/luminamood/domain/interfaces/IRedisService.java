package com.luminamood.domain.interfaces;

public interface IRedisService {
    void setValue(String key, String value);
    String getValue(String key);
    void delete(String key);
    void closeConnection();
}
