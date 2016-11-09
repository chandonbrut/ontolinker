import akka.http.scaladsl.server.{Directives, Route}

class RX extends Directives with JsonSupport {
  val route = {
    logRequestResult("disease-report-rx") {
      get {
        pathPrefix("disease") {
          complete(DiseaseReport("patientId","diseaseId",0,0,0))
        }
      } ~ get {
        pathPrefix("symptom") {
          complete(SymptomReport("patientId","symptomId",0,0,0))
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