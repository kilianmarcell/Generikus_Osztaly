package hu.petrik.Lotto;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LottoSzamok {

    public static void Run(){

        try {

            List<String> lista = Files.readAllLines(Paths.get("lottosz.dat"), Charset.defaultCharset());

            for (String s: lista) {
                System.out.println(s);
            }

        } catch(IOException e) {

        }

    }

}
