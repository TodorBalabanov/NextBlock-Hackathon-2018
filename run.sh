#!/bin/bash
javac -cp ./:commons-codec-1.9.jar:httpclient-cache-4.5.2.jar:commons-logging-1.2.jar:httpclient-win-4.5.2.jar:encog-core-3.4.jar:httpcore-4.4.4.jar:fluent-hc-4.5.2.jar:httpmime-4.5.2.jar:httpclient-4.5.2.jar:json-20180813.jar Main.java
java -cp ./:commons-codec-1.9.jar:httpclient-cache-4.5.2.jar:commons-logging-1.2.jar:httpclient-win-4.5.2.jar:encog-core-3.4.jar:httpcore-4.4.4.jar:fluent-hc-4.5.2.jar:httpmime-4.5.2.jar:httpclient-4.5.2.jar:json-20180813.jar Main
