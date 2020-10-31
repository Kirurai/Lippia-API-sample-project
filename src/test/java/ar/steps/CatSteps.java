package ar.steps;

import api.config.EntityConfiguration;
import api.model.Categories;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import cucumber.api.java8.En;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.lang.reflect.InvocationTargetException;

public class CatSteps extends PageSteps {


    @When("^realizo una petición '(.*)' a '(.*)' al endpoint de categorias - '(.*)'$")
    public void seEjecutaLaOperation(String op, String entity, String req)
            throws IllegalArgumentException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        EntityConfiguration.valueOf(entity)
                .getEntityService()
                .getMethod(op.toLowerCase(), String.class)
                .invoke("", req);
    }

    @Then("^obtengo el status code '(.*)'$")
    public void obtengoElStatusCode(String expCode) {
        int statusCode = APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(statusCode, Integer.parseInt(expCode) );
    }

    @And("los datos son correctos")
    public void losDatosSonCorrectos() {
        Categories[] categories = (Categories[]) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(categories.length, 7);
    }

    @When("^realizo una petición '(.*)' a '(.*)' al endpoint de analisis - '(.*)'$")
    public void realizoUnaAnalysisRequest(String op, String entity, String req)
            throws NoSuchMethodException, InvocationTargetException, IllegalArgumentException, IllegalAccessException{
        EntityConfiguration.valueOf(entity)
                .getEntityService()
                .getMethod(op.toLowerCase(), String.class)
                .invoke("", req);
    }

    @When("^realizo una petición '(.*)' a '(.*)' al endpoint de razas - '(.*)'$")
    public void realizoUnaBreedsRequest(String op, String entity, String req)
            throws NoSuchMethodException, InvocationTargetException, IllegalArgumentException, IllegalAccessException{
        EntityConfiguration.valueOf(entity)
                .getEntityService()
                .getMethod(op.toLowerCase(), String.class)
                .invoke("", req);
    }

    @When("realizo una petición '(.*)' a '(.*)' al endpoint de images id - '(.*)'$")
    public void realizoImagesIdRequest(String op, String entity, String req)
            throws NoSuchMethodException, InvocationTargetException, IllegalArgumentException, IllegalAccessException{
        EntityConfiguration.valueOf(entity)
                .getEntityService()
                .getMethod(op.toLowerCase(), String.class)
                .invoke("", req);
    }
}
