package de.inetsoftware.jwebassembly.jawa.tests.unit;

import de.inetsoftware.jwebassembly.api.annotation.Export;
import de.inetsoftware.jwebassembly.jawa.tests.RunTest;

import static de.inetsoftware.jwebassembly.jawa.util.Print.puts;

@RunTest(input = "", intInput = 0, output = "true")
@RunTest(input = "", intInput = 41, output = "false")
public class ne02 {
    static boolean m(int a) {
        int b = 41;
        return a != b;
    }

    @Export
    public static void main(String[] args) {
        if (m(args.length)) puts("true");
        else puts("false");
    }
}