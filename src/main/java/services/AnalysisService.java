package services;

import api.model.Analysis;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class AnalysisService extends MethodsService {

    public static Response post (String req){
        return post(req, Analysis.class);
    }
}
