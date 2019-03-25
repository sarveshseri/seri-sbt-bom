package sbtbom

import sbt._

object BomPlugin extends AutoPlugin {

  override val trigger: PluginTrigger = noTrigger

  object autoImport extends BomKeys

  import autoImport._

}
