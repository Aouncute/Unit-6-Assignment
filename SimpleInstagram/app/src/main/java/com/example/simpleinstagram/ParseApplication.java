package com.example.simpleinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tybFsu9YrwZ71RmZxCsKbM8r4pou5M47vhEhzWQJ")
                .clientKey("rlls3p0ngUF0HQMNYROiOk9f57BQYe5Z0OzhCLFz")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
