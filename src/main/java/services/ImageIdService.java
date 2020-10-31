package services;

import api.model.Breed;
import api.model.ImageId;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class ImageIdService extends MethodsService {

    public static Response get (String jsonName){
        return get(jsonName, ImageId.class);
    }
}
