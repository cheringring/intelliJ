package ch32_Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class ReaderT implements AutoCloseable{
    private final BufferedReader bufferedReader;

    public ReaderT(String filename) throws Exception{
        bufferedReader = new BufferedReader(new FileReader(filename));

        }

        public String read() throws Exception{
        return bufferedReader.readLine();

    }

    public List<String> getDatas() throws Exception{
        String data;
        var datas =new ArrayList<String>();
        while ((data =bufferedReader.readLine())!= null){
            datas.add(data.trim());
        }
        return datas;
    }

    @Override
    public void close() throws Exception {
        bufferedReader.close();
    }
}

class AppUI{
    private  String ram;
    private  String cpu;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public static void main(String[] args) {
        try(WriterT writerT = new WriterT("sys.ini")) {
            writerT.write("ram=20m");
            writerT.write("cpu= 4core");

        }catch (Exception e){
            e.printStackTrace();
        }


        var app =  new AppUI();

        try (ReaderT readerT = new ReaderT("sys.ini")){
            var datas = readerT.getDatas();

            for (var d: datas){

                var value = d.split("=");

                if(value[0].equals("ram"))
                    app.setRam(value[1]);

                else app.setCpu(value[1]);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(app);
    }

    @Override
    public String toString() {
        return "AppUI{" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}