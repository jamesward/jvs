package controllers;

import play.libs.Akka;
import play.libs.F;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.concurrent.Callable;


public class JApplication extends Controller {

    public static Result index() {
        return ok("hello, world");
    }

}
