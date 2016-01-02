import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Leo on 1/1/2016.
 */

public class JsonPost {
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<Item> update(@RequestBody Item item) {
        return new  ResponseEntity<>(item, HttpStatus.OK);
    }
}
