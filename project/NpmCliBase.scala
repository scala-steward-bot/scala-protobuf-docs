import sbt._
import sbt.complete.Parser
import scala.sys.process.ProcessBuilder

object NpmCliBase extends NpmCliBase

trait NpmCliBase {
  val nodeBin = file("node_modules/.bin/")

  val srcDir = file("src")
  def srcMarkdowns = srcDir.listFiles("*.md")

  val bookBuildDir = file("honkit")
  val compiledSrcDir = bookBuildDir

  val testDir = file("test")

  protected def rawStringArg(argLabel: String = "<arg>"): Parser[String] = {
    Def.spaceDelimited(argLabel).map(_.mkString(" "))
  }

  def printRun(p: ProcessBuilder) : Unit = {
    p.lineStream foreach println
  }
}
