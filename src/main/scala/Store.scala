trait Store {
  def store(message:SymptomReport)
  def store(message:DiseaseReport)
  def store(message:EpidemicAlert)
}
