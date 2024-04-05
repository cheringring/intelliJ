package ch32_Test;

import java.io.*;

public class WriterT implements AutoCloseable{
    private final BufferedWriter bufferedWriter;

    public WriterT(String filename) throws Exception{
        bufferedWriter = new BufferedWriter(new FileWriter(filename));

    }

    public void write(String str) throws Exception{
        bufferedWriter.write(str);
        bufferedWriter.newLine();

    }

    @Override
    public void close() throws Exception {
    }
}