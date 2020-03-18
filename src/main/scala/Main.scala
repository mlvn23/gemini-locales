package test

import java.time._
import java.time.format.DateTimeFormatter
import java.util.Locale

object App {
    def main(args: Array[String]): Unit = {
    
       def test(title: String): Unit = {
          val MONTH_FMT = DateTimeFormatter.ofPattern("MMM yyy")
          println(s"${title} locale is=|${Locale.getDefault}| lang=|${Locale.getDefault.getLanguage}| MONTH=${LocalDate.of(2019, 11, 1).format(MONTH_FMT)}")
       }
       
       test("default")
    
       Locale.setDefault(Locale.US)
       test("US")
        
       Locale.setDefault(Locale.ENGLISH)
       test("ENGLISH")        
        
    }
}
