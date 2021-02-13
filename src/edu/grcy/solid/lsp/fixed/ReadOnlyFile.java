package edu.grcy.solid.lsp.fixed;

import java.io.IOException;
import java.nio.CharBuffer;

public class ReadOnlyFile implements FileReadable {

    @Override
    public byte[] read() {
        System.out.println("Klasa ReadOnlyFIle implementuje tylko eden interfejs");
        return new byte[0];
    }
}
