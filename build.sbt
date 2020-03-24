import sbtcrossproject.CrossPlugin.autoImport.{CrossType, crossProject, _}
import sbt.Project.{projectToRef => Ref}

lazy val demo = crossProject(JVMPlatform, JSPlatform)
    .crossType(CrossType.Full)
    .in(file("demo"))

lazy val demoJVM = demo.jvm
    
lazy val server = project.in(file("server"))
    .enablePlugins(SbtWeb, PlayScala)
    .disablePlugins(PlayLayoutPlugin)
    .dependsOn(demoJVM)

