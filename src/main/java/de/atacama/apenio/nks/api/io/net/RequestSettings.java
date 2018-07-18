package de.atacama.apenio.nks.api.io.net;

import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class RequestSettings {

    private enum RequestMethod {
        GET, POST, HEAD, OPTIONS, PUT, DELETE, TRACE
    }

    private Map<String,String> properties = new HashMap<>();

    private int readTimeout = 10000;

    private int connectionTimeout = 15000;

    private boolean doOutput = true;

    private boolean doInput = true;

    private RequestMethod method;

    private Charset charset = StandardCharsets.UTF_8;

    public void putProperity(String key, String value){
        properties.put(key,value);
    }

    public void appendSettings(HttpURLConnection connection) throws ProtocolException {
        connection.setReadTimeout(readTimeout);
        connection.setConnectTimeout(connectionTimeout);
        connection.setDoOutput(doOutput);
        connection.setDoInput(doInput);
        connection.setRequestMethod(method.name());
        for(Map.Entry<String,String> entry : properties.entrySet()){
           connection.setRequestProperty(entry.getKey(),entry.getValue());
        }
    }

    public void setAcceptCharset(){
        putProperity("Accept-Charset",charset.name());
    }

    public void setContentTypeUrlEncodedForm(){
        putProperity("Content-Type","application/x-www-form-urlencoded;charset=" + charset.name());
    }

    public void setContentTypeJson(){
        putProperity("Content-Type","application/json;charset=" + charset.name());
    }

    public static RequestSettings getStandardJsonSettings(){
        RequestSettings settings = new RequestSettings();
        settings.setContentTypeJson();
        settings.setAcceptCharset();
        return settings;

    }

    public RequestSettings asPOST(){
        this.method = RequestMethod.POST;
        return this;
    }

    public RequestSettings asGET(){
        this.method = RequestMethod.GET;
        return this;
    }

    public RequestSettings asPUT(){
        this.method = RequestMethod.PUT;
        return this;
    }

    public RequestSettings asDELETE(){
        this.method = RequestMethod.DELETE;
        return this;
    }

    public Charset getCharset() {
        return charset;
    }
}
