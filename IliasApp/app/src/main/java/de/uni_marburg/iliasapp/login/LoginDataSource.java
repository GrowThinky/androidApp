package de.uni_marburg.iliasapp.login;


import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.HttpResponse;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.client.HttpClient;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.client.methods.HttpGet;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.impl.client.DefaultHttpClient;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.protocol.BasicHttpContext;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.protocol.HttpContext;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public LoginResult<LoggedInUser> login(String username, String password)  {

            try {
                /*
                HttpClient httpClient = new DefaultHttpClient();
                HttpContext localContext = new BasicHttpContext();
                HttpGet httpGet = new HttpGet("https://docu.ilias.de:443/webservice/soap/server.php");
                HttpResponse response = httpClient.execute(httpGet, localContext);
                */

                // TODO: handle loggedInUser authentication
                // this is just for testing purposes
                if (!username.equals("hello")) {
                    throw new IOException("user not in database");
                }

                    LoggedInUser fakeUser =
                            new LoggedInUser(
                                    java.util.UUID.randomUUID().toString(),
                                    "user_name");
                    return new LoginResult.Success<>(fakeUser);


            } catch (Exception e) {
                return new LoginResult.Error(new IOException("Error logging in", e));
            }
        }


    public void logout() {
        // TODO: revoke authentication
    }
}