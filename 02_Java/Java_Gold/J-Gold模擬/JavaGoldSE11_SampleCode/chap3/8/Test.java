import java.io.*;
import java.sql.*;

class Super { void method() throws IOException { } }

class SubA extends Super { 
             void method() { } }
class SubB extends Super { 
             void method() throws FileNotFoundException { } }
class SubC extends Super { 
             void method() throws Exception { } }
class SubD extends Super { 
             void method() throws SQLException { } }
class SubE extends Super { 
             void method() throws RuntimeException { } }
