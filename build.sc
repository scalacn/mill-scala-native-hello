import mill._, scalalib._, scalanativelib._

object hello extends ScalaNativeModule {
  def scalaVersion = "2.13.8"
  def scalaNativeVersion = "0.4.4"
}
