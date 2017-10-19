package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String Str, PoemDecorator stringToDecorate) {
        String result = stringToDecorate.decorate(Str);
        result = "*** Pani Twardowska ***\n" + result +"\n...to be continued";
        System.out.println(result);
    }
}
