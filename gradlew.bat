@echo off
::---------------------------------------------------------------------------
:: Gradle start up script for Windows
::---------------------------------------------------------------------------

@rem Set local scope for the variables with CMD extensions enabled
setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set GRADLE_HOME=%DIRNAME%gradle

set CLASSPATH=%GRADLE_HOME%\wrapper\gradle-wrapper.jar

java -classpath "%CLASSPATH%" org.gradle.wrapper.GradleWrapperMain %*
