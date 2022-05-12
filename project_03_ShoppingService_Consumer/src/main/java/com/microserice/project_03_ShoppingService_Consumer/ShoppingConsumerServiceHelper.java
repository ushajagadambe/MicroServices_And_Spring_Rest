package com.microserice.project_03_ShoppingService_Consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.List;

@RestController
@RequestMapping("/shopping")
public class ShoppingConsumerServiceHelper {

   @GetMapping("/shoppingconsumerRT")
    public ResponseEntity<String> shoppingConsumerRT() throws JsonProcessingException {
        RestTemplate restTemplate=new RestTemplate();
        String url="http://localhost:9090/billing/details";
       ResponseEntity<Billing > response= restTemplate.getForEntity(url,Billing.class);
      Billing billing= response.getBody();
      System.out.println(billing.getBill_id());
       //System.out.println(response.getStatusCode());
       return  new ResponseEntity<>("consumed", HttpStatus.OK);
    }

    @GetMapping("/shoppingconsumerHTTP")
    public ResponseEntity<String> shoppingConsumerHTTP()  {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        try
        {
            HttpGet getRequest = new HttpGet("http://localhost:9090/billing/details");
            getRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(getRequest);

            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != 200)
            {
                throw new RuntimeException("Failed with HTTP error code : " + statusCode);
            }

            HttpEntity httpEntity = response.getEntity();
            String jsonObject = EntityUtils.toString(httpEntity);


            ObjectMapper objectMapper=new ObjectMapper();
            Billing billing= objectMapper.readValue(jsonObject,Billing.class);
            System.out.println(billing.getBill_id());

            httpClient.getConnectionManager().shutdown();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            httpClient.getConnectionManager().shutdown();
        }
        return  new ResponseEntity<>("consumed", HttpStatus.OK);
    }
}
