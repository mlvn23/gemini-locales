package test

import better.files._

object App {

    def main(args: Array[String]): Unit = {
    
        for {
           tempFile <- File.temporaryFile()
        } {
            println(tempFile)
        }
    }
    
}
