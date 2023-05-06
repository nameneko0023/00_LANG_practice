@echo off

cd /d %~dp0
echo test1

call test2.bat

echo %errorlevel%

exit /b