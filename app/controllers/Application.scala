package controllers

import play.api.mvc._
import play.libs.XML._

object Application extends Controller {

  def index = Action {
    Ok("OK")
  }

  def post = Action { request =>

    val body = request.body.asText.getOrElse("Not body supplied")
    val xml = fromString(body)

    Ok("OK")
  }
}
