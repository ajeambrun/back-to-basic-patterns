package com.octo.Liskov;

import java.util.Locale;

public class Liskov {



    public static void main(String[] args) {

        Formatter formatters[] = {new XmlFormatter(), new TextFormatter()};

        //((AbstractFormatter) formatters[0]).prepare();
    }
}


interface Formatter {
    String format(String text);
}

abstract class AbstractFormatter implements Formatter {
    @Override
    public String format(String text) {
        return " ";
    }

    public String prepare(String text) {
        return text;
    }
}

class XmlFormatter extends AbstractFormatter {
    @Override
    public String prepare(String text) {
        return text.toLowerCase(Locale.ROOT);
    }
}

class TextFormatter implements Formatter {
    @Override
    public String format(String text) {
        return null;
    }
}






