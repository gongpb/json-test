package com.gongpb.ad.fastjson;

import com.alibaba.fastjson.serializer.SerializerFeature;

public class FastJsonUtil {
	public static final SerializerFeature[] features = { SerializerFeature.WriteMapNullValue, // 输出空置字段 
        SerializerFeature.WriteNullListAsEmpty, // list字段如果为null，输出为[]，而不是null 
        SerializerFeature.WriteNullNumberAsZero, // 数值字段如果为null，输出为0，而不是null 
        SerializerFeature.WriteNullBooleanAsFalse, // Boolean字段如果为null，输出为false，而不是null 
        SerializerFeature.WriteNullStringAsEmpty // 字符类型字段如果为null，输出为""，而不是null 
	};
}
