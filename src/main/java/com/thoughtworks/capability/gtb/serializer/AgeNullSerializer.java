package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class AgeNullSerializer extends StdSerializer<Integer> {

    protected AgeNullSerializer() {
        super(Integer.class);
    }

    @Override
    public void serialize(Integer age, JsonGenerator generator, SerializerProvider provider) throws IOException {
        generator.writeNumber(0);
    }
}
