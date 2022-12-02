# Hello World 

First impressions on Scala with this program.
Learned, mostly, the burocracy involved during the execution of a few lines of code. 

## Used commands

To start a new project with SBT
`sbt new scala/hello-world.g8`

To run the program
```sh
sbt # this will start the SBT application
~run # this will run the current project. The ~ char is optional. But it allows the automatic re-runs in case of changes on files used by the program, which acceletare the development cycle. Once execution is finished, press [Enter] to interrupt the run command and Ctrl+D to exit from sbt.
```
## Key Take Always
1) Use Linux
2) SBT is important. It's similar to Maven. As far as I can tell, This is the application that will allow running your code on development environment (and without compile).
   1) Inside the file `build.sbt` there is a lot of possibilities and it's important to keep your project up with the dependecies needed.
3) To use VsCode as your development environment, make sure you have Metals extension installed
