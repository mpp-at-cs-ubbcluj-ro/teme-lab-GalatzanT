package tudor;

import tudor.repository.DB.RepoDBWorker;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MainBD {
    public static void main(String[] args) {

        Properties props=new Properties();
        try {
            props.load(new FileReader("lab3/db.config"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        RepoDBWorker repoDBWorker = new RepoDBWorker(props);
        repoDBWorker.findAll().forEach(System.out::println);

    }
}