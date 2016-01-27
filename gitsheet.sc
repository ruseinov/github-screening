import scala.sys.process._
import java.io.File

val sep = sys.props("line.separator")

val res = Process(
  "git branch -a --color=never",
  new File("/Users/lazycoder/projects/jquery-pjax")
).lineStream

//res.foldLeft("")((a, b) => a + sep + b)
println(res.mkString(sep))

