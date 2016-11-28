import akka.http.scaladsl.model.{ContentType, HttpEntity, HttpResponse, MediaTypes}
import akka.http.scaladsl.server.{Directives, Route}

class RX extends Directives with JsonSupport {
  val route = {
    logRequestResult("disease-report-rx") {
      path("disease") {
        get {
          complete(DiseaseReport("patientId","diseaseId",0,0,0))
        } ~ post {
          entity(as[DiseaseReport]) { diseaseReport =>
            complete {
              diseaseReport
            }
          }
        }
      } ~ path("symptom") {
        get {
          complete(SymptomReport("patientId","symptomId",0,0,0))
        } ~ post {
          entity(as[SymptomReport]) { symptomReport =>
//            complete(s"Stored symptom " + symptomReport)
              complete {
                symptomReport
              }
          }
        }
      }
    }
  }
}