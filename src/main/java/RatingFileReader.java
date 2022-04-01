import java.io.*;

public class RatingFileReader {

    private BufferedReader bufferedReader;

    public RatingFileReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public String readLineOfFile() throws IOException  {
        return bufferedReader.readLine();
    }

}


