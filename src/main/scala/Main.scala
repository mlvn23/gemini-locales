package test

//import java.time.format.DateTimeFormatter
import java.util.Locale

object App {
    def main(args: Array[String]): Unit = {
    
        println(s"The default locale is=|${Locale.getDefault}| lang=|${Locale.getDefault.getLanguage}|")
    
        Locale.setDefault(Locale.US)    
        println(s"US locale is=|${Locale.getDefault}| lang=|${Locale.getDefault.getLanguage}|")
        
        Locale.setDefault(Locale.ENGLISH)    
        println(s"EN locale is=|${Locale.getDefault}| lang=|${Locale.getDefault.getLanguage}|")
        
    }
}
