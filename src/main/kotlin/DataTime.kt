import java.time.LocalDate
import java.time.temporal.ChronoUnit

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
    println(LocalDate.now())
    var date = LocalDate.parse(LocalDate.now().toString())
    println(date)
    date = date.minusDays(2)
    println(date)

    val l1 = LocalDate
        .parse("2018-12-06")

    val l2 = LocalDate
        .parse("2018-10-25")

    val result = l1.until(
        l2,
        ChronoUnit.DAYS
    )

    println(result)

}