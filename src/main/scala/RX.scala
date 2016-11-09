import akka.http.scaladsl.server.{Directives, Route}

class RX extends Directives with JsonSupport {
  val route = {
    logRequestResult("disease-report-rx") {
      get {
        pathSingleSlash {
          complete("hello")
        }
      } ~ post {
        entity(as[DiseaseReport]) { diseaseReport =>
          complete(s"Stored disease")
        }
      } ~ post {
        entity(as[SymptomReport]) { symptomReport =>
          complete(s"Stored disease")
        }
      }
    }
  }
}