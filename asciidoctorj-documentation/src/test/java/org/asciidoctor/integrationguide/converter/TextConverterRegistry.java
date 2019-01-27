package org.asciidoctor.integrationguide.converter;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.ruby.converter.spi.ConverterRegistry;

public class TextConverterRegistry implements ConverterRegistry {
    @Override
    public void register(Asciidoctor asciidoctor) {

        asciidoctor.javaConverterRegistry().register(TextConverter.class);

    }
}
