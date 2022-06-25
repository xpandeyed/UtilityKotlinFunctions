import java.time.LocalDate

fun dateTime(){
    val month = LocalDate.now().month.toString()
    println(month)
    val prevMonth= LocalDate.now().minusMonths(1).month.toString()
    println(LocalDate.now().minusMonths(6).monthValue.toString())
    println(prevMonth)
    val year = LocalDate.now().year.toString()
    println(year)
    val day = LocalDate.now().dayOfMonth
    println(day)
    val prevYear = LocalDate.now().minusYears(1).year.toString()
    println(prevYear)
    val dayOfTheWeek = LocalDate.now().dayOfWeek
    println(dayOfTheWeek)
    val prevDay = LocalDate.now().minusDays(1).dayOfWeek

}