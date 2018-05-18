package timeusage


/**
  * Models a row of the summarized data set
  * @param working Working status (either "working" or "not working")
  * @param sex Sex (either "male" or "female")
  * @param age Age (either "young", "active" or "elder")
  * @param primaryNeeds Number of daily hours spent on primary needs
  * @param work Number of daily hours spent on work
  * @param other Number of daily hours spent on other activities
  */
case class TimeUsageRow(working: String,
                        sex: String,
                        age: String,
                        primaryNeeds: Double,
                        work: Double,
                        other: Double) {
  require(Set("working", "not working").contains(working))
  require(Set("male", "female").contains(sex))
  require(Set("young", "active", "elder").contains(age))
}
