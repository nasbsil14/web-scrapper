import org.jsoup.Jsoup
import scala.collection.JavaConverters._

object Main {
  def main(args: Array[String]) {
    println("START")

    scraping()

    println("END")
  }

  def scraping(): Unit = {
    val doc = Jsoup.connect("http://google.com").get()
    val title = doc.title()
    println("タイトル:" + title)

    val value = doc.select("a[href]")
    value.asScala.foreach { elm =>
      println(elm.text())
      println(elm.attr("href"))
    }
  }
}
