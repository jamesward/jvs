package controllers

import play.api._
import play.api.mvc._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object SApplication extends Controller {
  
  def index = Action {
    Ok("hello, world")
  }
  
}