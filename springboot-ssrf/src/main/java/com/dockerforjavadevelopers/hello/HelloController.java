package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.net.URLConnection;


import javax.servlet.http.HttpServletRequest;


@RestController
public class HelloController {
    @GetMapping("/")
    public Map<String, String> list(@RequestHeader Map<String, String> headers){
        return headers;
    }
    
    @GetMapping("/url")
    public String getURLValue(HttpServletRequest request) throws IOException {
        String site = "http://ifconfig.me";
        String uri = request.getRequestURI();
        URL url = new URL(site + uri.toString());
        String response = getSource(url);

        return response;
    }

    private String getSource(URL url) throws IOException{
        URLConnection spoof = url.openConnection();
        StringBuffer sb = new StringBuffer();

        spoof.setRequestProperty("User-Agent", "SpringApp");
        BufferedReader in = new BufferedReader(new InputStreamReader(spoof.getInputStream()));

        String strLine = "";
        while ((strLine = in.readLine()) != null)
        {
            sb.append(strLine);
        }
        return sb.toString();
    }
}
