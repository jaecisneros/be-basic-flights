package com.despegar.exercise.be.basic.util;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JacksonUtils {
    private static Logger LOGGER = LoggerFactory.getLogger(JacksonUtils.class.getName());


    public static Object convertStringToJson(String json, Class<?> claz) {
        ObjectMapper mapper = new ObjectMapper();
        mapper = new ObjectMapper().configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            return mapper.readValue(json, claz);
        } catch (Exception e) {
            LOGGER.error("Exception: ", e);
        }
        return null;
    }

    public static Object convertStringToJson(String json, CollectionType collection) {
        ObjectMapper mapper = new ObjectMapper();
        mapper = new ObjectMapper().configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            return mapper.readValue(json, collection);
        } catch (Exception e) {
            LOGGER.error("Exception: ", e);
        }
        return null;
    }

    public static String convertJsonToString(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(object);
        } catch (Exception e) {
            LOGGER.error("Exception: ", e);
        }
        return null;
    }
}
