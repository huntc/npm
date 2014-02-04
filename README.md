npm
===

This is a JVM wrapper around the [Node Package Manager (NPM)](http://npmjs.org).
The NPM that is run is the real NPM. The [JS Engine project](http://githubc.com/typesafe/js-engine) is
used to execute NPM either using [Trireme](https://github.com/apigee/trireme#trireme)
(a Node API implementation) or [Node](http://nodejs.org) itself.

A [WebJar](http://www.webjars.org/) is used to download the NPM source files.