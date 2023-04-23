package HW3;

import HW3.generated.GreenhouseType;
import HW3.generated.PlantType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        try {
            File file = new File("C:\\Users\\Artur\\IdeaProjects\\HW3WebServices\\src\\main\\java\\HW3\\greenhouse.xml");

            JAXBContext context = JAXBContext.newInstance(GreenhouseType.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            InputStream inputStream = new FileInputStream(file);

            GreenhouseType greenhouse = unmarshaller.unmarshal(new StreamSource(inputStream), GreenhouseType.class).getValue();
            greenhouse.show();

        }catch (JAXBException e)
        {
            e.printStackTrace();
        }

    }
}