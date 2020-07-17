case class Config(
  inputFile: String = "",
  outputDir: String = "",
  maxLines: Int = -1,
  maxBytes: Int = -1)

object Main extends App {

  val parser = new scopt.OptionParser[Config]("scopt") {
    head("scopt", "3.x")

    opt[String]("input-file").action((x, c) =>
      c.copy(inputFile = x))

    opt[String]("output-dir").required()
      .action((x, c) => c.copy(outputDir = x))

    opt[Int]("max-lines").required()
      .action((x, c) => c.copy(maxLines = x))

    opt[Int]("max-bytes").required()
      .action((x, c) => c.copy(maxLines = x))

  }

  val parsed = parser.parse(args, Config()) match {
    case Some(config) =>
      println(config)
      ???
    case None =>
  }

}
